package com.aconsuegra.algorithms;

import org.junit.Before;
import org.junit.Test;

import com.aconsuegra.datastructure.LinkedListUtils;
import com.aconsuegra.datastructure.ListNode;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MergeTwoSortedLinkedListsTest {

    MergeTwoSortedLinkedLists mergeTwoSortedLinkedLists;

    @Before
    public void setUp() {
        mergeTwoSortedLinkedLists = new MergeTwoSortedLinkedLists();
    }

    @Test
    public void testMergeTwoLists() {
        ListNode<Integer> list1 = LinkedListUtils.createLinkedListFor(1);
        ListNode<Integer> list2 = LinkedListUtils.createLinkedListFor(null);
        assertThat(mergeTwoSortedLinkedLists.mergeTwoLists(list1, list2), is(list1));

        list1 = LinkedListUtils.createLinkedListFor(null);
        list2 = LinkedListUtils.createLinkedListFor(2);
        assertThat(mergeTwoSortedLinkedLists.mergeTwoLists(list1, list2), is(list2));

        list1 = LinkedListUtils.createLinkedListFor(1);
        list2 = LinkedListUtils.createLinkedListFor(2);
        ListNode<Integer> result = LinkedListUtils.createLinkedListFor(1, 2);
        assertThat(mergeTwoSortedLinkedLists.mergeTwoLists(list1, list2), is(result));

        list1 = LinkedListUtils.createLinkedListFor(1);
        list2 = LinkedListUtils.createLinkedListFor(1);
        result = LinkedListUtils.createLinkedListFor(1, 1);
        assertThat(mergeTwoSortedLinkedLists.mergeTwoLists(list1, list2), is(result));

        list1 = LinkedListUtils.createLinkedListFor(1, 2);
        list2 = LinkedListUtils.createLinkedListFor(3, 4);
        result = LinkedListUtils.createLinkedListFor(1, 2, 3, 4);
        assertThat(mergeTwoSortedLinkedLists.mergeTwoLists(list1, list2), is(result));

        list1 = LinkedListUtils.createLinkedListFor(1, 3);
        list2 = LinkedListUtils.createLinkedListFor(2, 4, 5);
        result = LinkedListUtils.createLinkedListFor(1, 2, 3, 4, 5);
        assertThat(mergeTwoSortedLinkedLists.mergeTwoLists(list1, list2), is(result));
    }

    @Test
    public void testMergeTwoListsRec() {
        ListNode<Integer> list1 = LinkedListUtils.createLinkedListFor(1);
        ListNode<Integer> list2 = LinkedListUtils.createLinkedListFor(null);
        assertThat(mergeTwoSortedLinkedLists.mergeTwoListsRec(list1, list2), is(list1));

        list1 = LinkedListUtils.createLinkedListFor(null);
        list2 = LinkedListUtils.createLinkedListFor(2);
        assertThat(mergeTwoSortedLinkedLists.mergeTwoListsRec(list1, list2), is(list2));

        list1 = LinkedListUtils.createLinkedListFor(1);
        list2 = LinkedListUtils.createLinkedListFor(2);
        ListNode<Integer> result = LinkedListUtils.createLinkedListFor(1, 2);
        assertThat(mergeTwoSortedLinkedLists.mergeTwoListsRec(list1, list2), is(result));

        list1 = LinkedListUtils.createLinkedListFor(1);
        list2 = LinkedListUtils.createLinkedListFor(1);
        result = LinkedListUtils.createLinkedListFor(1, 1);
        assertThat(mergeTwoSortedLinkedLists.mergeTwoListsRec(list1, list2), is(result));

        list1 = LinkedListUtils.createLinkedListFor(1, 2);
        list2 = LinkedListUtils.createLinkedListFor(3, 4);
        result = LinkedListUtils.createLinkedListFor(1, 2, 3, 4);
        assertThat(mergeTwoSortedLinkedLists.mergeTwoListsRec(list1, list2), is(result));

        list1 = LinkedListUtils.createLinkedListFor(1, 3);
        list2 = LinkedListUtils.createLinkedListFor(2, 4, 5);
        result = LinkedListUtils.createLinkedListFor(1, 2, 3, 4, 5);
        assertThat(mergeTwoSortedLinkedLists.mergeTwoListsRec(list1, list2), is(result));
    }

}