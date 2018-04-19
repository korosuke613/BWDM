---
title: ExpectedOutputDataGenerator - 
layout: api
---

<div class='api-docs-breadcrumbs'><a href="../index.html">bwdm.boundaryValueAnalysisUnit</a> / <a href="./index.html">ExpectedOutputDataGenerator</a></div>

# ExpectedOutputDataGenerator

<div class="signature"><code><span class="keyword">class </span><span class="identifier">ExpectedOutputDataGenerator</span></code></div>

### Constructors

<table class="api-docs-table">
<tbody>
<tr>
<td markdown="1">

<a href="-init-.html">&lt;init&gt;</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">internal</span> <span class="identifier">ExpectedOutputDataGenerator</span><span class="symbol">(</span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="bwdm.boundaryValueAnalysisUnit.ExpectedOutputDataGenerator$<init>(bwdm.informationStore.InformationExtractor, bwdm.informationStore.IfNode, java.util.ArrayList((java.util.HashMap((kotlin.String, kotlin.Long)))))/ie">ie</span><span class="symbol">:</span>&nbsp;<a href="../../bwdm.information-store/-information-extractor/index.html"><span class="identifier">InformationExtractor</span></a><span class="symbol">, </span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="bwdm.boundaryValueAnalysisUnit.ExpectedOutputDataGenerator$<init>(bwdm.informationStore.InformationExtractor, bwdm.informationStore.IfNode, java.util.ArrayList((java.util.HashMap((kotlin.String, kotlin.Long)))))/_root">_root</span><span class="symbol">:</span>&nbsp;<a href="../../bwdm.information-store/-if-node/index.html"><span class="identifier">IfNode</span></a><span class="symbol">, </span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="bwdm.boundaryValueAnalysisUnit.ExpectedOutputDataGenerator$<init>(bwdm.informationStore.InformationExtractor, bwdm.informationStore.IfNode, java.util.ArrayList((java.util.HashMap((kotlin.String, kotlin.Long)))))/_inputDataList">_inputDataList</span><span class="symbol">:</span>&nbsp;<a href="http://docs.oracle.com/javase/6/docs/api/java/util/ArrayList.html"><span class="identifier">ArrayList</span></a><span class="symbol">&lt;</span><a href="http://docs.oracle.com/javase/6/docs/api/java/util/HashMap.html"><span class="identifier">HashMap</span></a><span class="symbol">&lt;</span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html"><span class="identifier">String</span></a><span class="symbol">,</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html"><span class="identifier">Long</span></a><span class="symbol">&gt;</span><span class="symbol">&gt;</span><span class="symbol">)</span></code></div>

</td>
</tr>
</tbody>
</table>

### Properties

<table class="api-docs-table">
<tbody>
<tr>
<td markdown="1">

<a href="expected-output-data-list.html">expectedOutputDataList</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">internal</span> <span class="keyword">val </span><span class="identifier">expectedOutputDataList</span><span class="symbol">: </span><a href="http://docs.oracle.com/javase/6/docs/api/java/util/ArrayList.html"><span class="identifier">ArrayList</span></a><span class="symbol">&lt;</span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html"><span class="identifier">String</span></a><span class="symbol">&gt;</span></code></div>

</td>
</tr>
<tr>
<td markdown="1">

<a href="ie.html">ie</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">val </span><span class="identifier">ie</span><span class="symbol">: </span><a href="../../bwdm.information-store/-information-extractor/index.html"><span class="identifier">InformationExtractor</span></a></code></div>

</td>
</tr>
</tbody>
</table>

### Functions

<table class="api-docs-table">
<tbody>
<tr>
<td markdown="1">

