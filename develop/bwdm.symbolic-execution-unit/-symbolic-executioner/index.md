[bwdm.symbolicExecutionUnit](../index.md) / [SymbolicExecutioner](./index.md)

# SymbolicExecutioner

`class SymbolicExecutioner`

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `internal SymbolicExecutioner(ie: `[`InformationExtractor`](../../bwdm.information-store/-information-extractor/index.md)`)` |

### Properties

| Name | Summary |
|---|---|
| [ctx](ctx.md) | `val ctx: Context` |
| [expectedOutputDataList](expected-output-data-list.md) | `val expectedOutputDataList: `[`ArrayList`](http://docs.oracle.com/javase/6/docs/api/java/util/ArrayList.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>` |
| [ie](ie.md) | `val ie: `[`InformationExtractor`](../../bwdm.information-store/-information-extractor/index.md) |
| [inputDataList](input-data-list.md) | `val inputDataList: `[`ArrayList`](http://docs.oracle.com/javase/6/docs/api/java/util/ArrayList.html)`<`[`InputData`](../-input-data.md)`>` |

### Functions

| Name | Summary |
|---|---|
| [doSymbolicExecution](do-symbolic-execution.md) | `fun doSymbolicExecution(_conditionAndReturnValue: `[`ConditionAndReturnValue`](../../bwdm.information-store/-condition-and-return-value-list/-condition-and-return-value/index.md)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [getExpectedOutputDataList](get-expected-output-data-list.md) | `fun getExpectedOutputDataList(): `[`ArrayList`](http://docs.oracle.com/javase/6/docs/api/java/util/ArrayList.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>` |
| [makeInequalityExpr](make-inequality-expr.md) | `fun makeInequalityExpr(_left: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, _operator: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, _right: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, _bool: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`?): BoolExpr?` |
| [makeModExpr](make-mod-expr.md) | `fun makeModExpr(_left: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, _right: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, _surplus: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, _bool: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`?): BoolExpr` |
