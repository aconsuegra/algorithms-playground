package me.consuegra.algorithms

import org.hamcrest.CoreMatchers.`is` as iz
import org.junit.Assert.*
import org.junit.Test

class KStringCompressionTest {
    
    val stringCompression = KStringCompression()

    @Test
    fun test1Character() {
        assertThat(stringCompression.compress("abbcccccaaa"), iz("a1b2c5a3"))
    }

    @Test
    fun testTwoCharacters() {
        assertThat(stringCompression.compress("aa"), iz("a2"))
    }

    @Test
    fun testMultipleCharacters() {
        assertThat(stringCompression.compress("abbcccccaaa"), iz("a1b2c5a3"))
    }

}