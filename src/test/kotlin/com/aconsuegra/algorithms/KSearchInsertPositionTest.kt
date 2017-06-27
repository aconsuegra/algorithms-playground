package com.aconsuegra.algorithms

import org.hamcrest.CoreMatchers.`is` as iz
import org.junit.Assert.*
import org.junit.Test

class KSearchInsertPositionTest {
    
    val searchInsertPosition = KSearchInsertPosition()

    @Test
    fun testEmptyArray() {
        assertThat(searchInsertPosition.searchInsert(intArrayOf(), 4), iz(0))
    }

    @Test
    fun test1EntryNotFound() {
        assertThat(searchInsertPosition.searchInsert(intArrayOf(0), 4), iz(1))
    }

    @Test
    fun test1EntryFound() {
        assertThat(searchInsertPosition.searchInsert(intArrayOf(0), 0), iz(0))
    }

    @Test
    fun test2EntriesNotFound() {
        assertThat(searchInsertPosition.searchInsert(intArrayOf(1, 3), 0), iz(0))
    }

    @Test
    fun test2EntriesFound() {
        assertThat(searchInsertPosition.searchInsert(intArrayOf(1, 3), 3), iz(1))
    }

    @Test
    fun testLargeArrayNotFound() {
        assertThat(searchInsertPosition.searchInsert(intArrayOf(3, 5, 7, 9, 10), 8), iz(3))
    }

    @Test
    fun testLargeArrayFound() {
        assertThat(searchInsertPosition.searchInsert(intArrayOf(3, 5, 7, 9, 10), 7), iz(2))
    }

    @Test
    fun testEmptyArrayRec() {
        assertThat(searchInsertPosition.searchInsertRec(intArrayOf(), 4), iz(0))
    }

    @Test
    fun test1EntryNotFoundRec() {
        assertThat(searchInsertPosition.searchInsertRec(intArrayOf(0), 4), iz(1))
    }

    @Test
    fun test1EntryFoundRec() {
        assertThat(searchInsertPosition.searchInsertRec(intArrayOf(0), 0), iz(0))
    }

    @Test
    fun test2EntriesNotFoundRec() {
        assertThat(searchInsertPosition.searchInsertRec(intArrayOf(1, 3), 0), iz(0))
    }

    @Test
    fun test2EntriesFoundRec() {
        assertThat(searchInsertPosition.searchInsertRec(intArrayOf(1, 3), 3), iz(1))
    }

    @Test
    fun testLargeArrayNotFoundRec() {
        assertThat(searchInsertPosition.searchInsertRec(intArrayOf(3, 5, 7, 9, 10), 8), iz(3))
    }

    @Test
    fun testLargeArrayFoundRec() {
        assertThat(searchInsertPosition.searchInsertRec(intArrayOf(3, 5, 7, 9, 10), 7), iz(2))
    }
}