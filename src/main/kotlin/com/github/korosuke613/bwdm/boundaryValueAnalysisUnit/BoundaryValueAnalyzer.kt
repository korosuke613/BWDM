package com.github.korosuke613.bwdm.boundaryValueAnalysisUnit

import com.github.korosuke613.bwdm.Analyzer
import com.github.korosuke613.bwdm.Util
import com.github.korosuke613.bwdm.informationStore.FunctionDefinition
import com.github.korosuke613.pict4java.Factor
import com.github.korosuke613.pict4java.Model
import com.github.korosuke613.pict4java.Pict
import java.util.*
import java.util.stream.Collectors

class BoundaryValueAnalyzer
(functionDefinition: FunctionDefinition, isPairwise: Boolean = true) : Analyzer<Long>(functionDefinition) {
    val boundaryValueList: HashMap<String, ArrayList<Long>> = HashMap()

    init {
        functionDefinition.parameters.forEach { p -> boundaryValueList[p] = ArrayList() }
        generateTypeBoundaryValue()
        generateIfConditionalBoundaryValue()
        val parameters = functionDefinition.parameters
        for (i in 0 until boundaryValueList.size) {
            val parameter = parameters[i]
            var bvs = boundaryValueList[parameter]!!
            bvs = bvs.stream().distinct().collect(Collectors.toList()) as ArrayList<Long>

            boundaryValueList[parameter] = bvs
        }
        if (isPairwise) {
            makeInputDataListWithPairwise()
        } else {
            makeInputDataList()
        }
    }

    private fun generateTypeBoundaryValue() {
        val parameters = functionDefinition.parameters
        val argumentTypes = functionDefinition.argumentTypes

        for (i in argumentTypes.indices) {
            val parameter = parameters[i]
            val argumentType = argumentTypes[i]
            val bvs = boundaryValueList[parameter]
            when (argumentType) {
                "int" -> {
                    bvs!!.run {
                        add(intMax + 1)
                        add(intMax)
                        add(intMin)
                        add(intMin - 1)
                    }
                }
                "nat" -> {
                    bvs!!.run {
                        add(natMax + 1)
                        add(natMax)
                        add(natMin)
                        add(natMin - 1)
                    }
                }
                "nat1" -> {
                    bvs!!.run {
                        add(nat1Max + 1)
                        add(nat1Max)
                        add(nat1Min)
                        add(nat1Min - 1)
                    }
                }
                else -> {
                }
            }
        }
    }


    private fun generateIfConditionalBoundaryValue() {
        val allIfConditions = functionDefinition.ifConditions

        allIfConditions.forEach { (parameter, ifConditions) ->
            ifConditions.forEach { condition ->
                //condition : HashMap<String, String>
                val left = condition["left"]
                if (Util.getOperator(left!!) == "+") {
                    return@forEach
                }
                val operator = condition["operator"]
                val right = condition["right"]
                val bvs = boundaryValueList[parameter]

                var trueValue: Long = 0
                var falseValue: Long = 0
                val value: Long
                if (Util.isNumber(left)) {
                    value = java.lang.Long.parseLong(left)
                    when (operator) {
                        "<" -> {
                            trueValue = value + 1
                            falseValue = value
                        }
                        "<=" -> {
                            trueValue = value
                            falseValue = value - 1
                        }
                        ">" -> {
                            trueValue = value - 1
                            falseValue = value
                        }
                        ">=" -> {
                            trueValue = value
                            falseValue = value + 1
                        }
                        "mod" -> {
                            trueValue = value + java.lang.Long.parseLong(condition["surplus"])
                            falseValue = value + 1
                            bvs!!.add(value - 1)
                        }
                    }

                } else if (Util.isNumber(right!!)) {
                    value = java.lang.Long.parseLong(right)
                    when (operator) {
                        "<" -> {
                            trueValue = value - 1
                            falseValue = value
                        }
                        "<=" -> {
                            trueValue = value
                            falseValue = value + 1
                        }
                        ">" -> {
                            trueValue = value + 1
                            falseValue = value
                        }
                        ">=" -> {
                            trueValue = value
                            falseValue = value - 1
                        }
                        "mod" -> {
                            trueValue = value + java.lang.Long.parseLong(condition["surplus"])
                            falseValue = value + 1
                            bvs!!.add(value - 1)
                        }
                    }
                }

                bvs!!.run {
                    add(trueValue)
                    add(falseValue)
                }

            }
        }
    }

    private fun makeInputDataListWithPairwise() {
        val pict = Pict()
        val model = Model()
        // 蝗蟄舌�蜿門ｾ
        val parameters = functionDefinition.parameters

        // 蠑墓焚縺ｮ謨ｰ縺2蛟倶ｻ･荳九�蝣ｴ蜷医√�繧｢繝ｯ繧､繧ｺ豕輔′驕ｩ逕ｨ縺ｧ縺阪↑縺��縺ｧ縲
        // 萓句､悶ｒ蜃ｺ縺
        if (parameters.size <= 2) {
            throw IllegalArgumentException(
                    "髢｢謨ｰ${functionDefinition.functionName}縺悟女縺大叙繧句ｼ墓焚縺ｮ謨ｰ縺悟ｰ代↑縺��縺ｧ繝壹い繝ｯ繧､繧ｺ豕輔�驕ｩ逕ｨ縺ｧ縺阪∪縺帙ｓ縲"
            )
        }

        // ファクターの追加
        for (prm in parameters) {
            val bvs = boundaryValueList[prm]
            val factor = Factor(named_level = bvs!!.map { it.toString() }, name = prm)
            model.addFactor(factor)
        }

        // 繝壹い繝ｯ繧､繧ｺ蛻�梵縺励◆邨先棡繧堤函謌
        pict.setRootModel(model)
        val tests = pict.generate()

        for (test in tests) {
            val hash = HashMap<String, Long>()
            for ((index, param) in test.withIndex()) {
                hash[model.factors[index].name] = param!!.toLong()
            }
            inputDataList.add(hash)
        }
    }

    private fun makeInputDataList() {
        val parameters = functionDefinition.parameters

        // 譛蛻昴�荳縺､逶ｮ
        val firstPrm = parameters[0]
        val firstBvs = boundaryValueList[firstPrm]
        for (i in firstBvs!!.indices) {
            inputDataList.add(HashMap())
            val hm = inputDataList[i]
            hm[firstPrm] = firstBvs[i]
        }

        // 縺昴ｌ莉･髯
        parameters.forEach { p ->
            if (p != firstPrm) { // 譛蛻昴�隕∫ｴ莉･螟悶↓蟇ｾ縺励※
                val currentBvs = boundaryValueList[p]

                // inputDataList縺ｮ隨ｬ荳蠑墓焚縺ｮ縺ｿ繧堤匳骭ｲ縺励◆迥ｶ諷
                val inputDataListInitialState = ArrayList(inputDataList)

                for (i in 0 until currentBvs!!.size - 1) {
                    val inputDataListTmp = ArrayList<HashMap<String, Long>>()
                    inputDataListInitialState.forEach { inputDataOriginal ->
                        //inputData繧定､�｣ｽ
                        val inputData = HashMap<String, Long>()
                        inputDataOriginal.forEach { (key, value) -> inputData[key] = value }
                        inputDataListTmp.add(inputData)
                    }
                    inputDataList.addAll(inputDataListTmp)
                }
                for ((repeatTimesOfInsert, current_bv) in currentBvs.withIndex()) {
                    val offset = repeatTimesOfInsert * inputDataListInitialState.size
                    for (k in inputDataListInitialState.indices) {
                        val inputData = inputDataList[k + offset]
                        inputData[p] = current_bv
                    }
                }

            }
        }
    } //end makeInputDatList

    companion object {
        internal const val intMax = Integer.MAX_VALUE.toLong()
        internal const val intMin = Integer.MIN_VALUE.toLong()
        internal const val natMax = intMax * 2
        internal const val natMin: Long = 0
        internal const val nat1Max = natMax + 1
        internal const val nat1Min: Long = 1
    }

}
