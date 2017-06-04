package com.aconsuegra.algorithms;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MergeTwoSortedArraysTest {

    MergeTwoSortedArrays mergeTwoSortedArrays;

    @Before
    public void setUp() {
        mergeTwoSortedArrays = new MergeTwoSortedArrays();
    }

    @Test
    public void testBothArrays1Entry() {
        int[] nums1 = new int[] {1, 0};
        int[] nums2 = new int[] {2};
        mergeTwoSortedArrays.merge(nums1, 1, nums2, 1);
        assertThat(nums1, is(new int[] {1, 2}));
    }

    @Test
    public void testBothArrays3Entries() {
        int[] nums1 = new int[] {1, 3, 5, 0, 0, 0};
        int[] nums2 = new int[] {2, 4, 6};
        mergeTwoSortedArrays.merge(nums1, 3, nums2, 3);
        assertThat(nums1, is(new int[] {1, 2, 3, 4, 5, 6}));
    }

    @Test
    public void testFirstArray1Entry() {
        int[] nums1 = new int[] {1, 0, 0, 0, 0};
        int[] nums2 = new int[] {2, 3, 5, 7};
        mergeTwoSortedArrays.merge(nums1, 1, nums2, 4);
        assertThat(nums1, is(new int[] {1, 2, 3, 5, 7}));
    }

    @Test
    public void testSecondArrayEmpty() {
        int[] nums1 = new int[] {1, 2};
        int[] nums2 = new int[] {};
        mergeTwoSortedArrays.merge(nums1, 2, nums2, 0);
        assertThat(nums1, is(new int[] {1, 2}));
    }

    @Test
    public void testFirstArrayEmpty() {
        int[] nums1 = new int[] {0, 0};
        int[] nums2 = new int[] {1, 2};
        mergeTwoSortedArrays.merge(nums1, 0, nums2, 2);
        assertThat(nums1, is(new int[] {1, 2}));
    }

}