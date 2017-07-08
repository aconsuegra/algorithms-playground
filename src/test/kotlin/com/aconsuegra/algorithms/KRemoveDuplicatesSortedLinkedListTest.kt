package com.aconsuegra.algorithms

import com.aconsuegra.datastructure.KLinkedListUtils
import org.junit.Assert.assertThat
import org.junit.Test
import org.hamcrest.CoreMatchers.`is` as iz

class KRemoveDuplicatesSortedLinkedListTest {

    val removeDuplicatesSortedLinkedList = KRemoveDuplicatesSortedLinkedList()

    @Test
    fun testNoDuplicates() {
        val list = KLinkedListUtils.createLinkedListFor(1, 2)
        assertThat(removeDuplicatesSortedLinkedList.removeDuplicates(list), iz(list))
    }

    @Test
    fun testOneDuplicate() {
        val list = KLinkedListUtils.createLinkedListFor(1, 2, 2)
        assertThat(removeDuplicatesSortedLinkedList.removeDuplicates(list),
                iz(KLinkedListUtils.createLinkedListFor(1, 2)))
    }

    @Test
    fun testSeveralDuplicates() {
        val list = KLinkedListUtils.createLinkedListFor(1, 2, 2, 3, 4, 5, 5, 6, 6, 6)
        assertThat(removeDuplicatesSortedLinkedList.removeDuplicates(list),
                iz(KLinkedListUtils.createLinkedListFor(1, 2, 3, 4, 5, 6)))
    }
    
}