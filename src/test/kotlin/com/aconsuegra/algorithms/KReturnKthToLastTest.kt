package com.aconsuegra.algorithms

import com.aconsuegra.datastructure.KLinkedListUtils
import org.hamcrest.CoreMatchers.nullValue
import org.junit.Assert.assertThat
import org.junit.Test
import org.hamcrest.CoreMatchers.`is` as iz

class KReturnKthToLastTest {
    
    val returnKthToLast = KReturnKthToLast()

    @Test
    fun test1stToLastLargeListSolution1() {
        val list = KLinkedListUtils.createLinkedListFor(1, 2, 3, 4)
        val result = KLinkedListUtils.createLinkedListFor(3, 4)
        assertThat(returnKthToLast.findKthElement1(list, 1), iz(result))
    }

    @Test
    fun test4thToLastLargeListSolution1() {
        val list = KLinkedListUtils.createLinkedListFor(1, 2, 3, 4)
        val result = KLinkedListUtils.createLinkedListFor(4)
        assertThat(returnKthToLast.findKthElement1(list, 0), iz(result))
    }

    @Test
    fun test1stToLastSmallListSolution1() {
        val list = KLinkedListUtils.createLinkedListFor(1)
        val result = KLinkedListUtils.createLinkedListFor(1)
        assertThat(returnKthToLast.findKthElement1(list, 0), iz(result))
    }

    @Test
    fun testInvalidPositionSolution1() {
        val list = KLinkedListUtils.createLinkedListFor(1)
        assertThat(returnKthToLast.findKthElement1(list, 1), iz(nullValue()))
    }

    @Test
    fun test1stToLastLargeListSolution2() {
        val list = KLinkedListUtils.createLinkedListFor(1, 2, 3, 4)
        val result = KLinkedListUtils.createLinkedListFor(3, 4)
        assertThat(returnKthToLast.findKthElement2(list, 1), iz(result))
    }

    @Test
    fun test4thToLastLargeListSolution2() {
        val list = KLinkedListUtils.createLinkedListFor(1, 2, 3, 4)
        val result = KLinkedListUtils.createLinkedListFor(4)
        assertThat(returnKthToLast.findKthElement2(list, 0), iz(result))
    }

    @Test
    fun test1stToLastSmallListSolution2() {
        val list = KLinkedListUtils.createLinkedListFor(1)
        val result = KLinkedListUtils.createLinkedListFor(1)
        assertThat(returnKthToLast.findKthElement2(list, 0), iz(result))
    }

    @Test
    fun testInvalidPositionSolution2() {
        val list = KLinkedListUtils.createLinkedListFor(1)
        assertThat(returnKthToLast.findKthElement2(list, 1), iz(nullValue()))
    }
}