package me.consuegra.algorithms

import org.hamcrest.CoreMatchers.`is` as iz
import org.junit.Assert.*
import org.junit.Test

class KTwoSumTest {
    
    val twoSum = KTwoSum()

    @Test(expected = IllegalStateException::class)
    fun twoSumNotFound() {
        twoSum.twoSum(intArrayOf(1, 2, 3), 7)
    }

    @Test
    fun twoSum2Entries() {
        assertThat(twoSum.twoSum(intArrayOf(1, 1), 2), iz(intArrayOf(0, 1)))
    }

    @Test
    fun twoSum3Entries() {
        assertThat(twoSum.twoSum(intArrayOf(1, 2, 3), 3), iz(intArrayOf(0, 1)))
    }

    @Test
    fun twoSum4Entries() {
        assertThat(twoSum.twoSum(intArrayOf(4, 2, 10, 1), 5), iz(intArrayOf(0, 3)))
    }

}