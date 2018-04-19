---
title: BoundaryValueAnalyzer - 
layout: api
---

<div class='api-docs-breadcrumbs'><a href="../index.html">bwdm.boundaryValueAnalysisUnit</a> / <a href="./index.html">BoundaryValueAnalyzer</a></div>

# BoundaryValueAnalyzer

<div class="signature"><code><span class="keyword">class </span><span class="identifier">BoundaryValueAnalyzer</span></code></div>

### Constructors

<table class="api-docs-table">
<tbody>
<tr>
<td markdown="1">

<a href="-init-.html">&lt;init&gt;</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="identifier">BoundaryValueAnalyzer</span><span class="symbol">(</span><span class="parameterName" id="bwdm.boundaryValueAnalysisUnit.BoundaryValueAnalyzer$<init>(bwdm.informationStore.InformationExtractor)/_information">_information</span><span class="symbol">:</span>&nbsp;<a href="../../bwdm.information-store/-information-extractor/index.html"><span class="identifier">InformationExtractor</span></a><span class="symbol">)</span></code></div>

</td>
</tr>
</tbody>
</table>

### Properties

<table class="api-docs-table">
<tbody>
<tr>
<td markdown="1">

<a href="boundary-value-list.html">boundaryValueList</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">val </span><span class="identifier">boundaryValueList</span><span class="symbol">: </span><a href="http://docs.oracle.com/javase/6/docs/api/java/util/HashMap.html"><span class="identifier">HashMap</span></a><span class="symbol">&lt;</span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html"><span class="identifier">String</span></a><span class="symbol">,</span>&nbsp;<a href="http://docs.oracle.com/javase/6/docs/api/java/util/ArrayList.html"><span class="identifier">ArrayList</span></a><span class="symbol">&lt;</span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html"><span class="identifier">Long</span></a><span class="symbol">&gt;</span><span class="symbol">&gt;</span></code></div>

</td>
</tr>
<tr>
<td markdown="1">

<a href="input-data-list.html">inputDataList</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">val </span><span class="identifier">inputDataList</span><span class="symbol">: </span><a href="http://docs.oracle.com/javase/6/docs/api/java/util/ArrayList.html"><span class="identifier">ArrayList</span></a><span class="symbol">&lt;</span><a href="http://docs.oracle.com/javase/6/docs/api/java/util/HashMap.html"><span class="identifier">HashMap</span></a><span class="symbol">&lt;</span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html"><span class="identifier">String</span></a><span class="symbol">,</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html"><span class="identifier">Long</span></a><span class="symbol">&gt;</span><span class="symbol">&gt;</span></code></div>

</td>
</tr>
</tbody>
</table>

### Functions

<table class="api-docs-table">
<tbody>
<tr>
<td markdown="1">

<a href="generate-if-conditional-boundary-value.html">generateIfConditionalBoundaryValue</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="identifier">generateIfConditionalBoundaryValue</span><span class="symbol">(</span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="bwdm.boundaryValueAnalysisUnit.BoundaryValueAnalyzer$generateIfConditionalBoundaryValue(bwdm.informationStore.InformationExtractor)/_information">_information</span><span class="symbol">:</span>&nbsp;<a href="../../bwdm.information-store/-information-extractor/index.html"><span class="identifier">InformationExtractor</span></a><br/><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

</td>
</tr>
<tr>
<td markdown="1">

<a href="generate-type-boundary-value.html">generateTypeBoundaryValue</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="identifier">generateTypeBoundaryValue</span><span class="symbol">(</span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="bwdm.boundaryValueAnalysisUnit.BoundaryValueAnalyzer$generateTypeBoundaryValue(bwdm.informationStore.InformationExtractor)/_information">_information</span><span class="symbol">:</span>&nbsp;<a href="../../bwdm.information-store/-information-extractor/index.html"><span class="identifier">InformationExtractor</span></a><br/><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

</td>
</tr>
<tr>
<td markdown="1">

<a href="make-input-data-list.html">makeInputDataList</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="identifier">makeInputDataList</span><span class="symbol">(</span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="bwdm.boundaryValueAnalysisUnit.BoundaryValueAnalyzer$makeInputDataList(bwdm.informationStore.InformationExtractor)/_information">_information</span><span class="symbol">:</span>&nbsp;<a href="../../bwdm.information-store/-information-extractor/index.html"><span class="identifier">InformationExtractor</span></a><br/><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

</td>
</tr>
</tbody>
</table>

### Companion Object Properties

<table class="api-docs-table">
<tbody>
<tr>
<td markdown="1">

<a href="int-max.html">intMax</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">internal</span> <span class="keyword">const</span> <span class="keyword">val </span><span class="identifier">intMax</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html"><span class="identifier">Long</span></a></code></div>

</td>
</tr>
<tr>
<td markdown="1">

<a href="int-min.html">intMin</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">internal</span> <span class="keyword">const</span> <span class="keyword">val </span><span class="identifier">intMin</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html"><span class="identifier">Long</span></a></code></div>

</td>
</tr>
<tr>
<td markdown="1">

<a href="nat1-max.html">nat1Max</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">internal</span> <span class="keyword">const</span> <span class="keyword">val </span><span class="identifier">nat1Max</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html"><span class="identifier">Long</span></a></code></div>

</td>
</tr>
<tr>
<td markdown="1">

<a href="nat1-min.html">nat1Min</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">internal</span> <span class="keyword">const</span> <span class="keyword">val </span><span class="identifier">nat1Min</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html"><span class="identifier">Long</span></a></code></div>

</td>
</tr>
<tr>
<td markdown="1">

<a href="nat-max.html">natMax</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">internal</span> <span class="keyword">const</span> <span class="keyword">val </span><span class="identifier">natMax</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html"><span class="identifier">Long</span></a></code></div>

</td>
</tr>
<tr>
<td markdown="1">

<a href="nat-min.html">natMin</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">internal</span> <span class="keyword">const</span> <span class="keyword">val </span><span class="identifier">natMin</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html"><span class="identifier">Long</span></a></code></div>

</td>
</tr>
</tbody>
</table>
