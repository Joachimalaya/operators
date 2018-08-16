package org.joachimalaya.operators

/**
 * 'Multiply' an arbitrary object using the given addition function.
 *
 * This function will throw an [IllegalArgumentException] if given a multiplicand less than 1.
 */
fun <C> multiplyByAdding(add: (C, C) -> C, toMultiply: C, times: Int): C {
    if (times < 1) {
        throw IllegalArgumentException("multiplying objects of this type with values less than 1 is not defined")
    }
    var result = toMultiply
    for (i in 1 until times) {
        result = add(result, toMultiply)
    }
    return result
}

/**
 * 'Multiply' an arbitrary object using the given addition function. This variant uses null as neutral element so multiplying with 0 will always return null.
 *
 * This function will throw an [IllegalArgumentException] if given a multiplicand less than 0.
 */
fun <C> multiplyByAddingWithNullAsNeutral(add: (C, C) -> C, toMultiply: C, times: Int): C? {
    if (times < 0) {
        throw IllegalArgumentException("multiplying objects of this type with values less than 0 is not defined")
    } else if (times == 0) {
        return null
    } else {
        return multiplyByAdding(add, toMultiply, times)
    }
}

/**
 * 'Multiply' an arbitrary object using the given addition function.
 * As additional parameter this function takes a neutral element so multiplying with 0 using this function will always return the given neutral element.
 *
 * This function will throw an [IllegalArgumentException] if given a multiplicand less than 0.
 */
fun <C> multiplyByAddingWithNeutral(add: (C, C) -> C, toMultiply: C, times: Int, neutralElement: C): C {
    if (times < 0) {
        throw IllegalArgumentException("multiplying objects of this type with values less than 0 is not defined")
    } else if (times == 0) {
        return neutralElement
    } else {
        return multiplyByAdding(add, toMultiply, times)
    }
}