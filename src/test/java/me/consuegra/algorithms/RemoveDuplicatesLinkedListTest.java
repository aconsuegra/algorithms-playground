package me.consuegra.algorithms;

import org.junit.Before;
import org.junit.Test;

import me.consuegra.datastructure.LinkedListUtils;
import me.consuegra.datastructure.ListNode;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class RemoveDuplicatesLinkedListTest {

    RemoveDuplicatesLinkedList removeDuplicatesLinkedList;

    @Before
    public void setUp() {
        removeDuplicatesLinkedList = new RemoveDuplicatesLinkedList();
    }

    @Test
    public void testNoDuplicates() {
        ListNode<Integer> list = LinkedListUtils.createLinkedListFor(1, 2);
        assertThat(removeDuplicatesLinkedList.removeDuplicates(list), is(list));
    }

    @Test
    public void test1DuplicateEdges() {
        ListNode<Integer> list = LinkedListUtils.createLinkedListFor(1, 2, 1);
        assertThat(removeDuplicatesLinkedList.removeDuplicates(list),
                is(LinkedListUtils.createLinkedListFor(1, 2)));
    }

    @Test
    public void test1DuplicateMiddle() {
        ListNode<Integer> list = LinkedListUtils.createLinkedListFor(1, 2, 2);
        assertThat(removeDuplicatesLinkedList.removeDuplicates(list),
                is(LinkedListUtils.createLinkedListFor(1, 2)));
    }

    @Test
    public void testSeveralDuplicates() {
        ListNode<Integer> list = LinkedListUtils.createLinkedListFor(1, 2, 6, 2, 3, 4, 5, 4, 6, 6, 6);
        assertThat(removeDuplicatesLinkedList.removeDuplicates(list),
                is(LinkedListUtils.createLinkedListFor(1, 2, 6, 3, 4, 5)));
    }

}