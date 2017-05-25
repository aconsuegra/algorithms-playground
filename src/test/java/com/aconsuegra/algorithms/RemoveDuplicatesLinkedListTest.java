package com.aconsuegra.algorithms;

import org.junit.Before;
import org.junit.Test;

import com.aconsuegra.datastructure.LinkedListUtils;
import com.aconsuegra.datastructure.ListNode;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class RemoveDuplicatesLinkedListTest {

    RemoveDuplicatesLinkedList removeDuplicatesLinkedList;

    @Before
    public void setUp() {
        removeDuplicatesLinkedList = new RemoveDuplicatesLinkedList();
    }

    @Test
    public void removeDuplicates() {
        ListNode<Integer> list1 = LinkedListUtils.createLinkedListFor(1, 2);
        removeDuplicatesLinkedList.removeDuplicates(list1);
        assertThat(list1, is(list1));

        list1 = LinkedListUtils.createLinkedListFor(1, 2, 1);
        removeDuplicatesLinkedList.removeDuplicates(list1);
        assertThat(list1, is(LinkedListUtils.createLinkedListFor(1, 2)));

        list1 = LinkedListUtils.createLinkedListFor(1, 2, 2, 3, 4, 5, 4, 6, 6, 6);
        removeDuplicatesLinkedList.removeDuplicates(list1);
        assertThat(list1, is(LinkedListUtils.createLinkedListFor(1, 2, 3, 4, 5, 6)));
    }

}