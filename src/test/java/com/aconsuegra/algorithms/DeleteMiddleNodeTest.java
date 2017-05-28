package com.aconsuegra.algorithms;

import org.junit.Before;
import org.junit.Test;

import com.aconsuegra.datastructure.LinkedListUtils;
import com.aconsuegra.datastructure.ListNode;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class DeleteMiddleNodeTest {

    DeleteMiddleNode deleteMiddleNode;

    @Before
    public void setUp() {
        deleteMiddleNode = new DeleteMiddleNode();
    }

    @Test
    public void testDeleteMiddle() {
        ListNode<Integer> list = LinkedListUtils.createLinkedListFor(1, 2, 3);
        deleteMiddleNode.deleteNode(list.getNext());
        assertThat(list, is(LinkedListUtils.createLinkedListFor(1, 3)));
    }

    @Test
    public void testDeleteThird() {
        ListNode<Integer> list = LinkedListUtils.createLinkedListFor(1, 2, 3, 4, 5, 6);
        deleteMiddleNode.deleteNode(list.getNext().getNext());
        assertThat(list, is(LinkedListUtils.createLinkedListFor(1, 2, 4, 5, 6)));
    }

}