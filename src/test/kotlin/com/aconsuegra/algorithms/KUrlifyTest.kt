package com.aconsuegra.algorithms

import org.hamcrest.CoreMatchers.`is` as iz
import org.junit.Assert.*
import org.junit.Test

class KUrlifyTest {
    
    val urlify = KUrlify()

    @Test
    fun testOneSpaceStartOneSpaceEnd() {
        assertThat(urlify.replaceSpaces(" John     ".toCharArray(), 6), iz("%20John%20".toCharArray()))
    }

    @Test
    fun testOneSpaceMiddle() {
        assertThat(urlify.replaceSpaces("Mr John Smith    ".toCharArray(), 13),
                iz("Mr%20John%20Smith".toCharArray()))
    }

    @Test
    fun testThreeSpacessMiddle() {
        assertThat(urlify.replaceSpaces("Mr   John      ".toCharArray(), 9), iz("Mr%20%20%20John".toCharArray()))
    }
    
}