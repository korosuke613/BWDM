package bwdm.boundaryValueAnalysisUnit;

import bwdm.informationStore.InformationExtractor;
import bwdm.informationStore.Node;
import bwdm.informationStore.IfNode;
import bwdm.Util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;


public class ExpectedOutputDataGenerator {

	private InformationExtractor ie;
	private ArrayList<String> expectedOutputDataList;

	ExpectedOutputDataGenerator(InformationExtractor _ie,
                                IfNode _root,
                                ArrayList<HashMap<String, Long>> _inputDataList) {
		this.ie = _ie;
		expectedOutputDataList = new ArrayList<>();

		//inputData:seq of HashMapの各要素に入力データを挿入
		_inputDataList.forEach(inputData -> extractExpectedOutputDataRecursively(_root, inputData));

		//各要素が型の範囲外の値だった場合、Undefined Actionを期待出力にする
		makeExpectedOutputDataofOutoftype(_inputDataList);


	}

	ArrayList<String> getExpectedOutputDataList() {
		return expectedOutputDataList;
	}

	//条件式は両辺のうち片方のみ変数が含まれているという制約付き
    private void extractExpectedOutputDataRecursively(Node _node, HashMap<String, Long> _inputData) {

		if (_node.isIfNode) { //IfNodeである場合
			HashMap<String, String> parsedCondition = makeParsedCondition(_node.getConditionOrReturnStr());

			//各条件式には一つの変数(parameter)しか登場しない
			ie.getParameters().forEach(prm -> {
				//条件式中の変数とprmが一致したらinputDataを代入して真偽判定
				if (parsedCondition.get("right").equals(prm) || parsedCondition.get("left").equals(prm)) {
					boolean conditionJudgeResult = judge(parsedCondition, _inputData, prm);

					//判定結果がTRUEならばifNodeのtrueNodeに進んで再帰
					if (conditionJudgeResult) {
						extractExpectedOutputDataRecursively(Objects.requireNonNull(((IfNode) _node).getConditionTrueNode()), _inputData);
					} else { //判定結果がFalseならばifNodeのfalseNodeに進んで再帰
						extractExpectedOutputDataRecursively(
								Objects.requireNonNull(((IfNode) _node).getConditionFalseNode()),
								_inputData
						);
					}
				}
			});
		} else { //returnNodeである場合
			String returnStr = _node.getConditionOrReturnStr();
			expectedOutputDataList.add(returnStr);
		}

	}

	public static HashMap<String, String> makeParsedCondition(String _condition) {
		HashMap<String, String> parsedCondition = new HashMap<>();
		String operator = Util.getOperator(_condition);
		int indexOfoperator = _condition.indexOf(operator);

		parsedCondition.put("left", _condition.substring(0, indexOfoperator));
		parsedCondition.put("operator", operator);
		InformationExtractor.Companion.modJudge(_condition, operator, indexOfoperator, parsedCondition);
		return parsedCondition;
	}

	private boolean judge(HashMap<String, String> _parsedCondition,
						  HashMap<String, Long> _inputData,
						  String _parameter) {
		boolean result;

		if (Util.isNumber(_parsedCondition.get("left"))) { //右辺が変数
			if (_parsedCondition.get("operator").equals("mod")) {
				result = judgeMod(
						Long.valueOf(_parsedCondition.get("left")), //左辺：数字
                        _inputData.get(_parameter), //右辺：変数
						Long.valueOf(_parsedCondition.get("surplus"))
				);
			} else {
				result = judgeInequality(
						Long.valueOf(_parsedCondition.get("left")), //左辺：数字
						_parsedCondition.get("operator"),
                        _inputData.get(_parameter) //右辺：変数
				);
			}
		} else { //左辺が変数
			if (_parsedCondition.get("operator").equals("mod")) {
				result = judgeMod(
                        _inputData.get(_parameter), //左辺：変数
						Long.valueOf(_parsedCondition.get("right")), //右辺：数字
						Long.valueOf(_parsedCondition.get("surplus"))
				);
			} else {
				result = judgeInequality(
                        _inputData.get(_parameter), //左辺：変数
						_parsedCondition.get("operator"),
						Long.valueOf(_parsedCondition.get("right"))//右辺：数字
				);
			}

		}

		return result;
	}

	private boolean judgeMod(Long _leftHand, Long _rightHand, Long _surplus) {
		return _leftHand % _rightHand == _surplus;
	}

	private boolean judgeInequality(Long _leftHand, String _operator, Long _rightHand) {
		boolean returnBool;
        switch (_operator) {
            case "<":
                returnBool = _leftHand < _rightHand;
                break;
            case ">":
                returnBool = _leftHand > _rightHand;
                break;
            case "<=":
                returnBool = _leftHand <= _rightHand;
                break;
            case ">=":
                returnBool = _leftHand >= _rightHand;
                break;
            default:
                returnBool = true;
                break;
        }
		return returnBool;
	}


	private void makeExpectedOutputDataofOutoftype(ArrayList<HashMap<String, Long>> _inputDataList) {

		for (int i = 0; i < _inputDataList.size(); i++) {
			HashMap<String, Long> currentInputData = _inputDataList.get(i);

			for (int j = 0; j < ie.getParameters().size(); j++) {
				String currentTyp = ie.getArgumentTypes().get(j);
				String currentPrm = ie.getParameters().get(j);
				long currentVl = currentInputData.get(currentPrm);

				switch (currentTyp) {
					case "int":
						if (currentVl == BoundaryValueAnalyzer.intMax + 1 ||
								currentVl == BoundaryValueAnalyzer.intMin - 1) {
							expectedOutputDataList.set(i, "Undefined Action");
						}
						break;
					case "nat":
						if (currentVl == BoundaryValueAnalyzer.natMax + 1 ||
								currentVl == BoundaryValueAnalyzer.natMin - 1) {
							expectedOutputDataList.set(i, "Undefined Action");
						}
						break;
					case "nat1":
						if (currentVl == BoundaryValueAnalyzer.nat1Max + 1 ||
								currentVl == BoundaryValueAnalyzer.nat1Min - 1) {
							expectedOutputDataList.set(i, "Undefined Action");
						}
						break;
					default:
						//nothing to do
				}

			}
		}

	}
}