---
title: ExpectedOutputDataGenerator - 
---

[bwdm.boundaryValueAnalysisUnit](../index.html) / [ExpectedOutputDataGenerator](./index.html)

# ExpectedOutputDataGenerator

`class ExpectedOutputDataGenerator`

### Constructors

| [&lt;init&gt;](-init-.html) | `internal ExpectedOutputDataGenerator(ie: `[`InformationExtractor`](../../bwdm.information-store/-information-extractor/index.html)`, _root: `[`IfNode`](../../bwdm.information-store/-if-node/index.html)`, _inputDataList: `[`ArrayList`](http://docs.oracle.com/javase/6/docs/api/java/util/ArrayList.html)`<`[`HashMap`](http://docs.oracle.com/javase/6/docs/api/java/util/HashMap.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`>>)` |

### Properties

| [expectedOutputDataList](expected-output-data-list.html) | `internal val expectedOutputDataList: `[`ArrayList`](http://docs.oracle.com/javase/6/docs/api/java/util/ArrayList.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>` |
| [ie](ie.html) | `val ie: `[`InformationExtractor`](../../bwdm.information-store/-information-extractor/index.html) |

### Functions

| [extractExpectedOutputDataRecursively](extract-expected-output-data-recursively.html) | `fun extractExpectedOutputDataRecursively(_node: `[`Node`](../../bwdm.information-store/-node/index.html)`, _inputData: `[`HashMap`](http://docs.oracle.com/javase/6/docs/api/java/util/HashMap.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [judge](judge.html) | `fun judge(_parsedCondition: `[`HashMap`](http://docs.oracle.com/javase/6/docs/api/java/util/HashMap.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>, _inputData: `[`HashMap`](http://docs.oracle.com/javase/6/docs/api/java/util/HashMap.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`>, _parameter: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [judgeInequality](judge-inequality.html) | `fun judgeInequality(_leftHand: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`?, _operator: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, _rightHand: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`?): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [judgeMod](judge-mod.html) | `fun judgeMod(_leftHand: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`?, _rightHand: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`?, _surplus: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`?): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [makeExpectedOutputDataofOutoftype](make-expected-output-dataof-outoftype.html) | `fun makeExpectedOutputDataofOutoftype(_inputDataList: `[`ArrayList`](http://docs.oracle.com/javase/6/docs/api/java/util/ArrayList.html)`<`[`HashMap`](http://docs.oracle.com/javase/6/docs/api/java/util/HashMap.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`>>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |

### Companion Object Functions

| [makeParsedCondition](make-parsed-condition.html) | `fun makeParsedCondition(_condition: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`HashMap`](http://docs.oracle.com/javase/6/docs/api/java/util/HashMap.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>` |

