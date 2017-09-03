package me.consuegra.algorithms

import me.consuegra.datastructure.KLinkedListUtils
import org.junit.Assert.assertThat
import org.junit.Test
import org.hamcrest.CoreMatchers.`is` as iz

class KSumLinkedListsTest {
    
    val sumLinkedLists = KSumLinkedLists()

    @Test
    fun test1Plus1Entries() {
        assertThat(sumLinkedLists.sum(KLinkedListUtils.createLinkedListFor(1),
                KLinkedListUtils.createLinkedListFor(2)),
                iz(KLinkedListUtils.createLinkedListFor(3)))
    }

    @Test
    fun test2Plus1Entries() {
        assertThat(sumLinkedLists.sum(KLinkedListUtils.createLinkedListFor(2, 1),
                KLinkedListUtils.createLinkedListFor(7)),
                iz(KLinkedListUtils.createLinkedListFor(9, 1)))
    }

    @Test
    fun test3Plus3Entries() {
        assertThat(sumLinkedLists.sum(KLinkedListUtils.createLinkedListFor(7, 1, 6),
                KLinkedListUtils.createLinkedListFor(5, 9, 2)),
                iz(KLinkedListUtils.createLinkedListFor(2, 1, 9)))
    }

    @Test
    fun test3Plus3EntriesOverflow() {
        assertThat(sumLinkedLists.sum(KLinkedListUtils.createLinkedListFor(9, 7, 8),
                KLinkedListUtils.createLinkedListFor(6, 8, 5)),
                iz(KLinkedListUtils.createLinkedListFor(5, 6, 4, 1)))
    }

    @Test
    fun test1Plus1EntriesRecursive() {
        assertThat(sumLinkedLists.sumRec(KLinkedListUtils.createLinkedListFor(1),
                KLinkedListUtils.createLinkedListFor(2)),
                iz(KLinkedListUtils.createLinkedListFor(3)))
    }

    @Test
    fun test2Plus1EntriesRecursive() {
        assertThat(sumLinkedLists.sumRec(KLinkedListUtils.createLinkedListFor(2, 1),
                KLinkedListUtils.createLinkedListFor(7)),
                iz(KLinkedListUtils.createLinkedListFor(9, 1)))
    }

    @Test
    fun test3Plus3EntriesRecursive() {
        assertThat(sumLinkedLists.sumRec(KLinkedListUtils.createLinkedListFor(7, 1, 6),
                KLinkedListUtils.createLinkedListFor(5, 9, 2)),
                iz(KLinkedListUtils.createLinkedListFor(2, 1, 9)))
    }

    @Test
    fun test3Plus3EntriesOverflowRecursive() {
        assertThat(sumLinkedLists.sumRec(KLinkedListUtils.createLinkedListFor(9, 7, 8),
                KLinkedListUtils.createLinkedListFor(6, 8, 5)),
                iz(KLinkedListUtils.createLinkedListFor(5, 6, 4, 1)))
    }
}