package com.aconsuegra.algorithms

/**
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
 * <p>
 * Note:
 * You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional
 * elements from nums2. The number of elements initialized in nums1 and nums2 are m and n respectively.
 */
class KMergeTwoSortedArrays {

    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int) {
        var nums1Index = m - 1
        var nums2Index = n - 1
        var index = m + n - 1
        while (nums1Index >= 0 && nums2Index >= 0 && index >= 0) {
            if (nums1[nums1Index] > nums2[nums2Index]) {
                nums1[index] = nums1[nums1Index]
                nums1Index--
            } else {
                nums1[index] = nums2[nums2Index]
                nums2Index--
            }
            index--
        }
        while (nums2Index >= 0 && index >= 0) {
            nums1[index] = nums2[nums2Index]
            nums2Index--
            index--
        }
    }

}
