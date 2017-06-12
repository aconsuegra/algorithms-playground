package com.aconsuegra.algorithms

import org.hamcrest.CoreMatchers.`is` as iz
import org.junit.Assert.*
import org.junit.Test

class KWaveArrayTest {
    
    val waveArray = KWaveArray()

    @Test
    fun testEmptyArray() {
        assertThat(waveArray.wave(intArrayOf()), iz(intArrayOf()))
    }

    @Test
    fun test1EntryArray() {
        assertThat(waveArray.wave(intArrayOf(2)), iz(intArrayOf(2)))
    }

    @Test
    fun test2EntriesArray() {
        assertThat(waveArray.wave(intArrayOf(1, 2)), iz(intArrayOf(2, 1)))
    }

    @Test
    fun testMediumArray() {
        assertThat(waveArray.wave(intArrayOf(3, 1, 2, 5, 4)), iz(intArrayOf(2, 1, 4, 3, 5)))
    }
    
}