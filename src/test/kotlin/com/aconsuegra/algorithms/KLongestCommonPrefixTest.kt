package com.aconsuegra.algorithms

import org.junit.Assert.*
import org.junit.Test
import org.hamcrest.CoreMatchers.`is` as iz

class KLongestCommonPrefixTest {
    
    val longestCommonPrefix = KLongestCommonPrefix()

    @Test
    fun testNoStrings() {
        assertThat(longestCommonPrefix.longestCommonPrefix(arrayOf<String>()), iz(""))
    }

    @Test
    fun testEmptyString() {
        assertThat(longestCommonPrefix.longestCommonPrefix(arrayOf("")), iz(""))
    }

    @Test
    fun test1String() {
        assertThat(longestCommonPrefix.longestCommonPrefix(arrayOf("abc")), iz("abc"))
    }

    @Test
    fun test2Strings() {
        assertThat(longestCommonPrefix.longestCommonPrefix(arrayOf("abcde", "abc")), iz("abc"))
    }

    @Test
    fun test4Strings() {
        assertThat(longestCommonPrefix.longestCommonPrefix(arrayOf("aaaaa", "aaa", "aab", "a")),
                iz("a"))
    }

    @Test
    fun test5Strings() {
        assertThat(longestCommonPrefix.longestCommonPrefix(arrayOf("aaaaa", "aaa", "aab", "a", "b")),
                iz(""))
    }
}