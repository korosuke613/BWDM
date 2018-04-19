---
title: InformationExtractor - 
layout: api
---

<div class='api-docs-breadcrumbs'><a href="../index.html">bwdm.informationStore</a> / <a href="./index.html">InformationExtractor</a></div>

# InformationExtractor

<div class="signature"><code><span class="keyword">class </span><span class="identifier">InformationExtractor</span></code></div>

information what got from VDM++ specification file by syntax analyse with VDMJ

### Constructors

<table class="api-docs-table">
<tbody>
<tr>
<td markdown="1">

<a href="-init-.html">&lt;init&gt;</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="identifier">InformationExtractor</span><span class="symbol">(</span><span class="parameterName" id="bwdm.informationStore.InformationExtractor$<init>(kotlin.String)/vdmFilePath">vdmFilePath</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html"><span class="identifier">String</span></a><span class="symbol">)</span></code></div>

information what got from VDM++ specification file by syntax analyse with VDMJ


</td>
</tr>
</tbody>
</table>

### Properties

<table class="api-docs-table">
<tbody>
<tr>
<td markdown="1">

<a href="argument-types.html">argumentTypes</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">val </span><span class="identifier">argumentTypes</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-array-list/index.html"><span class="identifier">ArrayList</span></a><span class="symbol">&lt;</span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html"><span class="identifier">String</span></a><span class="symbol">&gt;</span></code></div>

</td>
</tr>
<tr>
<td markdown="1">

<a href="condition-and-return-value-list.html">conditionAndReturnValueList</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">val </span><span class="identifier">conditionAndReturnValueList</span><span class="symbol">: </span><a href="../-condition-and-return-value-list/index.html"><span class="identifier">ConditionAndReturnValueList</span></a></code></div>

</td>
</tr>
<tr>
<td markdown="1">

<a href="function-name.html">functionName</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">var </span><span class="identifier">functionName</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html"><span class="identifier">String</span></a><span class="symbol">?</span></code></div>

</td>
</tr>
<tr>
<td markdown="1">

<a href="if-condition-bodies.html">ifConditionBodies</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">val </span><span class="identifier">ifConditionBodies</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-hash-map/index.html"><span class="identifier">HashMap</span></a><span class="symbol">&lt;</span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html"><span class="identifier">String</span></a><span class="symbol">,</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-array-list/index.html"><span class="identifier">ArrayList</span></a><span class="symbol">&lt;</span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-hash-map/index.html"><span class="identifier">HashMap</span></a><span class="symbol">&lt;</span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html"><span class="identifier">String</span></a><span class="symbol">,</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html"><span class="identifier">String</span></a><span class="symbol">&gt;</span><span class="symbol">&gt;</span><span class="symbol">&gt;</span></code></div>

a parameter to ArrayList of if-conditions.
ArrayList of ifConditions of each parameter.


</td>
</tr>
<tr>
<td markdown="1">

<a href="if-condition-bodies-in-came-forward.html">ifConditionBodiesInCameForward</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">val </span><span class="identifier">ifConditionBodiesInCameForward</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-array-list/index.html"><span class="identifier">ArrayList</span></a><span class="symbol">&lt;</span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html"><span class="identifier">String</span></a><span class="symbol">&gt;</span></code></div>

</td>
</tr>
<tr>
<td markdown="1">

<a href="if-conditions.html">ifConditions</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">val </span><span class="identifier">ifConditions</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-hash-map/index.html"><span class="identifier">HashMap</span></a><span class="symbol">&lt;</span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html"><span class="identifier">String</span></a><span class="symbol">,</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-array-list/index.html"><span class="identifier">ArrayList</span></a><span class="symbol">&lt;</span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-hash-map/index.html"><span class="identifier">HashMap</span></a><span class="symbol">&lt;</span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html"><span class="identifier">String</span></a><span class="symbol">,</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html"><span class="identifier">String</span></a><span class="symbol">&gt;</span><span class="symbol">&gt;</span><span class="symbol">&gt;</span></code></div>

a parameter to ArrayList of HashMaps that is parsed each if-expression.
ArrayList of HashMap of parsed if-expr.


</td>
</tr>
<tr>
<td markdown="1">

<a href="if-else-expr-syntax-tree.html">ifElseExprSyntaxTree</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">var </span><span class="identifier">ifElseExprSyntaxTree</span><span class="symbol">: </span><a href="../-if-else-expr-syntax-tree/index.html"><span class="identifier">IfElseExprSyntaxTree</span></a><span class="symbol">?</span></code></div>

</td>
</tr>
<tr>
<td markdown="1">

<a href="if-expression-body.html">ifExpressionBody</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">var </span><span class="identifier">ifExpressionBody</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html"><span class="identifier">String</span></a><span class="symbol">?</span></code></div>

</td>
</tr>
<tr>
<td markdown="1">

<a href="parameters.html">parameters</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">val </span><span class="identifier">parameters</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-array-list/index.html"><span class="identifier">ArrayList</span></a><span class="symbol">&lt;</span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html"><span class="identifier">String</span></a><span class="symbol">&gt;</span></code></div>

</td>
</tr>
<tr>
<td markdown="1">

<a href="return-value.html">returnValue</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">var </span><span class="identifier">returnValue</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html"><span class="identifier">String</span></a><span class="symbol">?</span></code></div>

type of return value


</td>
</tr>
<tr>
<td markdown="1">

<a href="vdm-file-path.html">vdmFilePath</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">val </span><span class="identifier">vdmFilePath</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html"><span class="identifier">String</span></a></code></div>

</td>
</tr>
</tbody>
</table>

### Functions

<table class="api-docs-table">
<tbody>
<tr>
<td markdown="1">

<a href="parse.html">parse</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="identifier">parse</span><span class="symbol">(</span><span class="parameterName" id="bwdm.informationStore.InformationExtractor$parse(kotlin.String, kotlin.String)/condition">condition</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html"><span class="identifier">String</span></a><span class="symbol">, </span><span class="parameterName" id="bwdm.informationStore.InformationExtractor$parse(kotlin.String, kotlin.String)/parameter">parameter</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html"><span class="identifier">String</span></a><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

</td>
</tr>
<tr>
<td markdown="1">

<a href="parse-if-conditions.html">parseIfConditions</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="identifier">parseIfConditions</span><span class="symbol">(</span><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

</td>
</tr>
</tbody>
</table>

### Companion Object Functions

<table class="api-docs-table">
<tbody>
<tr>
<td markdown="1">

<a href="mod-judge.html">modJudge</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="identifier">modJudge</span><span class="symbol">(</span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="bwdm.informationStore.InformationExtractor.Companion$modJudge(kotlin.String, kotlin.String, kotlin.Int, java.util.HashMap((kotlin.String, )))/condition">condition</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html"><span class="identifier">String</span></a><span class="symbol">, </span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="bwdm.informationStore.InformationExtractor.Companion$modJudge(kotlin.String, kotlin.String, kotlin.Int, java.util.HashMap((kotlin.String, )))/operator">operator</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html"><span class="identifier">String</span></a><span class="symbol">, </span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="bwdm.informationStore.InformationExtractor.Companion$modJudge(kotlin.String, kotlin.String, kotlin.Int, java.util.HashMap((kotlin.String, )))/indexOfoperator">indexOfoperator</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html"><span class="identifier">Int</span></a><span class="symbol">, </span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="bwdm.informationStore.InformationExtractor.Companion$modJudge(kotlin.String, kotlin.String, kotlin.Int, java.util.HashMap((kotlin.String, )))/hm">hm</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-hash-map/index.html"><span class="identifier">HashMap</span></a><span class="symbol">&lt;</span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html"><span class="identifier">String</span></a><span class="symbol">,</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html"><span class="identifier">String</span></a><span class="symbol">&gt;</span><br/><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

</td>
</tr>
</tbody>
</table>
