package com.aconsuegra.algorithms

import com.aconsuegra.datastructure.KLinkedListUtils
import org.junit.Assert.assertThat
import org.junit.Test
import org.hamcrest.CoreMatchers.`is` as iz

class KRemoveDuplicatesLinkedListTest {
    
    val removeDuplicatesLinkedList = KRemoveDuplicatesLinkedList()

    @Test
    fun testNoDuplicates() {
        val list = KLinkedListUtils.createLinkedListFor(1, 2)
        assertThat(removeDuplicatesLinkedList.removeDuplicates(list), iz(list))
    }

    @Test
    fun test1DuplicateEdges() {
        val list = KLinkedListUtils.createLinkedListFor(1, 2, 1)
        assertThat(removeDuplicatesLinkedList.removeDuplicates(list),
                iz(KLinkedListUtils.createLinkedListFor(1, 2)))
    }

    @Test
    fun test1DuplicateMiddle() {
        val list = KLinkedListUtils.createLinkedListFor(1, 2, 2)
        assertThat(removeDuplicatesLinkedList.removeDuplicates(list),
                iz(KLinkedListUtils.createLinkedListFor(1, 2)))
    }

    @Test
    fun testSeveralDuplicates() {
        val list = KLinkedListUtils.createLinkedListFor(1, 2, 6, 2, 3, 4, 5, 4, 6, 6, 6)
        assertThat(removeDuplicatesLinkedList.removeDuplicates(list),
                iz(KLinkedListUtils.createLinkedListFor(1, 2, 6, 3, 4, 5)))
    }
    
}