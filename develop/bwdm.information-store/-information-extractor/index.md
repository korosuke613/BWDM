---
title: InformationExtractor - 
---

[bwdm.informationStore](../index.html) / [InformationExtractor](./index.html)

# InformationExtractor

`class InformationExtractor`

information what got from VDM++ specification file by syntax analyse with VDMJ

### Constructors

| [&lt;init&gt;](-init-.html) | `InformationExtractor(vdmFilePath: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`)`<br>information what got from VDM++ specification file by syntax analyse with VDMJ |

### Properties

| [argumentTypes](argument-types.html) | `val argumentTypes: `[`ArrayList`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-array-list/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>` |
| [conditionAndReturnValueList](condition-and-return-value-list.html) | `val conditionAndReturnValueList: `[`ConditionAndReturnValueList`](../-condition-and-return-value-list/index.html) |
| [functionName](function-name.html) | `var functionName: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [ifConditionBodies](if-condition-bodies.html) | `val ifConditionBodies: `[`HashMap`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-hash-map/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, `[`ArrayList`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-array-list/index.html)`<`[`HashMap`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-hash-map/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>>>`<br>a parameter to ArrayList of if-conditions. ArrayList of ifConditions of each parameter. |
| [ifConditionBodiesInCameForward](if-condition-bodies-in-came-forward.html) | `val ifConditionBodiesInCameForward: `[`ArrayList`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-array-list/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>` |
| [ifConditions](if-conditions.html) | `val ifConditions: `[`HashMap`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-hash-map/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, `[`ArrayList`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-array-list/index.html)`<`[`HashMap`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-hash-map/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>>>`<br>a parameter to ArrayList of HashMaps that is parsed each if-expression. ArrayList of HashMap of parsed if-expr. |
| [ifElseExprSyntaxTree](if-else-expr-syntax-tree.html) | `var ifElseExprSyntaxTree: `[`IfElseExprSyntaxTree`](../-if-else-expr-syntax-tree/index.html)`?` |
| [ifExpressionBody](if-expression-body.html) | `var ifExpressionBody: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [parameters](parameters.html) | `val parameters: `[`ArrayList`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-array-list/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>` |
| [returnValue](return-value.html) | `var returnValue: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?`<br>type of return value |
| [vdmFilePath](vdm-file-path.html) | `val vdmFilePath: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |

### Functions

| [parse](parse.html) | `fun parse(condition: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, parameter: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [parseIfConditions](parse-if-conditions.html) | `fun parseIfConditions(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |

### Companion Object Functions

| [modJudge](mod-judge.html) | `fun modJudge(condition: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, operator: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, indexOfoperator: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, hm: `[`HashMap`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-hash-map/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |

