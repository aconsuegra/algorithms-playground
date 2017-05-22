package com.aconsuegra.algorithms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Given two arrays, write a function to compute their intersection.
 * <p>
 * Example:
 * Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2].
 * <p>
 * Note:
 * Each element in the result must be unique.
 * The result can be in any order.
 */
public class IntersectionTwoArrays {

    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>(nums1.length);
        for (int n : nums1) {
            set.add(n);
        }

        int[] result = new int[set.size()];
        int i = 0;
        for (int n : nums2) {
            if (set.contains(n)) {
                result[i] = n;
                set.remove(n);
                i++;
            }
        }
        return Arrays.copyOf(result, i);
    }

}
