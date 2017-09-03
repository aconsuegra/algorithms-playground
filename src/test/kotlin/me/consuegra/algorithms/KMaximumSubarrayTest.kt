package me.consuegra.algorithms

import org.junit.Assert.*
import org.junit.Test
import org.hamcrest.CoreMatchers.`is` as iz


class KMaximumSubarrayTest {
    
    val maximumSubarray = KMaximumSubarray()

    @Test
    fun testSmallArray() {
        assertThat<Int>(maximumSubarray.maxSubarray(intArrayOf(-2, 1)), iz(1))
    }

    @Test
    fun testMediumArray() {
        assertThat<Int>(maximumSubarray.maxSubarray(intArrayOf(-2, 1, 2, -3)), iz(3))
    }

    @Test
    fun testLargeArray() {
        assertThat<Int>(maximumSubarray.maxSubarray(intArrayOf(-2, 1, -3, 4, -1, 2, 1, -5, 4)), iz(6))
    }
    
}