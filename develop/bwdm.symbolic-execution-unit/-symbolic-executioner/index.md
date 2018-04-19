---
title: SymbolicExecutioner - 
---

[bwdm.symbolicExecutionUnit](../index.html) / [SymbolicExecutioner](./index.html)

# SymbolicExecutioner

`class SymbolicExecutioner`

### Constructors

| [&lt;init&gt;](-init-.html) | `internal SymbolicExecutioner(ie: `[`InformationExtractor`](../../bwdm.information-store/-information-extractor/index.html)`)` |

### Properties

| [ctx](ctx.html) | `val ctx: Context` |
| [expectedOutputDataList](expected-output-data-list.html) | `val expectedOutputDataList: `[`ArrayList`](http://docs.oracle.com/javase/6/docs/api/java/util/ArrayList.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>` |
| [ie](ie.html) | `val ie: `[`InformationExtractor`](../../bwdm.information-store/-information-extractor/index.html) |
| [inputDataList](input-data-list.html) | `val inputDataList: `[`ArrayList`](http://docs.oracle.com/javase/6/docs/api/java/util/ArrayList.html)`<`[`HashMap`](http://docs.oracle.com/javase/6/docs/api/java/util/HashMap.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>>` |

### Functions

| [doSymbolicExecution](do-symbolic-execution.html) | `fun doSymbolicExecution(_conditionAndReturnValue: `[`ConditionAndReturnValue`](../../bwdm.information-store/-condition-and-return-value-list/-condition-and-return-value/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [getExpectedOutputDataList](get-expected-output-data-list.html) | `fun getExpectedOutputDataList(): `[`ArrayList`](http://docs.oracle.com/javase/6/docs/api/java/util/ArrayList.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>` |
| [makeInequalityExpr](make-inequality-expr.html) | `fun makeInequalityExpr(_left: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, _operator: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, _right: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, _bool: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`?): BoolExpr?` |
| [makeModExpr](make-mod-expr.html) | `fun makeModExpr(_left: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, _right: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, _surplus: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, _bool: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`?): BoolExpr` |

