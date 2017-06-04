package com.aconsuegra.algorithms;

import org.junit.Before;
import org.junit.Test;

import com.aconsuegra.datastructure.LinkedListUtils;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class SumLinkedListsTest {

    SumLinkedLists sumLinkedLists;

    @Before
    public void setUp() {
        sumLinkedLists = new SumLinkedLists();
    }

    @Test
    public void test1Plus1Entries() {
        assertThat(sumLinkedLists.sum(LinkedListUtils.createLinkedListFor(1),
                LinkedListUtils.createLinkedListFor(2)),
                is(LinkedListUtils.createLinkedListFor(3)));
    }

    @Test
    public void test2Plus1Entries() {
        assertThat(sumLinkedLists.sum(LinkedListUtils.createLinkedListFor(2, 1),
                LinkedListUtils.createLinkedListFor(7)),
                is(LinkedListUtils.createLinkedListFor(9, 1)));
    }

    @Test
    public void test3Plus3Entries() {
        assertThat(sumLinkedLists.sum(LinkedListUtils.createLinkedListFor(7, 1, 6),
                LinkedListUtils.createLinkedListFor(5, 9, 2)),
                is(LinkedListUtils.createLinkedListFor(2, 1, 9)));
    }

    @Test
    public void test3Plus3EntriesOverflow() {
        assertThat(sumLinkedLists.sum(LinkedListUtils.createLinkedListFor(9, 7, 8),
                LinkedListUtils.createLinkedListFor(6, 8, 5)),
                is(LinkedListUtils.createLinkedListFor(5, 6, 4, 1)));
    }

    @Test
    public void test1Plus1EntriesRecursive() {
        assertThat(sumLinkedLists.sumRec(LinkedListUtils.createLinkedListFor(1),
                LinkedListUtils.createLinkedListFor(2)),
                is(LinkedListUtils.createLinkedListFor(3)));
    }

    @Test
    public void test2Plus1EntriesRecursive() {
        assertThat(sumLinkedLists.sumRec(LinkedListUtils.createLinkedListFor(2, 1),
                LinkedListUtils.createLinkedListFor(7)),
                is(LinkedListUtils.createLinkedListFor(9, 1)));
    }

    @Test
    public void test3Plus3EntriesRecursive() {
        assertThat(sumLinkedLists.sumRec(LinkedListUtils.createLinkedListFor(7, 1, 6),
                LinkedListUtils.createLinkedListFor(5, 9, 2)),
                is(LinkedListUtils.createLinkedListFor(2, 1, 9)));
    }

    @Test
    public void test3Plus3EntriesOverflowRecursive() {
        assertThat(sumLinkedLists.sumRec(LinkedListUtils.createLinkedListFor(9, 7, 8),
                LinkedListUtils.createLinkedListFor(6, 8, 5)),
                is(LinkedListUtils.createLinkedListFor(5, 6, 4, 1)));
    }

}