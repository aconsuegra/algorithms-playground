package me.consuegra.algorithms

import me.consuegra.datastructure.KLinkedListUtils
import org.junit.Assert.assertThat
import org.junit.Test
import org.hamcrest.CoreMatchers.`is` as iz

class KPalindromeLinkedListTest {

    val palindromeLinkedList = KPalindromeLinkedList()

    @Test
    fun test1EntrySolution1() {
        assertThat(palindromeLinkedList.isPalindromeSolution1(KLinkedListUtils.createLinkedListFor(1)), iz(true))
    }

    @Test
    fun testMediumListNoPalindromeSolution1() {
        assertThat(palindromeLinkedList.isPalindromeSolution1(KLinkedListUtils.createLinkedListFor(1, 2, 3)),
                iz(false))
    }

    @Test
    fun testMediumListSolution1() {
        assertThat(palindromeLinkedList.isPalindromeSolution1(KLinkedListUtils.createLinkedListFor(1, 2, 1)),
                iz(true))
    }

    @Test
    fun testLargeListSolution1() {
        assertThat(palindromeLinkedList.isPalindromeSolution1(KLinkedListUtils.createLinkedListFor(1, 2, 3, 2, 1)),
                iz(true))
    }

    @Test
    fun test1EntrySolution2() {
        assertThat(palindromeLinkedList.isPalindromeSolution2(KLinkedListUtils.createLinkedListFor(1)), iz(true))
    }

    @Test
    fun testMediumListNoPalindromeSolution2() {
        assertThat(palindromeLinkedList.isPalindromeSolution2(KLinkedListUtils.createLinkedListFor(1, 2, 3)),
                iz(false))
    }

    @Test
    fun testMediumListSolution2() {
        assertThat(palindromeLinkedList.isPalindromeSolution2(KLinkedListUtils.createLinkedListFor(1, 2, 1)),
                iz(true))
    }

    @Test
    fun testLargeListSolution2() {
        assertThat(palindromeLinkedList.isPalindromeSolution2(KLinkedListUtils.createLinkedListFor(1, 2, 3, 2, 1)),
                iz(true))
    }
}