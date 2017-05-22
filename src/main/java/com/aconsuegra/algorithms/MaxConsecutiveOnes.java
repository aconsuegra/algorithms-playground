package com.aconsuegra.algorithms;

/**
 * Given a binary array, find the maximum number of consecutive 1s in this array.
 * <p>
 * Example
 * <p>
 * Input: [1,1,0,1,1,1]
 * Output: 3
 */
public class MaxConsecutiveOnes {

    public int findMaxConsecutiveOnes(int[] nums) {
        int maxOnes = 0;
        int ones = 0;
        for (int n : nums) {
            if (n == 1) {
                ones++;
                if (ones > maxOnes) {
                    maxOnes = ones;
                }
            } else {
                ones = 0;
            }
        }
        return maxOnes;
    }

}
