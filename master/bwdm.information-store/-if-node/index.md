[bwdm.informationStore](../index.md) / [IfNode](./index.md)

# IfNode

`class IfNode : `[`Node`](../-node/index.md)

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `IfNode(conditionStr: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, _nodeLevel: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`)` |

### Properties

| Name | Summary |
|---|---|
| [conditionFalseNode](condition-false-node.md) | `var conditionFalseNode: `[`Node`](../-node/index.md)`?` |
| [conditionOrReturnStr](condition-or-return-str.md) | `val conditionOrReturnStr: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [conditionTrueNode](condition-true-node.md) | `var conditionTrueNode: `[`Node`](../-node/index.md)`?` |
| [isIfNode](is-if-node.md) | `var isIfNode: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |

### Inherited Properties

| Name | Summary |
|---|---|
| [id](../-node/id.md) | `var id: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [isTrueNode](../-node/is-true-node.md) | `var isTrueNode: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`?` |
| [nodeLevel](../-node/node-level.md) | `var nodeLevel: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [parentNode](../-node/parent-node.md) | `var parentNode: `[`Node`](../-node/index.md)`?` |

### Inherited Functions

| Name | Summary |
|---|---|
| [getIsIfNode](../-node/get-is-if-node.md) | `open fun getIsIfNode(): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
