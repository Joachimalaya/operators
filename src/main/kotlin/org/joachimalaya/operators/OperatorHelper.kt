package org.joachimalaya.operators

/**
 * 'Multiply' an arbitrary object using the given addition function.
 *
 * This function will throw an [IllegalArgumentException] if given a multiplicand less than 1.
 */
fun <C> multiplyByAdding(add: (C, C) -> C, toMultiply: C, times: Int): C {
    if (times < 1) {
        throw IllegalArgumentException("multiplying arbitrary objects with values less than 1 is not defined")
    }
    var result = toMultiply
    for (i in 1..times) {
        result = add(result, toMultiply)
    }
    return result
}

/**
 * 'Multiply' an arbitrary object using the given addition function.
 *
 * This function will throw an [IllegalArgumentException] if given a multiplier less than 1.
 */
fun <C> multiplyByAdding(add: (C, C) -> C, times: Int, toMultiply: C) = multiplyByAdding(add, toMultiply,  times)