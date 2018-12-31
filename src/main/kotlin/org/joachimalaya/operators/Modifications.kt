package org.joachimalaya.operators

/**
 * 'Multiply' a List by adding it to itself repeatedly.
 * If a List is multiplied with 0 the result is an empty List of the same type.
 *
 * This function will throw an [IllegalArgumentException] if given a multiplicand less than 0.
 */
operator fun <K> List<K>.times(times: Int) = multiplyByAddingWithNeutral({ a, b -> a + b }, this, times, emptyList())

/**
 * 'Multiply' a List by adding it to itself repeatedly.
 * If a List is multiplied with 0 the result is an empty List of the same type.
 *
 * This function will throw an [IllegalArgumentException] if given a multiplicand less than 0.
 */
operator fun <K> Int.times(toMultiply: List<K>) = multiplyByAddingWithNeutral({ a, b -> a + b }, toMultiply, this, emptyList())

/**
 * 'Multiply' a String by concatenating it to itself repeatedly.
 * If a String is multiplied with 0 the result is the empty String.
 *
 * This function will throw an [IllegalArgumentException] if given a multiplicand less than 0.
 */
operator fun String.times(times: Int) = multiplyByAddingWithNeutral(String::plus, this, times, "")

/**
 * 'Multiply' a String by concatenating it to itself repeatedly.
 * If a String is multiplied with 0 the result is the empty String.
 *
 * This function will throw an [IllegalArgumentException] if given a multiplicand less than 0.
 */
operator fun Int.times(toMultiply: String) = multiplyByAddingWithNeutral(String::plus, toMultiply, this, "")