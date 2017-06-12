package com.aconsuegra.algorithms

import org.hamcrest.CoreMatchers.`is` as iz
import org.junit.Assert.*
import org.junit.Test

class KValidParenthesisTest {
    
    val validParenthesis = KValidParenthesis()

    @Test
    fun testOneParenthesis() {
        assertThat(validParenthesis.isValid("["), iz(false))
    }

    @Test
    fun testTwoParenthesis() {
        assertThat(validParenthesis.isValid("()"), iz(true))
    }

    @Test
    fun testFourInvalidParenthesis() {
        assertThat(validParenthesis.isValid("([)]"), iz(false))
    }

    @Test
    fun testSixInvalidParenthesis() {
        assertThat(validParenthesis.isValid("([]{})"), iz(true))
    }

    @Test
    fun testSixValidParenthesis() {
        assertThat(validParenthesis.isValid("()[]{}"), iz(true))
    }
    
}