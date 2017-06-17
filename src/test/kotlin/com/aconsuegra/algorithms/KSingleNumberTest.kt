package com.aconsuegra.algorithms

import org.junit.Assert.assertThat
import org.junit.Test
import org.hamcrest.CoreMatchers.`is` as iz

class KSingleNumberTest {
    
    val singleNumber = KSingleNumber()

    @Test
    fun testSmallInput() {
        assertThat(singleNumber.singleNumber(intArrayOf(1, 1, 2)), iz(2))
    }

    @Test
    fun testLargeInput() {
        assertThat(singleNumber.singleNumber(intArrayOf(1, 1, 2, 3, 3, 4, 4)), iz(2))
    }

    @Test
    fun testSmallInputNoMemory() {
        assertThat(singleNumber.singleNumberNoMemory(intArrayOf(1, 1, 2)), iz(2))
    }

    @Test
    fun testLargeInputNoMemory() {
        assertThat(singleNumber.singleNumberNoMemory(intArrayOf(1, 1, 2, 3, 3, 4, 4)), iz(2))
    }
    
}