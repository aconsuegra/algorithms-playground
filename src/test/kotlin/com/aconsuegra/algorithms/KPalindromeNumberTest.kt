package com.aconsuegra.algorithms

import org.hamcrest.CoreMatchers.`is` as iz
import org.junit.Assert.*
import org.junit.Test

class KPalindromeNumberTest {
    
    val palindromeNumber = KPalindromeNumber()

    @Test
    fun test1Digit() {
        assertThat(palindromeNumber.isPalindrome(0), iz(true))
    }

    @Test
    fun test1NegativeDigit() {
        assertThat(palindromeNumber.isPalindrome(-1), iz(false))
    }

    @Test
    fun test3ConsecutiveDigits() {
        assertThat(palindromeNumber.isPalindrome(123), iz(false))
    }

    @Test
    fun test5DigitsPalindrome() {
        assertThat(palindromeNumber.isPalindrome(12321), iz(true))
    }

    @Test
    fun testOverflow() {
        assertThat(palindromeNumber.isPalindrome(1000000003), iz(false))
    }

    @Test
    fun testSameDigit() {
        assertThat(palindromeNumber.isPalindrome(111111), iz(true))
    }
    
}