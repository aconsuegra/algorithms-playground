package com.aconsuegra.algorithms;

import org.junit.Before;
import org.junit.Test;

import com.aconsuegra.datastructure.LinkedListUtils;
import com.aconsuegra.datastructure.ListNode;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class RemoveDuplicatesSortedLinkedListTest {

    RemoveDuplicatesSortedLinkedList removeDuplicatesSortedLinkedList;

    @Before
    public void setUp() {
        removeDuplicatesSortedLinkedList = new RemoveDuplicatesSortedLinkedList();
    }

    @Test
    public void testNoDuplicates() {
        ListNode<Integer> list = LinkedListUtils.createLinkedListFor(1, 2);
        assertThat(removeDuplicatesSortedLinkedList.removeDuplicates(list), is(list));
    }

    @Test
    public void testOneDuplicate() {
        ListNode<Integer> list = LinkedListUtils.createLinkedListFor(1, 2, 2);
        assertThat(removeDuplicatesSortedLinkedList.removeDuplicates(list),
                is(LinkedListUtils.createLinkedListFor(1, 2)));
    }

    @Test
    public void testSeveralDuplicates() {
        ListNode<Integer> list = LinkedListUtils.createLinkedListFor(1, 2, 2, 3, 4, 5, 5, 6, 6, 6);
        assertThat(removeDuplicatesSortedLinkedList.removeDuplicates(list),
                is(LinkedListUtils.createLinkedListFor(1, 2, 3, 4, 5, 6)));
    }
}