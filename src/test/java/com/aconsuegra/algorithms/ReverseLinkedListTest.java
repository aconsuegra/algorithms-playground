package com.aconsuegra.algorithms;

import org.junit.Before;
import org.junit.Test;

import com.aconsuegra.datastructure.LinkedListUtils;
import com.aconsuegra.datastructure.ListNode;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ReverseLinkedListTest {

    ReverseLinkedList reverseLinkedList;

    @Before
    public void setUp() {
        reverseLinkedList = new ReverseLinkedList();
    }

    @Test
    public void testOneEntrySolution1() {
        ListNode<Integer> list = LinkedListUtils.createLinkedListFor(1);
        ListNode<Integer> result = LinkedListUtils.createLinkedListFor(1);
        assertThat(reverseLinkedList.reverse1(list), is(result));
    }

    @Test
    public void testMultipleEntriesSolution1() {
        ListNode<Integer> list = LinkedListUtils.createLinkedListFor(1, 2, 3);
        ListNode<Integer> result = LinkedListUtils.createLinkedListFor(3, 2, 1);
        assertThat(reverseLinkedList.reverse1(list), is(result));
    }

    @Test
    public void testMultipleEntries2Solution1() {
        ListNode<Integer> list = LinkedListUtils.createLinkedListFor(1, 2, 1);
        ListNode<Integer> result = LinkedListUtils.createLinkedListFor(1, 2, 1);
        assertThat(reverseLinkedList.reverse1(list), is(result));
    }

    @Test
    public void testOneEntrySolution2() {
        ListNode<Integer> list = LinkedListUtils.createLinkedListFor(1);
        ListNode<Integer> result = LinkedListUtils.createLinkedListFor(1);
        assertThat(reverseLinkedList.reverse2(list), is(result));
    }

    @Test
    public void testMultipleEntriesSolution2() {
        ListNode<Integer> list = LinkedListUtils.createLinkedListFor(1, 2, 3);
        ListNode<Integer> result = LinkedListUtils.createLinkedListFor(3, 2, 1);
        assertThat(reverseLinkedList.reverse2(list), is(result));
    }

    @Test
    public void testMultipleEntries2Solution2() {
        ListNode<Integer> list = LinkedListUtils.createLinkedListFor(1, 2, 1);
        ListNode<Integer> result = LinkedListUtils.createLinkedListFor(1, 2, 1);
        assertThat(reverseLinkedList.reverse2(list), is(result));
    }

    @Test
    public void testOneEntrySolutionRec() {
        ListNode<Integer> list = LinkedListUtils.createLinkedListFor(1);
        ListNode<Integer> result = LinkedListUtils.createLinkedListFor(1);
        assertThat(reverseLinkedList.reverseRec(list), is(result));
    }

    @Test
    public void testMultipleEntriesSolutionRec() {
        ListNode<Integer> list = LinkedListUtils.createLinkedListFor(1, 2, 3);
        ListNode<Integer> result = LinkedListUtils.createLinkedListFor(3, 2, 1);
        assertThat(reverseLinkedList.reverseRec(list), is(result));
    }

    @Test
    public void testMultipleEntries2SolutionRec() {
        ListNode<Integer> list = LinkedListUtils.createLinkedListFor(1, 2, 1);
        ListNode<Integer> result = LinkedListUtils.createLinkedListFor(1, 2, 1);
        assertThat(reverseLinkedList.reverseRec(list), is(result));
    }

}