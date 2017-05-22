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
    public void removeDuplicates() {
        assertThat(removeDuplicatesSortedArray.removeDuplicates(new int[] {0}), is(1));
        assertThat(removeDuplicatesSortedArray.removeDuplicates(new int[] {0, 0}), is(1));
        assertThat(removeDuplicatesSortedArray.removeDuplicates(new int[] {0, 1, 2, 3}), is(4));
        assertThat(removeDuplicatesSortedArray.removeDuplicates(new int[] {1, 1, 1, 2}), is(2));
        assertThat(removeDuplicatesSortedArray.removeDuplicates(new int[] {1,2,3,3,4,5}), is(5));
    }

}