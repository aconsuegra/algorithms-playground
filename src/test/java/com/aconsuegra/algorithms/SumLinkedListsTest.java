package com.aconsuegra.algorithms;

import org.junit.Before;
import org.junit.Test;

import com.aconsuegra.datastructure.LinkedListUtils;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class SumLinkedListsTest {

    SumLinkedLists sumLinkedLists;

    @Before
    public void setUp() {
        sumLinkedLists = new SumLinkedLists();
    }

    @Test
    public void testSumLinkedLists() {
        assertThat(sumLinkedLists.sum(LinkedListUtils.createLinkedListFor(1),
                LinkedListUtils.createLinkedListFor(2)),
                is(LinkedListUtils.createLinkedListFor(3)));

        assertThat(sumLinkedLists.sum(LinkedListUtils.createLinkedListFor(2, 1),
                LinkedListUtils.createLinkedListFor(7)),
                is(LinkedListUtils.createLinkedListFor(9, 1)));

        assertThat(sumLinkedLists.sum(LinkedListUtils.createLinkedListFor(7, 1, 6),
                LinkedListUtils.createLinkedListFor(5, 9, 2)),
                is(LinkedListUtils.createLinkedListFor(2, 1, 9)));

        assertThat(sumLinkedLists.sum(LinkedListUtils.createLinkedListFor(9, 7, 8),
                LinkedListUtils.createLinkedListFor(6, 8, 5)),
                is(LinkedListUtils.createLinkedListFor(5, 6, 4, 1)));
    }

    @Test
    public void testSumLinkedListsRec() {
        assertThat(sumLinkedLists.sumRec(LinkedListUtils.createLinkedListFor(1),
                LinkedListUtils.createLinkedListFor(2)),
                is(LinkedListUtils.createLinkedListFor(3)));

        assertThat(sumLinkedLists.sumRec(LinkedListUtils.createLinkedListFor(2, 1),
                LinkedListUtils.createLinkedListFor(7)),
                is(LinkedListUtils.createLinkedListFor(9, 1)));

        assertThat(sumLinkedLists.sumRec(LinkedListUtils.createLinkedListFor(7, 1, 6),
                LinkedListUtils.createLinkedListFor(5, 9, 2)),
                is(LinkedListUtils.createLinkedListFor(2, 1, 9)));

        assertThat(sumLinkedLists.sumRec(LinkedListUtils.createLinkedListFor(9, 7, 8),
                LinkedListUtils.createLinkedListFor(6, 8, 5)),
                is(LinkedListUtils.createLinkedListFor(5, 6, 4, 1)));
    }
}