package com.github.korosuke613.bwdm.informationStore

import com.fujitsu.vdmj.lex.LexException
import com.fujitsu.vdmj.syntax.ParserException
import com.fujitsu.vdmj.tc.definitions.TCExplicitOperationDefinition
import com.fujitsu.vdmj.tc.definitions.TCInstanceVariableDefinition
import com.fujitsu.vdmj.tc.definitions.TCValueDefinition
import java.io.IOException

class OperationDefinition
(tcDefinition: TCExplicitOperationDefinition,
 private val instanceVariables: LinkedHashMap<String, TCInstanceVariableDefinition>,
 private val constantValues: LinkedHashMap<String, TCValueDefinition>) : Definition(tcDefinition) {

    // 利用しているメンバ変数のリスト
    private val usedInstanceVariables: LinkedHashMap<String, String> = linkedMapOf()

    override var returnValue: String = tcDefinition.type.result.toString()

    init {
        // 引数の型を登録
        tcDefinition.type.parameters.forEach { e -> argumentTypes.add(e.toString()) }

        // IfElseを構文解析
        ifExpressionBody = tcDefinition.body.toString()

        try {
            // 定数を実数に置き換え
            constantValues.forEach {
                if (ifExpressionBody.contains(it.key)) {
                    ifExpressionBody = ifExpressionBody.replace(it.key, it.value.exp.toString())
                }
            }
            ifElseExprSyntaxTree = IfElseExprSyntaxTree(ifExpressionBody)
        } catch (e: NotIfNodeException) {
            isSetter = true
        } catch (e: ParserException) {
            e.printStackTrace()
        } catch (e: LexException) {
            e.printStackTrace()
        } catch (e: IOException) {
            e.printStackTrace()
        }

        if (!isSetter) {
            setIfElseSyntaxTree()
        }
    }

    override fun setIfElseSyntaxTree() {
        //parsing for parameters
        val tcPatternList = (tcDefinition as TCExplicitOperationDefinition).paramPatternList[0] // 仮引数
        setUsedInstanceVariables()

        for (parameter in tcPatternList) {
            parameters.add(parameter.toString())
        }
        for (variable in usedInstanceVariables) {
            parameters.add(variable.key)
            argumentTypes.add(variable.value)
        }

        parseIfConditions()

        conditionAndReturnValueList = ConditionAndReturnValueList(ifElseExprSyntaxTree!!.root)
    }

    private fun setUsedInstanceVariables() {
        instanceVariables.forEach {
            if (ifExpressionBody.contains(it.key)) {
                usedInstanceVariables[it.key] = it.value.type.toString()
            }
        }
    }

    override fun parseIfConditions() {
        val ifElses = ifElseExprSyntaxTree!!.ifElses

        compositeParameters = ArrayList(parameters)

        for (i in ifElses.indices) {
            var element = ifElses[i]
            if (element == "if") {
                element = ifElses[i + 1]

                // 定数を実数に置き換え
                constantValues.forEach {
                    if (element.contains(it.key)) {
                        element = element.replace(it.key, it.value.exp.toString())
                        ifElses[i + 1] = element
                    }
                }
                createCompositParameters(element)
            }
        }

        initializeIfconditions()
        createIfCondition()
    }
}