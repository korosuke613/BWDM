---
title: IfElseExprSyntaxTree - 
---

[bwdm.informationStore](../index.html) / [IfElseExprSyntaxTree](./index.html)

# IfElseExprSyntaxTree

`class IfElseExprSyntaxTree`

### Constructors

| [&lt;init&gt;](-init-.html) | `IfElseExprSyntaxTree(_ifExpressionBoby: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`)` |

### Properties

| [count](count.html) | `var count: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [ifElses](if-elses.html) | `internal lateinit var ifElses: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>` |
| [root](root.html) | `lateinit var root: `[`IfNode`](../-if-node/index.html) |

### Functions

| [generateIfElseSyntaxTree](generate-if-else-syntax-tree.html) | `fun generateIfElseSyntaxTree(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [generateIfNode](generate-if-node.html) | `fun generateIfNode(_condition: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, _parentNode: `[`IfNode`](../-if-node/index.html)`?, _nodeLevel: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`IfNode`](../-if-node/index.html) |
| [generateReturnNode](generate-return-node.html) | `fun generateReturnNode(returnStr: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, parentNode: `[`Node`](../-node/index.html)`, _nodeLevel: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`ReturnNode`](../-return-node/index.html) |
| [shapeIfElseBody](shape-if-else-body.html) | `fun shapeIfElseBody(_ifElseBody: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |

