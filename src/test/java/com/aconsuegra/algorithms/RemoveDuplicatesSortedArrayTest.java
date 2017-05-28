package com.aconsuegra.algorithms;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class RemoveDuplicatesSortedArrayTest {

    RemoveDuplicatesSortedArray removeDuplicatesSortedArray;

    @Before
    public void setUp() {
        removeDuplicatesSortedArray = new RemoveDuplicatesSortedArray();
    }

    @Test
    public void test1Entry() {
        assertThat(removeDuplicatesSortedArray.removeDuplicates(new int[] {0}), is(1));
    }

    @Test
    public void test2Entries1Duplicate() {
        assertThat(removeDuplicatesSortedArray.removeDuplicates(new int[] {0, 0}), is(1));
    }

    @Test
    public void test4EntriesNoDuplicates() {
        assertThat(removeDuplicatesSortedArray.removeDuplicates(new int[] {0, 1, 2, 3}), is(4));
    }

    @Test
    public void test4EntriesWithDuplicates() {
        assertThat(removeDuplicatesSortedArray.removeDuplicates(new int[] {1, 1, 1, 2}), is(2));
    }

    @Test
    public void test6EntriesWithDuplicates() {
        assertThat(removeDuplicatesSortedArray.removeDuplicates(new int[] {1, 2, 3, 3, 4, 5}), is(5));
    }

}