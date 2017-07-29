package com.aconsuegra.algorithms

import org.junit.Assert.*
import org.junit.Test
import org.hamcrest.CoreMatchers.`is` as iz

class KMoveZerosTest {
    
    val moveZeros = KMoveZeros()

    @Test
    fun testEmptyArray() {
        assertThat(moveZeros.move(intArrayOf()), iz(intArrayOf()))
    }

    @Test
    fun test1EntryArray() {
        assertThat(moveZeros.move(intArrayOf(0)), iz(intArrayOf(0)))
    }

    @Test
    fun test2EntriesArray() {
        assertThat(moveZeros.move(intArrayOf(0, 1)), iz(intArrayOf(1, 0)))
    }

    @Test
    fun testNormalArray() {
        assertThat(moveZeros.move(intArrayOf(1, 2, 0, 3, 0, 1, 2)), iz(intArrayOf(1, 2, 3, 1, 2, 0, 0)))
    }
    
}