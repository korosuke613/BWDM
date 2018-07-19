[workspace](../../index.md) / [UsePict](../index.md) / [PictLib](./index.md)

# PictLib

`protected interface PictLib : Library`

### Properties

| Name | Summary |
|---|---|
| [INSTANCE](-i-n-s-t-a-n-c-e.md) | `static val INSTANCE: `[`PictLib`](./index.md) |

### Functions

| Name | Summary |
|---|---|
| [PictAddExclusion](-pict-add-exclusion.md) | `abstract fun PictAddExclusion(task: Pointer, exclusionItems: `[`ByReference`](../-p-i-c-t_-e-x-c-l-u-s-i-o-n_-i-t-e-m/-by-reference/index.md)`, exclusionItemCount: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [PictAddParameter](-pict-add-parameter.md) | `abstract fun PictAddParameter(model: Pointer, valueCount: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, order: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, valueWeights: `[`IntArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int-array/index.html)`): Pointer`<br>`abstract fun PictAddParameter(model: Pointer, valueCount: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, order: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): Pointer` |
| [PictAddSeed](-pict-add-seed.md) | `abstract fun PictAddSeed(task: Pointer, seedItems: `[`ByReference`](../-p-i-c-t_-e-x-c-l-u-s-i-o-n_-i-t-e-m/-by-reference/index.md)`, seedItemCount: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [PictAllocateResultBuffer](-pict-allocate-result-buffer.md) | `abstract fun PictAllocateResultBuffer(task: Pointer): IntByReference` |
| [PictCreateModel](-pict-create-model.md) | `abstract fun PictCreateModel(): Pointer` |
| [PictCreateTask](-pict-create-task.md) | `abstract fun PictCreateTask(): Pointer` |
| [PictGenerate](-pict-generate.md) | `abstract fun PictGenerate(task: Pointer): `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [PictGetNextResultRow](-pict-get-next-result-row.md) | `abstract fun PictGetNextResultRow(task: Pointer, resultRow: IntByReference): `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [PictGetTotalParameterCount](-pict-get-total-parameter-count.md) | `abstract fun PictGetTotalParameterCount(task: Pointer): `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [PictResetResultFetching](-pict-reset-result-fetching.md) | `abstract fun PictResetResultFetching(task: Pointer): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [PictSetRootModel](-pict-set-root-model.md) | `abstract fun PictSetRootModel(task: Pointer, model: Pointer): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
