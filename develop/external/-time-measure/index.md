---
title: TimeMeasure - 
layout: api
---

<div class='api-docs-breadcrumbs'><a href="../index.html">external</a> / <a href="./index.html">TimeMeasure</a></div>

# TimeMeasure

<div class="signature"><code><span class="keyword">open</span> <span class="keyword">class </span><span class="identifier">TimeMeasure</span></code></div>

処理速度を管理するクラス.

**Author**
Yukichi Tamura

### Constructors

<table class="api-docs-table">
<tbody>
<tr>
<td markdown="1">

<a href="-init-.html">&lt;init&gt;</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="identifier">TimeMeasure</span><span class="symbol">(</span><span class="symbol">)</span></code></div>

<div class="signature"><code><span class="identifier">TimeMeasure</span><span class="symbol">(</span><span class="parameterName" id="external.TimeMeasure$<init>(kotlin.String)/filename">filename</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html"><span class="identifier">String</span></a><span class="symbol">)</span></code></div>

Constructor.


</td>
</tr>
</tbody>
</table>

### Properties

<table class="api-docs-table">
<tbody>
<tr>
<td markdown="1">

<a href="-d-i-v-i-s-o-r.html">DIVISOR</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">static</span> <span class="keyword">val </span><span class="identifier">DIVISOR</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html"><span class="identifier">Int</span></a></code></div>

ナノ秒から秒に換算するための割数.


</td>
</tr>
<tr>
<td markdown="1">

<a href="end-time.html">endTime</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">var </span><span class="identifier">endTime</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html"><span class="identifier">Double</span></a></code></div>

計測終了時間.


</td>
</tr>
<tr>
<td markdown="1">

<a href="nf.html">nf</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">static</span> <span class="keyword">val </span><span class="identifier">nf</span><span class="symbol">: </span><a href="http://docs.oracle.com/javase/6/docs/api/java/text/NumberFormat.html"><span class="identifier">NumberFormat</span></a></code></div>

NumberFormatインスタンス.


</td>
</tr>
<tr>
<td markdown="1">

<a href="pw.html">pw</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">static</span> <span class="keyword">var </span><span class="identifier">pw</span><span class="symbol">: </span><a href="http://docs.oracle.com/javase/6/docs/api/java/io/PrintWriter.html"><span class="identifier">PrintWriter</span></a></code></div>

PrintWriterインスタンス.


</td>
</tr>
<tr>
<td markdown="1">

<a href="start-time.html">startTime</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">var </span><span class="identifier">startTime</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html"><span class="identifier">Double</span></a></code></div>

計測開始時間.


</td>
</tr>
</tbody>
</table>

### Functions

<table class="api-docs-table">
<tbody>
<tr>
<td markdown="1">

<a href="finish.html">finish</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">open</span> <span class="keyword">fun </span><span class="identifier">finish</span><span class="symbol">(</span><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

計測終了時間をセット.


</td>
</tr>
<tr>
<td markdown="1">

<a href="get-result.html">getResult</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">open</span> <span class="keyword">fun </span><span class="identifier">getResult</span><span class="symbol">(</span><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html"><span class="identifier">String</span></a></code></div>

計測結果を取得.


</td>
</tr>
<tr>
<td markdown="1">

<a href="print-result.html">printResult</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">open</span> <span class="keyword">fun </span><span class="identifier">printResult</span><span class="symbol">(</span><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

計測結果を出力. 指定範囲の処理にかかった時間を秒で出力する.


</td>
</tr>
<tr>
<td markdown="1">

<a href="start.html">start</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">open</span> <span class="keyword">fun </span><span class="identifier">start</span><span class="symbol">(</span><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

計測開始時間をセット.


</td>
</tr>
<tr>
<td markdown="1">

<a href="write-result.html">writeResult</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">open</span> <span class="keyword">fun </span><span class="identifier">writeResult</span><span class="symbol">(</span><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

計測結果をファイルに出力. 指定範囲の処理にかかった時間を秒でファイルに追加して書き出す.


</td>
</tr>
</tbody>
</table>
