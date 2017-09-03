package me.consuegra.algorithms;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MaximumSubarrayTest {

    MaximumSubarray maximumSubarray;

    @Before
    public void setUp() {
        maximumSubarray = new MaximumSubarray();
    }

    @Test
    public void testSmallArray() {
        assertThat(maximumSubarray.maxSubArray(new int[] {-2, 1}), is(1));
    }

    @Test
    public void testMediumArray() {
        assertThat(maximumSubarray.maxSubArray(new int[] {-2, 1, 2, -3}), is(3));
    }

    @Test
    public void testLargeArray() {
        assertThat(maximumSubarray.maxSubArray(new int[] {-2, 1, -3, 4, -1, 2, 1, -5, 4}), is(6));
    }

}