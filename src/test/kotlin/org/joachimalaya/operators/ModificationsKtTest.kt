package org.joachimalaya.operators

import io.kotlintest.shouldBe
import io.kotlintest.specs.AnnotationSpec
import io.kotlintest.specs.Test
import kotlin.test.assertFailsWith

class ModificationsKtTest : AnnotationSpec() {

    @Test
    fun listTimesInt() {
        val exampleList = listOf("a", "b", "c", "1", "2", "3")

        exampleList * 3 shouldBe exampleList + exampleList + exampleList
        exampleList * 0 shouldBe emptyList()

        assertFailsWith<IllegalArgumentException> { exampleList * -1 }
    }

    @Test
    fun intTimesList() {
        val exampleList = listOf("a", "b", "c", "1", "2", "3")

        3 * exampleList shouldBe exampleList + exampleList + exampleList
        0 * exampleList shouldBe emptyList()

        assertFailsWith<IllegalArgumentException> { -1 * exampleList }
    }
}