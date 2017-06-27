package com.aconsuegra.algorithms

import org.hamcrest.CoreMatchers.`is` as iz
import org.junit.Assert.*
import org.junit.Test

class KRomanToIntegerTest {
    
    val romanToInteger = KRomanToInteger()

    @Test
    fun test0() {
        assertThat(romanToInteger.romanToInt(""), iz(0))
    }

    @Test
    fun test11() {
        assertThat(romanToInteger.romanToInt("XI"), iz(11))
    }

    @Test
    fun test9() {
        assertThat(romanToInteger.romanToInt("IX"), iz(9))
    }

    @Test
    fun test1600() {
        assertThat(romanToInteger.romanToInt("MDC"), iz(1600))
    }

    @Test
    fun test949() {
        assertThat(romanToInteger.romanToInt("CMXLIX"), iz(949))
    }

    @Test
    fun test3783() {
        assertThat(romanToInteger.romanToInt("MMMDCCLXXXIII"), iz(3783))
    }
    
}