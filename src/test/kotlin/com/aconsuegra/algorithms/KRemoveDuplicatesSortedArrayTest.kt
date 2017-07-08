package com.aconsuegra.algorithms

import org.hamcrest.CoreMatchers.`is` as iz
import org.junit.Assert.*
import org.junit.Test

class KRemoveDuplicatesSortedArrayTest {
    
    var removeDuplicatesSortedArray = KRemoveDuplicatesSortedArray()

    @Test
    fun test1Entry() {
        assertThat(removeDuplicatesSortedArray.removeDuplicates(intArrayOf(0)), iz(1))
    }

    @Test
    fun test2Entries1Duplicate() {
        assertThat(removeDuplicatesSortedArray.removeDuplicates(intArrayOf(0, 0)), iz(1))
    }

    @Test
    fun test4EntriesNoDuplicates() {
        assertThat(removeDuplicatesSortedArray.removeDuplicates(intArrayOf(0, 1, 2, 3)), iz(4))
    }

    @Test
    fun test4EntriesWithDuplicates() {
        assertThat(removeDuplicatesSortedArray.removeDuplicates(intArrayOf(1, 1, 1, 2)), iz(2))
    }

    @Test
    fun test6EntriesWithDuplicates() {
        assertThat(removeDuplicatesSortedArray.removeDuplicates(intArrayOf(1, 2, 3, 3, 4, 5)), iz(5))
    }
}