[bwdm.informationStore](../index.md) / [Node](./index.md)

# Node

`abstract class Node`

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `Node()` |

### Properties

| Name | Summary |
|---|---|
| [conditionOrReturnStr](condition-or-return-str.md) | `abstract val conditionOrReturnStr: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [id](id.md) | `var id: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [isIfNode](is-if-node.md) | `abstract var isIfNode: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [isTrueNode](is-true-node.md) | `var isTrueNode: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`?` |
| [nodeLevel](node-level.md) | `var nodeLevel: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [parentNode](parent-node.md) | `var parentNode: `[`Node`](./index.md)`?` |

### Functions

| Name | Summary |
|---|---|
| [getIsIfNode](get-is-if-node.md) | `open fun getIsIfNode(): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |

### Companion Object Properties

| Name | Summary |
|---|---|
| [staticID](static-i-d.md) | `var staticID: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |

### Inheritors

| Name | Summary |
|---|---|
| [IfNode](../-if-node/index.md) | `class IfNode : `[`Node`](./index.md) |
| [ReturnNode](../-return-node/index.md) | `class ReturnNode : `[`Node`](./index.md) |
