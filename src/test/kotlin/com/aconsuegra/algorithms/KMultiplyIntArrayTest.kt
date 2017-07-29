package com.aconsuegra.algorithms

import org.junit.Assert.*
import org.junit.Test
import org.hamcrest.CoreMatchers.`is` as iz

class KMultiplyIntArrayTest {
    
    val multiplyIntArray = KMultiplyIntArray()

    @Test
    fun testSmallArraySolution1() {
        assertThat(multiplyIntArray.multiplyIntArrayOption1(intArrayOf(3, 3)), iz(intArrayOf(3, 3)))
    }

    @Test
    fun testMediumArrayWithZeroSolution1() {
        assertThat(multiplyIntArray.multiplyIntArrayOption1(intArrayOf(6, -4, 0, 5)),
                iz(intArrayOf(0, 0, -120, 0)))
    }

    @Test
    fun testMediumArraySolution1() {
        assertThat(multiplyIntArray.multiplyIntArrayOption1(intArrayOf(1, 2, 3, 4)), iz(intArrayOf(24, 12, 8, 6)))
    }

    @Test
    fun testSmallArraySolution2() {
        assertThat(multiplyIntArray.multiplyIntArrayOption2(intArrayOf(3, 3)), iz(intArrayOf(3, 3)))
    }

    @Test
    fun testMediumArrayWithZeroSolution2() {
        assertThat(multiplyIntArray.multiplyIntArrayOption2(intArrayOf(6, -4, 0, 5)),
                iz(intArrayOf(0, 0, -120, 0)))
    }

    @Test
    fun testMediumArraySolution2() {
        assertThat(multiplyIntArray.multiplyIntArrayOption2(intArrayOf(1, 2, 3, 4)), iz(intArrayOf(24, 12, 8, 6)))
    }
    
}