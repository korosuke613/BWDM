[bwdm.informationStore](../index.md) / [IfElseExprSyntaxTree](./index.md)

# IfElseExprSyntaxTree

`class IfElseExprSyntaxTree`

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `IfElseExprSyntaxTree(_ifExpressionBoby: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`)` |

### Properties

| Name | Summary |
|---|---|
| [count](count.md) | `var count: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [ifElses](if-elses.md) | `internal lateinit var ifElses: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>` |
| [root](root.md) | `lateinit var root: `[`IfNode`](../-if-node/index.md) |

### Functions

| Name | Summary |
|---|---|
| [generateIfElseSyntaxTree](generate-if-else-syntax-tree.md) | `fun generateIfElseSyntaxTree(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [generateIfNode](generate-if-node.md) | `fun generateIfNode(_condition: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, _parentNode: `[`IfNode`](../-if-node/index.md)`?, _nodeLevel: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`IfNode`](../-if-node/index.md) |
| [generateReturnNode](generate-return-node.md) | `fun generateReturnNode(returnStr: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, parentNode: `[`Node`](../-node/index.md)`, _nodeLevel: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`ReturnNode`](../-return-node/index.md) |
| [shapeIfElseBody](shape-if-else-body.md) | `fun shapeIfElseBody(_ifElseBody: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
