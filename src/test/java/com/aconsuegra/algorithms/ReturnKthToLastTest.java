package com.aconsuegra.algorithms;

import org.junit.Before;
import org.junit.Test;

import com.aconsuegra.datastructure.LinkedListUtils;
import com.aconsuegra.datastructure.ListNode;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.*;

public class ReturnKthToLastTest {

    ReturnKthToLast returnKthToLast;

    @Before
    public void setUp() {
        returnKthToLast = new ReturnKthToLast();
    }

    @Test
    public void test1stToLastLargeListSolution1() {
        ListNode<Integer> list = LinkedListUtils.createLinkedListFor(1, 2, 3, 4);
        ListNode<Integer> result = LinkedListUtils.createLinkedListFor(3, 4);
        assertThat(returnKthToLast.findKthElement1(list, 1), is(result));
    }

    @Test
    public void test4thToLastLargeListSolution1() {
        ListNode<Integer> list = LinkedListUtils.createLinkedListFor(1, 2, 3, 4);
        ListNode<Integer> result = LinkedListUtils.createLinkedListFor(4);
        assertThat(returnKthToLast.findKthElement1(list, 0), is(result));
    }

    @Test
    public void test1stToLastSmallListSolution1() {
        ListNode<Integer> list = LinkedListUtils.createLinkedListFor(1);
        ListNode<Integer> result = LinkedListUtils.createLinkedListFor(1);
        assertThat(returnKthToLast.findKthElement1(list, 0), is(result));
    }

    @Test
    public void testInvalidPositionSolution1() {
        ListNode<Integer> list = LinkedListUtils.createLinkedListFor(1);
        assertThat(returnKthToLast.findKthElement1(list, 1), is(nullValue()));
    }

    @Test
    public void test1stToLastLargeListSolution2() {
        ListNode<Integer> list = LinkedListUtils.createLinkedListFor(1, 2, 3, 4);
        ListNode<Integer> result = LinkedListUtils.createLinkedListFor(3, 4);
        assertThat(returnKthToLast.findKthElement2(list, 1), is(result));
    }

    @Test
    public void test4thToLastLargeListSolution2() {
        ListNode<Integer> list = LinkedListUtils.createLinkedListFor(1, 2, 3, 4);
        ListNode<Integer> result = LinkedListUtils.createLinkedListFor(4);
        assertThat(returnKthToLast.findKthElement2(list, 0), is(result));
    }

    @Test
    public void test1stToLastSmallListSolution2() {
        ListNode<Integer> list = LinkedListUtils.createLinkedListFor(1);
        ListNode<Integer> result = LinkedListUtils.createLinkedListFor(1);
        assertThat(returnKthToLast.findKthElement2(list, 0), is(result));
    }

    @Test
    public void testInvalidPositionSolution2() {
        ListNode<Integer> list = LinkedListUtils.createLinkedListFor(1);
        assertThat(returnKthToLast.findKthElement2(list, 1), is(nullValue()));
    }

}