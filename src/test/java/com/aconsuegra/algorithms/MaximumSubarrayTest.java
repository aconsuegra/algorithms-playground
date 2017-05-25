package com.aconsuegra.algorithms;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class MaximumSubarrayTest {

    MaximumSubarray maximumSubarray;

    @Before
    public void setUp() {
        maximumSubarray = new MaximumSubarray();
    }

    @Test
    public void maxSubArray() {
        assertThat(maximumSubarray.maxSubArray(new int[] {-2, 1}), is(1));
        assertThat(maximumSubarray.maxSubArray(new int[] {-2, 1, 2, -3}), is(3));
        assertThat(maximumSubarray.maxSubArray(new int[] {-2, 1, -3, 4, -1, 2, 1, -5, 4}), is(6));
    }

}