package me.consuegra.algorithms

import org.hamcrest.CoreMatchers.`is` as iz
import org.junit.Assert.*
import org.junit.Test

class KRemoveElementTest {
    
    val removeElement = KRemoveElement()

    @Test
    fun testEmptyList() {
        assertThat(removeElement.removeElement(intArrayOf(), 3), iz(0))
    }

    @Test
    fun testNotFoundElement() {
        assertThat(removeElement.removeElement(intArrayOf(3, 2, 2, 3), 4), iz(4))
    }

    @Test
    fun testLastElement() {
        assertThat(removeElement.removeElement(intArrayOf(3, 2, 3, 3), 3), iz(1))
    }

    @Test
    fun testAllButOneElement() {
        assertThat(removeElement.removeElement(intArrayOf(3, 2, 3, 3), 3), iz(1))
    }
    
}