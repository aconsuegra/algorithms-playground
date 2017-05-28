package com.aconsuegra.algorithms;

import org.junit.Before;
import org.junit.Test;

import com.aconsuegra.datastructure.LinkedListUtils;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class PalindromeLinkedListTest {

    PalindromeLinkedList palindromeLinkedList;

    @Before
    public void setUp() {
        palindromeLinkedList = new PalindromeLinkedList();
    }

    @Test
    public void test1EntrySolution1() {
        assertThat(palindromeLinkedList.isPalindrome1(LinkedListUtils.createLinkedListFor(1)), is(true));
    }

    @Test
    public void testMediumListNoPalindromeSolution1() {
        assertThat(palindromeLinkedList.isPalindrome1(LinkedListUtils.createLinkedListFor(1, 2, 3)),
                is(false));
    }

    @Test
    public void testMediumListSolution1() {
        assertThat(palindromeLinkedList.isPalindrome1(LinkedListUtils.createLinkedListFor(1, 2, 1)),
                is(true));
    }

    @Test
    public void testLargeListSolution1() {
        assertThat(palindromeLinkedList.isPalindrome1(LinkedListUtils.createLinkedListFor(1, 2, 3, 2, 1)),
                is(true));
    }

    @Test
    public void test1EntrySolution2() {
        assertThat(palindromeLinkedList.isPalindrome2(LinkedListUtils.createLinkedListFor(1)), is(true));
    }

    @Test
    public void testMediumListNoPalindromeSolution2() {
        assertThat(palindromeLinkedList.isPalindrome2(LinkedListUtils.createLinkedListFor(1, 2, 3)),
                is(false));
    }

    @Test
    public void testMediumListSolution2() {
        assertThat(palindromeLinkedList.isPalindrome2(LinkedListUtils.createLinkedListFor(1, 2, 1)),
                is(true));
    }

    @Test
    public void testLargeListSolution2() {
        assertThat(palindromeLinkedList.isPalindrome2(LinkedListUtils.createLinkedListFor(1, 2, 3, 2, 1)),
                is(true));
    }

}