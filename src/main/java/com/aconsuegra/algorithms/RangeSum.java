package com.aconsuegra.algorithms;

/**
 * Given and array of positive integers and another integer find whether there is a consecutive range in the
 * array, so that the sum of integers in the range is equal to the given number
 */
public class RangeSum {

    public int[] rangeSum(int[] input, int target) {
        if (input == null || input.length == 0) {
            return null;
        }

        int i = 0;
        int sum = 0;
        for (int j = 0; j < input.length; j++) {
            if (sum + input[j] == target) {
                return new int[] {i, j};
            } else if (sum + input[j] > target) {
                sum -= input[i];
                i++;
                j--;
            } else {
                sum += input[j];
            }
        }
        return null;
    }

}
