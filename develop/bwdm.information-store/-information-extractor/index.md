[bwdm.informationStore](../index.md) / [InformationExtractor](./index.md)

# InformationExtractor

`class InformationExtractor`

information what got from VDM++ specification file by syntax analyse with VDMJ

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `InformationExtractor(vdmFilePath: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`)`<br>information what got from VDM++ specification file by syntax analyse with VDMJ |

### Properties

| Name | Summary |
|---|---|
| [argumentTypes](argument-types.md) | `val argumentTypes: `[`ArrayList`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-array-list/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>` |
| [conditionAndReturnValueList](condition-and-return-value-list.md) | `val conditionAndReturnValueList: `[`ConditionAndReturnValueList`](../-condition-and-return-value-list/index.md) |
| [functionName](function-name.md) | `var functionName: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [ifConditionBodies](if-condition-bodies.md) | `val ifConditionBodies: `[`HashMap`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-hash-map/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, `[`ArrayList`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-array-list/index.html)`<`[`HashMap`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-hash-map/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>>>`<br>a parameter to ArrayList of if-conditions. ArrayList of ifConditions of each parameter. |
| [ifConditionBodiesInCameForward](if-condition-bodies-in-came-forward.md) | `val ifConditionBodiesInCameForward: `[`ArrayList`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-array-list/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>` |
| [ifConditions](if-conditions.md) | `val ifConditions: `[`HashMap`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-hash-map/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, `[`ArrayList`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-array-list/index.html)`<`[`HashMap`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-hash-map/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>>>`<br>a parameter to ArrayList of HashMaps that is parsed each if-expression. ArrayList of HashMap of parsed if-expr. |
| [ifElseExprSyntaxTree](if-else-expr-syntax-tree.md) | `var ifElseExprSyntaxTree: `[`IfElseExprSyntaxTree`](../-if-else-expr-syntax-tree/index.md)`?` |
| [ifExpressionBody](if-expression-body.md) | `var ifExpressionBody: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [parameters](parameters.md) | `val parameters: `[`ArrayList`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-array-list/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>` |
| [returnValue](return-value.md) | `var returnValue: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?`<br>type of return value |
| [vdmFilePath](vdm-file-path.md) | `val vdmFilePath: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |

### Functions

| Name | Summary |
|---|---|
| [parse](parse.md) | `fun parse(condition: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, parameter: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [parseIfConditions](parse-if-conditions.md) | `fun parseIfConditions(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |

### Companion Object Functions

| Name | Summary |
|---|---|
| [modJudge](mod-judge.md) | `fun modJudge(condition: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, operator: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, indexOfoperator: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, hm: `[`HashMap`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-hash-map/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
