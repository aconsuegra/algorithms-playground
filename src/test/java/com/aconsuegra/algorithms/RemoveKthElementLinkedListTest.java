package com.aconsuegra.algorithms;

import org.junit.Before;
import org.junit.Test;

import com.aconsuegra.datastructure.LinkedListUtils;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class RemoveKthElementLinkedListTest {

    RemoveKthElementLinkedList remove;

    @Before
    public void setUp() {
        remove = new RemoveKthElementLinkedList();
    }

    @Test
    public void testInvalidElement() {
        assertThat(remove.removeNthFromEnd(LinkedListUtils.createLinkedListFor(1, 2, 3, 4, 5), 9),
                is(LinkedListUtils.createLinkedListFor(2, 3, 4, 5)));
    }

    @Test
    public void testOneElement() {
        assertThat(remove.removeNthFromEnd(LinkedListUtils.createLinkedListFor(1), 1),
                is(LinkedListUtils.createLinkedListFor()));
    }

    @Test
    public void testFirstElement() {
        assertThat(remove.removeNthFromEnd(LinkedListUtils.createLinkedListFor(1, 2, 3, 4, 5), 5),
                is(LinkedListUtils.createLinkedListFor(2, 3, 4, 5)));
    }

    @Test
    public void testMiddleElement() {
        assertThat(remove.removeNthFromEnd(LinkedListUtils.createLinkedListFor(1, 2, 3, 4, 5), 3),
                is(LinkedListUtils.createLinkedListFor(1, 2, 4, 5)));
    }

    @Test
    public void testRemoveLastElement() {
        assertThat(remove.removeNthFromEnd(LinkedListUtils.createLinkedListFor(1, 2, 3, 4, 5), 1),
                is(LinkedListUtils.createLinkedListFor(1, 2, 3, 4)));
    }

    @Test
    public void tesOneElementOnePass() {
        assertThat(remove.removeNthFromEndOnePass(LinkedListUtils.createLinkedListFor(1), 1),
                is(LinkedListUtils.createLinkedListFor()));
    }

    @Test
    public void testFirstElementOnePass() {
        assertThat(remove.removeNthFromEndOnePass(LinkedListUtils.createLinkedListFor(1, 2, 3, 4, 5), 5),
                is(LinkedListUtils.createLinkedListFor(2, 3, 4, 5)));
    }

    @Test
    public void testMiddleElementOnePass() {
        assertThat(remove.removeNthFromEndOnePass(LinkedListUtils.createLinkedListFor(1, 2, 3, 4, 5), 3),
                is(LinkedListUtils.createLinkedListFor(1, 2, 4, 5)));
    }

    @Test
    public void testRemoveLastElementOnePass() {
        assertThat(remove.removeNthFromEndOnePass(LinkedListUtils.createLinkedListFor(1, 2, 3, 4, 5), 1),
                is(LinkedListUtils.createLinkedListFor(1, 2, 3, 4)));
    }

}