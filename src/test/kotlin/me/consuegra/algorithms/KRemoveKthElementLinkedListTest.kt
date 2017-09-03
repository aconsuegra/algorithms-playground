package me.consuegra.algorithms

import me.consuegra.datastructure.KLinkedListUtils
import org.junit.Assert.assertThat
import org.junit.Test
import org.hamcrest.CoreMatchers.`is` as iz

class KRemoveKthElementLinkedListTest {
    
    val removeElement = KRemoveKthElementLinkedList()

    @Test
    fun tesOneElementOnePass() {
        assertThat(removeElement.removeKthFromEnd(KLinkedListUtils.createLinkedListFor(1), 1),
                iz(KLinkedListUtils.createLinkedListFor()))
    }

    @Test
    fun testFirstElementOnePass() {
        assertThat(removeElement.removeKthFromEnd(KLinkedListUtils.createLinkedListFor(1, 2, 3, 4, 5), 5),
                iz(KLinkedListUtils.createLinkedListFor(2, 3, 4, 5)))
    }

    @Test
    fun testMiddleElementOnePass() {
        assertThat(removeElement.removeKthFromEnd(KLinkedListUtils.createLinkedListFor(1, 2, 3, 4, 5), 3),
                iz(KLinkedListUtils.createLinkedListFor(1, 2, 4, 5)))
    }

    @Test
    fun testRemoveLastElementOnePass() {
        assertThat(removeElement.removeKthFromEnd(KLinkedListUtils.createLinkedListFor(1, 2, 3, 4, 5), 1),
                iz(KLinkedListUtils.createLinkedListFor(1, 2, 3, 4)))
    }
}