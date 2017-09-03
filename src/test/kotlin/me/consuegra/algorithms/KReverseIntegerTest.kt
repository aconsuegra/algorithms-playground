package me.consuegra.algorithms

import org.hamcrest.CoreMatchers.`is` as iz
import org.junit.Assert.*
import org.junit.Test

class KReverseIntegerTest {
    
    val reverseInteger = KReverseInteger()

    @Test
    fun test1DigitSolution1() {
        assertThat(reverseInteger.reverse1(1), iz(1))
    }

    @Test
    fun test3DigitsSolution1() {
        assertThat(reverseInteger.reverse1(123), iz(321))
    }

    @Test
    fun testNegativeSolution1() {
        assertThat(reverseInteger.reverse1(-123), iz(-321))
    }

    @Test
    fun testOverflowSolution1() {
        assertThat(reverseInteger.reverse1(1000000003), iz(0))
    }

    @Test
    fun testLeadingZerosSolution1() {
        assertThat(reverseInteger.reverse1(100), iz(1))
    }

    @Test
    fun test1DigitSolution2() {
        assertThat(reverseInteger.reverse2(1), iz(1))
    }

    @Test
    fun test3DigitsSolution2() {
        assertThat(reverseInteger.reverse2(123), iz(321))
    }

    @Test
    fun testNegativeSolution2() {
        assertThat(reverseInteger.reverse2(-123), iz(-321))
    }

    @Test
    fun testOverflowSolution2() {
        assertThat(reverseInteger.reverse2(1000000003), iz(0))
    }

    @Test
    fun testLeadingZerosSolution2() {
        assertThat(reverseInteger.reverse2(100), iz(1))
    }

}