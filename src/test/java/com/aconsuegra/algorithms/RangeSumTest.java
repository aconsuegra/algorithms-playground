package com.aconsuegra.algorithms;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertThat;

public class RangeSumTest {

    RangeSum rangeSum;

    @Before
    public void setUp() {
        rangeSum = new RangeSum();
    }

    @Test
    public void test1EntryNotFound() {
        assertThat(rangeSum.rangeSum(new int[] {0}, 4), is(nullValue()));
    }

    @Test
    public void test2EntriesNotFound() {
        assertThat(rangeSum.rangeSum(new int[] {1, 2}, 4), is(nullValue()));
    }

    @Test
    public void test1EntryFound() {
        assertThat(rangeSum.rangeSum(new int[] {2}, 2), is(new int[] {0, 0}));
    }

    @Test
    public void test2EntriesFound() {
        assertThat(rangeSum.rangeSum(new int[] {1, 2}, 3), is(new int[] {0, 1}));
    }

    @Test
    public void test5EntriesFound() {
        assertThat(rangeSum.rangeSum(new int[] {5, 4, 3, 2, 1}, 7), is(new int[] {1, 2}));
    }

    @Test
    public void test5EntriesFoundFullArray() {
        assertThat(rangeSum.rangeSum(new int[] {1, 2, 3, 4, 5}, 15), is(new int[] {0, 4}));
    }

}