package com.aconsuegra.algorithms

import org.junit.Assert.*
import org.junit.Test
import org.hamcrest.CoreMatchers.`is` as iz

class KMergeTwoSortedArraysTest {
    
    val mergeSortedArrays = KMergeTwoSortedArrays()

    @Test
    fun testBothArrays1Entry() {
        val nums1 = intArrayOf(1, 0)
        val nums2 = intArrayOf(2)
        mergeSortedArrays.merge(nums1, 1, nums2, 1)
        assertThat(nums1, iz(intArrayOf(1, 2)))
    }

    @Test
    fun testBothArrays3Entries() {
        val nums1 = intArrayOf(1, 3, 5, 0, 0, 0)
        val nums2 = intArrayOf(2, 4, 6)
        mergeSortedArrays.merge(nums1, 3, nums2, 3)
        assertThat(nums1, iz(intArrayOf(1, 2, 3, 4, 5, 6)))
    }

    @Test
    fun testFirstArray1Entry() {
        val nums1 = intArrayOf(1, 0, 0, 0, 0)
        val nums2 = intArrayOf(2, 3, 5, 7)
        mergeSortedArrays.merge(nums1, 1, nums2, 4)
        assertThat(nums1, iz(intArrayOf(1, 2, 3, 5, 7)))
    }

    @Test
    fun testSecondArrayEmpty() {
        val nums1 = intArrayOf(1, 2)
        val nums2 = intArrayOf()
        mergeSortedArrays.merge(nums1, 2, nums2, 0)
        assertThat(nums1, iz(intArrayOf(1, 2)))
    }

    @Test
    fun testFirstArrayEmpty() {
        val nums1 = intArrayOf(0, 0)
        val nums2 = intArrayOf(1, 2)
        mergeSortedArrays.merge(nums1, 0, nums2, 2)
        assertThat(nums1, iz(intArrayOf(1, 2)))
    }
}