package bwdm.informationStore


import java.util.ArrayList

class ConditionAndReturnValueList(_root: IfNode) {

    var size = 0
    val conditionAndReturnValues: ArrayList<ConditionAndReturnValue> = ArrayList()

    inner class ConditionAndReturnValue internal constructor() {
        var returnStr: String? = null
            internal set
        //conditions[0]の真偽値がbools[0]
        //conditions[1]の真偽値がbools[1]...
        var conditions: ArrayList<String>
            internal set
        var bools: ArrayList<Boolean>
            internal set

        init {
            size++
            conditions = ArrayList()
            bools = ArrayList()
        }

    }

    init {
        recursiveReturnNodeFind(_root)
    }


    //ReturnNodeの発見とそこに至る為に必要な条件式とその真偽値
    private fun recursiveReturnNodeFind(node: Node) {
        if (node.isIfNode) { //IfNodeならば
            val ifNode = node as IfNode
            recursiveReturnNodeFind(ifNode.conditionTrueNode!!)
            recursiveReturnNodeFind(ifNode.conditionFalseNode!!)
        } else { //ReturnNodeならば
            val conditionAndReturnValue = ConditionAndReturnValue()
            conditionAndReturnValue.returnStr = node.conditionOrReturnStr

            var tmpNode = node
            do { //下のbreak文が
                conditionAndReturnValue.conditions.add(tmpNode.parentNode!!.conditionOrReturnStr)
                conditionAndReturnValue.bools.add(tmpNode.isTrueNode!!) //親ノードからみてTrue側かどうか

                tmpNode = tmpNode.parentNode!!
            } while (tmpNode.parentNode != null)
            conditionAndReturnValues.add(conditionAndReturnValue)
        }
    }
}
