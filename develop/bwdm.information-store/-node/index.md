---
title: Node - 
---

[bwdm.informationStore](../index.html) / [Node](./index.html)

# Node

`abstract class Node`

### Constructors

| [&lt;init&gt;](-init-.html) | `Node()` |

### Properties

| [conditionOrReturnStr](condition-or-return-str.html) | `abstract val conditionOrReturnStr: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [id](id.html) | `var id: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [isIfNode](is-if-node.html) | `abstract var isIfNode: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [isTrueNode](is-true-node.html) | `var isTrueNode: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`?` |
| [nodeLevel](node-level.html) | `var nodeLevel: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [parentNode](parent-node.html) | `var parentNode: `[`Node`](./index.md)`?` |

### Functions

| [getIsIfNode](get-is-if-node.html) | `open fun getIsIfNode(): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |

### Companion Object Properties

| [staticID](static-i-d.html) | `var staticID: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |

### Inheritors

| [IfNode](../-if-node/index.html) | `class IfNode : `[`Node`](./index.md) |
| [ReturnNode](../-return-node/index.html) | `class ReturnNode : `[`Node`](./index.md) |