<a href="extract-expected-output-data-recursively.html">extractExpectedOutputDataRecursively</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="identifier">extractExpectedOutputDataRecursively</span><span class="symbol">(</span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="bwdm.boundaryValueAnalysisUnit.ExpectedOutputDataGenerator$extractExpectedOutputDataRecursively(bwdm.informationStore.Node, java.util.HashMap((kotlin.String, kotlin.Long)))/_node">_node</span><span class="symbol">:</span>&nbsp;<a href="../../bwdm.information-store/-node/index.html"><span class="identifier">Node</span></a><span class="symbol">, </span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="bwdm.boundaryValueAnalysisUnit.ExpectedOutputDataGenerator$extractExpectedOutputDataRecursively(bwdm.informationStore.Node, java.util.HashMap((kotlin.String, kotlin.Long)))/_inputData">_inputData</span><span class="symbol">:</span>&nbsp;<a href="http://docs.oracle.com/javase/6/docs/api/java/util/HashMap.html"><span class="identifier">HashMap</span></a><span class="symbol">&lt;</span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html"><span class="identifier">String</span></a><span class="symbol">,</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html"><span class="identifier">Long</span></a><span class="symbol">&gt;</span><br/><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

</td>
</tr>
<tr>
<td markdown="1">

<a href="judge.html">judge</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="identifier">judge</span><span class="symbol">(</span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="bwdm.boundaryValueAnalysisUnit.ExpectedOutputDataGenerator$judge(java.util.HashMap((kotlin.String, )), java.util.HashMap((kotlin.String, kotlin.Long)), kotlin.String)/_parsedCondition">_parsedCondition</span><span class="symbol">:</span>&nbsp;<a href="http://docs.oracle.com/javase/6/docs/api/java/util/HashMap.html"><span class="identifier">HashMap</span></a><span class="symbol">&lt;</span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html"><span class="identifier">String</span></a><span class="symbol">,</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html"><span class="identifier">String</span></a><span class="symbol">&gt;</span><span class="symbol">, </span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="bwdm.boundaryValueAnalysisUnit.ExpectedOutputDataGenerator$judge(java.util.HashMap((kotlin.String, )), java.util.HashMap((kotlin.String, kotlin.Long)), kotlin.String)/_inputData">_inputData</span><span class="symbol">:</span>&nbsp;<a href="http://docs.oracle.com/javase/6/docs/api/java/util/HashMap.html"><span class="identifier">HashMap</span></a><span class="symbol">&lt;</span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html"><span class="identifier">String</span></a><span class="symbol">,</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html"><span class="identifier">Long</span></a><span class="symbol">&gt;</span><span class="symbol">, </span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="bwdm.boundaryValueAnalysisUnit.ExpectedOutputDataGenerator$judge(java.util.HashMap((kotlin.String, )), java.util.HashMap((kotlin.String, kotlin.Long)), kotlin.String)/_parameter">_parameter</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html"><span class="identifier">String</span></a><br/><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html"><span class="identifier">Boolean</span></a></code></div>

</td>
</tr>
<tr>
<td markdown="1">

<a href="judge-inequality.html">judgeInequality</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="identifier">judgeInequality</span><span class="symbol">(</span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="bwdm.boundaryValueAnalysisUnit.ExpectedOutputDataGenerator$judgeInequality(kotlin.Long, kotlin.String, kotlin.Long)/_leftHand">_leftHand</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html"><span class="identifier">Long</span></a><span class="symbol">?</span><span class="symbol">, </span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="bwdm.boundaryValueAnalysisUnit.ExpectedOutputDataGenerator$judgeInequality(kotlin.Long, kotlin.String, kotlin.Long)/_operator">_operator</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html"><span class="identifier">String</span></a><span class="symbol">, </span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="bwdm.boundaryValueAnalysisUnit.ExpectedOutputDataGenerator$judgeInequality(kotlin.Long, kotlin.String, kotlin.Long)/_rightHand">_rightHand</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html"><span class="identifier">Long</span></a><span class="symbol">?</span><br/><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html"><span class="identifier">Boolean</span></a></code></div>

</td>
</tr>
<tr>
<td markdown="1">

<a href="judge-mod.html">judgeMod</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="identifier">judgeMod</span><span class="symbol">(</span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="bwdm.boundaryValueAnalysisUnit.ExpectedOutputDataGenerator$judgeMod(kotlin.Long, kotlin.Long, kotlin.Long)/_leftHand">_leftHand</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html"><span class="identifier">Long</span></a><span class="symbol">?</span><span class="symbol">, </span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="bwdm.boundaryValueAnalysisUnit.ExpectedOutputDataGenerator$judgeMod(kotlin.Long, kotlin.Long, kotlin.Long)/_rightHand">_rightHand</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html"><span class="identifier">Long</span></a><span class="symbol">?</span><span class="symbol">, </span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="bwdm.boundaryValueAnalysisUnit.ExpectedOutputDataGenerator$judgeMod(kotlin.Long, kotlin.Long, kotlin.Long)/_surplus">_surplus</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html"><span class="identifier">Long</span></a><span class="symbol">?</span><br/><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html"><span class="identifier">Boolean</span></a></code></div>

</td>
</tr>
<tr>
<td markdown="1">

<a href="make-expected-output-dataof-outoftype.html">makeExpectedOutputDataofOutoftype</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="identifier">makeExpectedOutputDataofOutoftype</span><span class="symbol">(</span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="bwdm.boundaryValueAnalysisUnit.ExpectedOutputDataGenerator$makeExpectedOutputDataofOutoftype(java.util.ArrayList((java.util.HashMap((kotlin.String, kotlin.Long)))))/_inputDataList">_inputDataList</span><span class="symbol">:</span>&nbsp;<a href="http://docs.oracle.com/javase/6/docs/api/java/util/ArrayList.html"><span class="identifier">ArrayList</span></a><span class="symbol">&lt;</span><a href="http://docs.oracle.com/javase/6/docs/api/java/util/HashMap.html"><span class="identifier">HashMap</span></a><span class="symbol">&lt;</span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html"><span class="identifier">String</span></a><span class="symbol">,</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html"><span class="identifier">Long</span></a><span class="symbol">&gt;</span><span class="symbol">&gt;</span><br/><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

</td>
</tr>
</tbody>
</table>

### Companion Object Functions

<table class="api-docs-table">
<tbody>
<tr>
<td markdown="1">

<a href="make-parsed-condition.html">makeParsedCondition</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="identifier">makeParsedCondition</span><span class="symbol">(</span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="bwdm.boundaryValueAnalysisUnit.ExpectedOutputDataGenerator.Companion$makeParsedCondition(kotlin.String)/_condition">_condition</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html"><span class="identifier">String</span></a><br/><span class="symbol">)</span><span class="symbol">: </span><a href="http://docs.oracle.com/javase/6/docs/api/java/util/HashMap.html"><span class="identifier">HashMap</span></a><span class="symbol">&lt;</span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html"><span class="identifier">String</span></a><span class="symbol">,</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html"><span class="identifier">String</span></a><span class="symbol">&gt;</span></code></div>

</td>
</tr>
</tbody>
</table>
