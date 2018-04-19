---
title: TimeMeasure - 
---

[external](../index.html) / [TimeMeasure](./index.html)

# TimeMeasure

`open class TimeMeasure`

処理速度を管理するクラス.

**Author**
Yukichi Tamura

### Constructors

| [&lt;init&gt;](-init-.html) | `TimeMeasure()`<br>`TimeMeasure(filename: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`)`<br>Constructor. |

### Properties

| [DIVISOR](-d-i-v-i-s-o-r.html) | `static val DIVISOR: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>ナノ秒から秒に換算するための割数. |
| [endTime](end-time.html) | `var endTime: `[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)<br>計測終了時間. |
| [nf](nf.html) | `static val nf: `[`NumberFormat`](http://docs.oracle.com/javase/6/docs/api/java/text/NumberFormat.html)<br>NumberFormatインスタンス. |
| [pw](pw.html) | `static var pw: `[`PrintWriter`](http://docs.oracle.com/javase/6/docs/api/java/io/PrintWriter.html)<br>PrintWriterインスタンス. |
| [startTime](start-time.html) | `var startTime: `[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)<br>計測開始時間. |

### Functions

| [finish](finish.html) | `open fun finish(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>計測終了時間をセット. |
| [getResult](get-result.html) | `open fun getResult(): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>計測結果を取得. |
| [printResult](print-result.html) | `open fun printResult(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>計測結果を出力. 指定範囲の処理にかかった時間を秒で出力する. |
| [start](start.html) | `open fun start(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>計測開始時間をセット. |
| [writeResult](write-result.html) | `open fun writeResult(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>計測結果をファイルに出力. 指定範囲の処理にかかった時間を秒でファイルに追加して書き出す. |

