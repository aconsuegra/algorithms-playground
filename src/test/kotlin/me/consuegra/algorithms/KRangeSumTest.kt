package me.consuegra.algorithms

import org.hamcrest.CoreMatchers.nullValue
import org.junit.Assert.assertThat
import org.junit.Test
import org.hamcrest.CoreMatchers.`is` as iz

class KRangeSumTest {
    
    val rangeSum = KRangeSum()

    @Test
    fun test1EntryNotFound() {
        assertThat(rangeSum.rangeSum(intArrayOf(0), 4), iz(nullValue()))
    }

    @Test
    fun test2EntriesNotFound() {
        assertThat(rangeSum.rangeSum(intArrayOf(1, 2), 4), iz(nullValue()))
    }

    @Test
    fun test1EntryFound() {
        assertThat(rangeSum.rangeSum(intArrayOf(2), 2), iz(intArrayOf(0, 0)))
    }

    @Test
    fun test2EntriesFound() {
        assertThat(rangeSum.rangeSum(intArrayOf(1, 2), 3), iz(intArrayOf(0, 1)))
    }

    @Test
    fun test5EntriesFound() {
        assertThat(rangeSum.rangeSum(intArrayOf(5, 4, 3, 2, 1), 7), iz(intArrayOf(1, 2)))
    }

    @Test
    fun test5EntriesFoundFullArray() {
        assertThat(rangeSum.rangeSum(intArrayOf(1, 2, 3, 4, 5), 15), iz(intArrayOf(0, 4)))
    }

}