package com.aconsuegra.algorithms;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class TwoSumTest {

    TwoSum twoSum;

    @Before
    public void setUp() throws Exception {
        twoSum = new TwoSum();
    }

    @Test(expected = IllegalStateException.class)
    public void twoSumNotFound() {
        twoSum.twoSum(new int[]{1, 2, 3}, 7);
    }

    @Test
    public void twoSum() {
        assertThat(twoSum.twoSum(new int[]{1, 2, 3}, 3), is(new int[]{0, 1}));
        assertThat(twoSum.twoSum(new int[]{4, 2, 10, 1}, 5), is(new int[]{0, 3}));
        assertThat(twoSum.twoSum(new int[]{1, 1}, 2), is(new int[]{0, 1}));
    }

}