---
title: IfElseExprSyntaxTree - 
layout: api
---

<div class='api-docs-breadcrumbs'><a href="../index.html">bwdm.informationStore</a> / <a href="./index.html">IfElseExprSyntaxTree</a></div>

# IfElseExprSyntaxTree

<div class="signature"><code><span class="keyword">class </span><span class="identifier">IfElseExprSyntaxTree</span></code></div>

### Constructors

<table class="api-docs-table">
<tbody>
<tr>
<td markdown="1">

<a href="-init-.html">&lt;init&gt;</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="identifier">IfElseExprSyntaxTree</span><span class="symbol">(</span><span class="parameterName" id="bwdm.informationStore.IfElseExprSyntaxTree$<init>(kotlin.String)/_ifExpressionBoby">_ifExpressionBoby</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html"><span class="identifier">String</span></a><span class="symbol">)</span></code></div>

</td>
</tr>
</tbody>
</table>

### Properties

<table class="api-docs-table">
<tbody>
<tr>
<td markdown="1">

<a href="count.html">count</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">var </span><span class="identifier">count</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html"><span class="identifier">Int</span></a></code></div>

</td>
</tr>
<tr>
<td markdown="1">

<a href="if-elses.html">ifElses</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">internal</span> <span class="keyword">lateinit</span> <span class="keyword">var </span><span class="identifier">ifElses</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html"><span class="identifier">List</span></a><span class="symbol">&lt;</span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html"><span class="identifier">String</span></a><span class="symbol">&gt;</span></code></div>

</td>
</tr>
<tr>
<td markdown="1">

<a href="root.html">root</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">lateinit</span> <span class="keyword">var </span><span class="identifier">root</span><span class="symbol">: </span><a href="../-if-node/index.html"><span class="identifier">IfNode</span></a></code></div>

</td>
</tr>
</tbody>
</table>

### Functions

<table class="api-docs-table">
<tbody>
<tr>
<td markdown="1">

<a href="generate-if-else-syntax-tree.html">generateIfElseSyntaxTree</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="identifier">generateIfElseSyntaxTree</span><span class="symbol">(</span><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

</td>
</tr>
<tr>
<td markdown="1">

<a href="generate-if-node.html">generateIfNode</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="identifier">generateIfNode</span><span class="symbol">(</span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="bwdm.informationStore.IfElseExprSyntaxTree$generateIfNode(kotlin.String, bwdm.informationStore.IfNode, kotlin.Int)/_condition">_condition</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html"><span class="identifier">String</span></a><span class="symbol">, </span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="bwdm.informationStore.IfElseExprSyntaxTree$generateIfNode(kotlin.String, bwdm.informationStore.IfNode, kotlin.Int)/_parentNode">_parentNode</span><span class="symbol">:</span>&nbsp;<a href="../-if-node/index.html"><span class="identifier">IfNode</span></a><span class="symbol">?</span><span class="symbol">, </span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="bwdm.informationStore.IfElseExprSyntaxTree$generateIfNode(kotlin.String, bwdm.informationStore.IfNode, kotlin.Int)/_nodeLevel">_nodeLevel</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html"><span class="identifier">Int</span></a><br/><span class="symbol">)</span><span class="symbol">: </span><a href="../-if-node/index.html"><span class="identifier">IfNode</span></a></code></div>

</td>
</tr>
<tr>
<td markdown="1">

<a href="generate-return-node.html">generateReturnNode</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="identifier">generateReturnNode</span><span class="symbol">(</span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="bwdm.informationStore.IfElseExprSyntaxTree$generateReturnNode(kotlin.String, bwdm.informationStore.Node, kotlin.Int)/returnStr">returnStr</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html"><span class="identifier">String</span></a><span class="symbol">, </span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="bwdm.informationStore.IfElseExprSyntaxTree$generateReturnNode(kotlin.String, bwdm.informationStore.Node, kotlin.Int)/parentNode">parentNode</span><span class="symbol">:</span>&nbsp;<a href="../-node/index.html"><span class="identifier">Node</span></a><span class="symbol">, </span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="bwdm.informationStore.IfElseExprSyntaxTree$generateReturnNode(kotlin.String, bwdm.informationStore.Node, kotlin.Int)/_nodeLevel">_nodeLevel</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html"><span class="identifier">Int</span></a><br/><span class="symbol">)</span><span class="symbol">: </span><a href="../-return-node/index.html"><span class="identifier">ReturnNode</span></a></code></div>

</td>
</tr>
<tr>
<td markdown="1">

<a href="shape-if-else-body.html">shapeIfElseBody</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="identifier">shapeIfElseBody</span><span class="symbol">(</span><span class="parameterName" id="bwdm.informationStore.IfElseExprSyntaxTree$shapeIfElseBody(kotlin.String)/_ifElseBody">_ifElseBody</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html"><span class="identifier">String</span></a><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

</td>
</tr>
</tbody>
</table>
