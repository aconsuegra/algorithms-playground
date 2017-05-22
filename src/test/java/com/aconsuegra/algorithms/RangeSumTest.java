package com.aconsuegra.algorithms;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.*;

public class RangeSumTest {

    RangeSum rangeSum;

    @Before
    public void setUp() {
        rangeSum = new RangeSum();
    }

    @Test
    public void rangeSum() {
        assertThat(rangeSum.rangeSum(new int[] {0}, 4), is(nullValue()));
        assertThat(rangeSum.rangeSum(new int[] {1, 2}, 4), is(nullValue()));
        assertThat(rangeSum.rangeSum(new int[] {2}, 2), is(new int[] {0, 0}));
        assertThat(rangeSum.rangeSum(new int[] {1, 2}, 3), is(new int[] {0, 1}));
        assertThat(rangeSum.rangeSum(new int[] {1, 2, 3, 4, 5}, 7), is(new int[] {2, 3}));
        assertThat(rangeSum.rangeSum(new int[] {5, 4, 3, 2, 1}, 7), is(new int[] {1, 2}));
        assertThat(rangeSum.rangeSum(new int[] {1, 2, 3, 4, 5}, 9), is(new int[] {1, 3}));
        assertThat(rangeSum.rangeSum(new int[] {1, 2, 3, 4, 5}, 15), is(new int[] {0, 4}));
        assertThat(rangeSum.rangeSum(new int[] {1, 2, 3, 4, 11}, 11), is(new int[] {4, 4}));
    }

}