package com.aconsuegra.algorithms

import org.junit.Assert.assertThat
import org.junit.Test
import org.hamcrest.CoreMatchers.`is` as iz

class KStringPermutationsTest {
    
    val stringPermutations = KStringPermutations()

    @Test
    fun test1Character() {
        assertThat(stringPermutations.permutations("a"), iz(listOf("a")))
    }

    @Test
    fun test4Characters() {
        assertThat(stringPermutations.permutations("abcd"), iz(listOf("abcd", "abdc", "acbd",
                "acdb", "adbc", "adcb", "bacd", "badc", "bcad", "bcda", "bdac", "bdca", "cabd", "cadb", "cbad",
                "cbda", "cdab", "cdba", "dabc", "dacb", "dbac", "dbca", "dcab", "dcba")))
    }
}