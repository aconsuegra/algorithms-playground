package com.aconsuegra.algorithms

import com.aconsuegra.datastructure.KLinkedListUtils
import org.junit.Assert.assertThat
import org.junit.Test
import org.hamcrest.CoreMatchers.`is` as iz

class KReverseLinkedListTest {
    
    
    val reverseLinkedList = KReverseLinkedList()

    @Test
    fun testOneEntrySolution1() {
        val list = KLinkedListUtils.createLinkedListFor(1)
        val result = KLinkedListUtils.createLinkedListFor(1)
        assertThat(reverseLinkedList.reverseOption1(list), iz(result))
    }

    @Test
    fun testMultipleEntriesSolution1() {
        val list = KLinkedListUtils.createLinkedListFor(1, 2, 3)
        val result = KLinkedListUtils.createLinkedListFor(3, 2, 1)
        assertThat(reverseLinkedList.reverseOption1(list), iz(result))
    }

    @Test
    fun testMultipleEntries2Solution1() {
        val list = KLinkedListUtils.createLinkedListFor(1, 2, 1)
        val result = KLinkedListUtils.createLinkedListFor(1, 2, 1)
        assertThat(reverseLinkedList.reverseOption1(list), iz(result))
    }

    @Test
    fun testOneEntrySolution2() {
        val list = KLinkedListUtils.createLinkedListFor(1)
        val result = KLinkedListUtils.createLinkedListFor(1)
        assertThat(reverseLinkedList.reverseOption2(list), iz(result))
    }

    @Test
    fun testMultipleEntriesSolution2() {
        val list = KLinkedListUtils.createLinkedListFor(1, 2, 3)
        val result = KLinkedListUtils.createLinkedListFor(3, 2, 1)
        assertThat(reverseLinkedList.reverseOption2(list), iz(result))
    }

    @Test
    fun testMultipleEntries2Solution2() {
        val list = KLinkedListUtils.createLinkedListFor(1, 2, 1)
        val result = KLinkedListUtils.createLinkedListFor(1, 2, 1)
        assertThat(reverseLinkedList.reverseOption2(list), iz(result))
    }

    @Test
    fun testOneEntrySolutionRec() {
        val list = KLinkedListUtils.createLinkedListFor(1)
        val result = KLinkedListUtils.createLinkedListFor(1)
        assertThat(reverseLinkedList.reverseOptionRec(list), iz(result))
    }

    @Test
    fun testMultipleEntriesSolutionRec() {
        val list = KLinkedListUtils.createLinkedListFor(1, 2, 3)
        val result = KLinkedListUtils.createLinkedListFor(3, 2, 1)
        assertThat(reverseLinkedList.reverseOptionRec(list), iz(result))
    }

    @Test
    fun testMultipleEntries2SolutionRec() {
        val list = KLinkedListUtils.createLinkedListFor(1, 2, 1)
        val result = KLinkedListUtils.createLinkedListFor(1, 2, 1)
        assertThat(reverseLinkedList.reverseOptionRec(list), iz(result))
    }
}