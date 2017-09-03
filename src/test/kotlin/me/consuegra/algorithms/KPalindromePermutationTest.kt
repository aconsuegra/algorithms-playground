package me.consuegra.algorithms

import org.hamcrest.CoreMatchers.`is` as iz
import org.junit.Assert.*
import org.junit.Test

class KPalindromePermutationTest {
    
    val palindromePermutation = KPalindromePermutation()

    @Test
    fun testEmptyInput() {
        assertThat(palindromePermutation.isPalindromePermutation(""), iz(false))
    }

    @Test
    fun testOneCharInput() {
        assertThat(palindromePermutation.isPalindromePermutation("a"), iz(true))
    }

    @Test
    fun testTwoCharsInvalidInput() {
        assertThat(palindromePermutation.isPalindromePermutation("ab"), iz(false))
    }

    @Test
    fun testTwoCharsValidInput() {
        assertThat(palindromePermutation.isPalindromePermutation("aa"), iz(true))
    }

    @Test
    fun testValidInput() {
        assertThat(palindromePermutation.isPalindromePermutation("Tact Coa"), iz(true))
    }

    @Test
    fun testInvalidInput() {
        assertThat(palindromePermutation.isPalindromePermutation("Tact j Coab"), iz(false))
    }
    
}