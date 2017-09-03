package me.consuegra.algorithms;

/**
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
 * <p>
 * Note:
 * You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional
 * elements from nums2. The number of elements initialized in nums1 and nums2 are m and n respectively.
 */
public class MergeTwoSortedArrays {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int nums1Index = m - 1;
        int nums2Index = n - 1;
        int index = m + n - 1;

        while (nums1Index >= 0 && nums2Index >= 0 && index >= 0) {
            if (nums1[nums1Index] > nums2[nums2Index]) {
                nums1[index] = nums1[nums1Index];
                nums1Index--;
            } else {
                nums1[index] = nums2[nums2Index];
                nums2Index--;
            }
            index--;
        }

        while (nums2Index >= 0 && index >= 0) {
            nums1[index] = nums2[nums2Index];
            nums2Index--;
            index--;
        }
    }

}
