---
title: SymbolicExecutioner - 
layout: api
---

<div class='api-docs-breadcrumbs'><a href="../index.html">bwdm.symbolicExecutionUnit</a> / <a href="./index.html">SymbolicExecutioner</a></div>

# SymbolicExecutioner

<div class="signature"><code><span class="keyword">class </span><span class="identifier">SymbolicExecutioner</span></code></div>

### Constructors

<table class="api-docs-table">
<tbody>
<tr>
<td markdown="1">

<a href="-init-.html">&lt;init&gt;</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">internal</span> <span class="identifier">SymbolicExecutioner</span><span class="symbol">(</span><span class="parameterName" id="bwdm.symbolicExecutionUnit.SymbolicExecutioner$<init>(bwdm.informationStore.InformationExtractor)/ie">ie</span><span class="symbol">:</span>&nbsp;<a href="../../bwdm.information-store/-information-extractor/index.html"><span class="identifier">InformationExtractor</span></a><span class="symbol">)</span></code></div>

</td>
</tr>
</tbody>
</table>

### Properties

<table class="api-docs-table">
<tbody>
<tr>
<td markdown="1">

<a href="ctx.html">ctx</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">val </span><span class="identifier">ctx</span><span class="symbol">: </span><span class="identifier">Context</span></code></div>

</td>
</tr>
<tr>
<td markdown="1">

<a href="expected-output-data-list.html">expectedOutputDataList</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">val </span><span class="identifier">expectedOutputDataList</span><span class="symbol">: </span><a href="http://docs.oracle.com/javase/6/docs/api/java/util/ArrayList.html"><span class="identifier">ArrayList</span></a><span class="symbol">&lt;</span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html"><span class="identifier">String</span></a><span class="symbol">&gt;</span></code></div>

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
<tr>
<td markdown="1">

<a href="input-data-list.html">inputDataList</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">val </span><span class="identifier">inputDataList</span><span class="symbol">: </span><a href="http://docs.oracle.com/javase/6/docs/api/java/util/ArrayList.html"><span class="identifier">ArrayList</span></a><span class="symbol">&lt;</span><a href="http://docs.oracle.com/javase/6/docs/api/java/util/HashMap.html"><span class="identifier">HashMap</span></a><span class="symbol">&lt;</span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html"><span class="identifier">String</span></a><span class="symbol">,</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html"><span class="identifier">String</span></a><span class="symbol">&gt;</span><span class="symbol">&gt;</span></code></div>

</td>
</tr>
</tbody>
</table>

### Functions

<table class="api-docs-table">
<tbody>
<tr>
<td markdown="1">

<a href="do-symbolic-execution.html">doSymbolicExecution</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="identifier">doSymbolicExecution</span><span class="symbol">(</span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="bwdm.symbolicExecutionUnit.SymbolicExecutioner$doSymbolicExecution(bwdm.informationStore.ConditionAndReturnValueList.ConditionAndReturnValue)/_conditionAndReturnValue">_conditionAndReturnValue</span><span class="symbol">:</span>&nbsp;<a href="../../bwdm.information-store/-condition-and-return-value-list/-condition-and-return-value/index.html"><span class="identifier">ConditionAndReturnValue</span></a><br/><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

</td>
</tr>
<tr>
<td markdown="1">

<a href="get-expected-output-data-list.html">getExpectedOutputDataList</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="identifier">getExpectedOutputDataList</span><span class="symbol">(</span><span class="symbol">)</span><span class="symbol">: </span><a href="http://docs.oracle.com/javase/6/docs/api/java/util/ArrayList.html"><span class="identifier">ArrayList</span></a><span class="symbol">&lt;</span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html"><span class="identifier">String</span></a><span class="symbol">&gt;</span></code></div>

</td>
</tr>
<tr>
<td markdown="1">

<a href="make-inequality-expr.html">makeInequalityExpr</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="identifier">makeInequalityExpr</span><span class="symbol">(</span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="bwdm.symbolicExecutionUnit.SymbolicExecutioner$makeInequalityExpr(kotlin.String, kotlin.String, kotlin.String, kotlin.Boolean)/_left">_left</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html"><span class="identifier">String</span></a><span class="symbol">, </span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="bwdm.symbolicExecutionUnit.SymbolicExecutioner$makeInequalityExpr(kotlin.String, kotlin.String, kotlin.String, kotlin.Boolean)/_operator">_operator</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html"><span class="identifier">String</span></a><span class="symbol">, </span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="bwdm.symbolicExecutionUnit.SymbolicExecutioner$makeInequalityExpr(kotlin.String, kotlin.String, kotlin.String, kotlin.Boolean)/_right">_right</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html"><span class="identifier">String</span></a><span class="symbol">, </span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="bwdm.symbolicExecutionUnit.SymbolicExecutioner$makeInequalityExpr(kotlin.String, kotlin.String, kotlin.String, kotlin.Boolean)/_bool">_bool</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html"><span class="identifier">Boolean</span></a><span class="symbol">?</span><br/><span class="symbol">)</span><span class="symbol">: </span><span class="identifier">BoolExpr</span><span class="symbol">?</span></code></div>

</td>
</tr>
<tr>
<td markdown="1">

<a href="make-mod-expr.html">makeModExpr</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="identifier">makeModExpr</span><span class="symbol">(</span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="bwdm.symbolicExecutionUnit.SymbolicExecutioner$makeModExpr(kotlin.String, kotlin.String, kotlin.String, kotlin.Boolean)/_left">_left</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html"><span class="identifier">String</span></a><span class="symbol">, </span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="bwdm.symbolicExecutionUnit.SymbolicExecutioner$makeModExpr(kotlin.String, kotlin.String, kotlin.String, kotlin.Boolean)/_right">_right</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html"><span class="identifier">String</span></a><span class="symbol">, </span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="bwdm.symbolicExecutionUnit.SymbolicExecutioner$makeModExpr(kotlin.String, kotlin.String, kotlin.String, kotlin.Boolean)/_surplus">_surplus</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html"><span class="identifier">String</span></a><span class="symbol">, </span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="bwdm.symbolicExecutionUnit.SymbolicExecutioner$makeModExpr(kotlin.String, kotlin.String, kotlin.String, kotlin.Boolean)/_bool">_bool</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html"><span class="identifier">Boolean</span></a><span class="symbol">?</span><br/><span class="symbol">)</span><span class="symbol">: </span><span class="identifier">BoolExpr</span></code></div>

</td>
</tr>
</tbody>
</table>
