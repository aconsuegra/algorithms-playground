package com.aconsuegra.algorithms

import org.hamcrest.CoreMatchers.`is` as iz
import org.junit.Assert.*
import org.junit.Test

class KPlusOneTest {
    
    val plusOne = KPlusOne()

    @Test
    fun test1Digit() {
        assertThat(plusOne.plusOne(intArrayOf(0)), iz(intArrayOf(1)))
    }

    @Test
    fun test1DigitOverflow() {
        assertThat(plusOne.plusOne(intArrayOf(9)), iz(intArrayOf(1, 0)))
    }

    @Test
    fun test2Digits() {
        assertThat(plusOne.plusOne(intArrayOf(3, 4)), iz(intArrayOf(3, 5)))
    }

    @Test
    fun test2DigitsOverflow() {
        assertThat(plusOne.plusOne(intArrayOf(9, 9)), iz(intArrayOf(1, 0, 0)))
    }

    @Test
    fun test3Digits() {
        assertThat(plusOne.plusOne(intArrayOf(8, 9, 9)), iz(intArrayOf(9, 0, 0)))
    }
}