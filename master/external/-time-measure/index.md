[external](../index.md) / [TimeMeasure](./index.md)

# TimeMeasure

`open class TimeMeasure`

処理速度を管理するクラス.

**Author**
Yukichi Tamura

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `TimeMeasure()`<br>Constructor. |

### Functions

| Name | Summary |
|---|---|
| [finish](finish.md) | `open fun finish(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>計測終了時間をセット. |
| [getResult](get-result.md) | `open fun getResult(): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>計測結果を取得. |
| [printResult](print-result.md) | `open fun printResult(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>計測結果を出力. 指定範囲の処理にかかった時間を秒で出力する. |
| [start](start.md) | `open fun start(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>計測開始時間をセット. |
| [writeResult](write-result.md) | `open fun writeResult(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>計測結果をファイルに出力. 指定範囲の処理にかかった時間を秒でファイルに追加して書き出す. |
