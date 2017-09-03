package me.consuegra.algorithms

import org.junit.Assert.*
import org.junit.Test
import org.hamcrest.CoreMatchers.`is` as iz

class KMaxConsecutiveOnesTest {
    
    val maxConsecutiveOnes = KMaxConsecutiveOnes()

    @Test
    fun testEndArray() {
        assertThat(maxConsecutiveOnes.findMaxConsecutiveOnes(intArrayOf(1, 1, 0, 1, 1, 1)), iz(3))
    }

    @Test
    fun testAllOverArray() {
        assertThat(maxConsecutiveOnes.findMaxConsecutiveOnes(intArrayOf(1, 0, 0, 1, 0, 1, 0)), iz(1))
    }

    @Test
    fun testMiddleAndEndArray() {
        assertThat(maxConsecutiveOnes.findMaxConsecutiveOnes(intArrayOf(1, 0, 1, 1, 0, 1)), iz(2))
    }
    
}