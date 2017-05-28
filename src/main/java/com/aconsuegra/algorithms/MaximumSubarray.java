package com.aconsuegra.algorithms;

/**
 * Find the contiguous subarray within an array (containing at least one number) which has the largest sum.
 * <p>
 * For example, given the array [-2,1,-3,4,-1,2,1,-5,4],
 * the contiguous subarray [4,-1,2,1] has the largest sum = 6.
 */
public class MaximumSubarray {

    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int acc = 0;
        for (int num : nums) {
            acc += num;
            if (maxSum < acc) {
                maxSum = acc;
            }
            if (acc < 0) {
                acc = 0;
            }
        }
        return maxSum;
    }

}
