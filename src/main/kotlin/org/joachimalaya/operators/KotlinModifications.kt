package org.joachimalaya.operators

operator fun <K> List<K>.times(x: Int) = multiplyByAdding({ a, b -> a + b }, this, x)