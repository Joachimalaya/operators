package org.joachimalaya.operators

private fun <K> multiplyListByAdding(toMultiply: List<K>, times: Int): List<K> {
    if (times < 0) {
        throw IllegalArgumentException("multiplying lists with values less than 0 is not defined")
    }
    var result = listOf<K>()
    for (i in 0..times) {
        result += toMultiply
    }
    return result
}

operator fun <K> List<K>.times(times: Int) = multiplyListByAdding(this, times)
operator fun <K> Int.times(toMultiply: List<K>) = multiplyListByAdding(toMultiply, this)