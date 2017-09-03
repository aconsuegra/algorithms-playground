package me.consuegra.algorithms

import me.consuegra.datastructure.KLinkedListUtils
import org.junit.Assert.assertThat
import org.junit.Test
import org.hamcrest.CoreMatchers.`is` as iz

class KMergeTwoSortedLinkedListsTest {

    val mergeSortedLinkedLists = KMergeTwoSortedLinkedLists()

    @Test
    fun testSecondListNullSolution1() {
        val list1 = KLinkedListUtils.createLinkedListFor(1)
        assertThat(mergeSortedLinkedLists.merge(list1, null), iz(list1))
    }

    @Test
    fun testFirstListNullSolution1() {
        val list2 = KLinkedListUtils.createLinkedListFor(2)
        assertThat(mergeSortedLinkedLists.merge(null, list2), iz(list2))
    }

    @Test
    fun test1EntryListsSolution1() {
        val list1 = KLinkedListUtils.createLinkedListFor(1)
        val list2 = KLinkedListUtils.createLinkedListFor(2)
        val result = KLinkedListUtils.createLinkedListFor(1, 2)
        assertThat(mergeSortedLinkedLists.merge(list1, list2), iz(result))
    }

    @Test
    fun testSameSizeSolution1() {
        val list1 = KLinkedListUtils.createLinkedListFor(1, 2)
        val list2 = KLinkedListUtils.createLinkedListFor(3, 4)
        val result = KLinkedListUtils.createLinkedListFor(1, 2, 3, 4)
        assertThat(mergeSortedLinkedLists.merge(list1, list2), iz(result))
    }

    @Test
    fun testDifferentSizesSolution1() {
        val list1 = KLinkedListUtils.createLinkedListFor(1, 3)
        val list2 = KLinkedListUtils.createLinkedListFor(2, 4, 5)
        val result = KLinkedListUtils.createLinkedListFor(1, 2, 3, 4, 5)
        assertThat(mergeSortedLinkedLists.merge(list1, list2), iz(result))
    }

    @Test
    fun testSecondListNullSolution2() {
        val list1 = KLinkedListUtils.createLinkedListFor(1)
        assertThat(mergeSortedLinkedLists.mergeRec(list1, null), iz(list1))
    }

    @Test
    fun testFirstListNullSolution2() {
        val list2 = KLinkedListUtils.createLinkedListFor(2)
        assertThat(mergeSortedLinkedLists.mergeRec(null, list2), iz(list2))
    }

    @Test
    fun test1EntryListsSolution2() {
        val list1 = KLinkedListUtils.createLinkedListFor(1)
        val list2 = KLinkedListUtils.createLinkedListFor(2)
        val result = KLinkedListUtils.createLinkedListFor(1, 2)
        assertThat(mergeSortedLinkedLists.mergeRec(list1, list2), iz(result))
    }

    @Test
    fun testSameSizeSolution2() {
        val list1 = KLinkedListUtils.createLinkedListFor(1, 2)
        val list2 = KLinkedListUtils.createLinkedListFor(3, 4)
        val result = KLinkedListUtils.createLinkedListFor(1, 2, 3, 4)
        assertThat(mergeSortedLinkedLists.mergeRec(list1, list2), iz(result))
    }

    @Test
    fun testDifferentSizesSolution2() {
        val list1 = KLinkedListUtils.createLinkedListFor(1, 3)
        val list2 = KLinkedListUtils.createLinkedListFor(2, 4, 5)
        val result = KLinkedListUtils.createLinkedListFor(1, 2, 3, 4, 5)
        assertThat(mergeSortedLinkedLists.mergeRec(list1, list2), iz(result))
    }

}