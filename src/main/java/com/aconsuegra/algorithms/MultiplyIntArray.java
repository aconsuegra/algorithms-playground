package com.aconsuegra.algorithms;

/**
 * Given an array of integers, return an array in which each position is the result of multiplying all other entries
 * in the array
 * <p>
 * Examples:
 * [1,2,3,4] -> [24,12,8,6]
 * [6,-4,0,5] -> [0,0,-120,0]
 */
public class MultiplyIntArray {

    public int[] multiplyIntArrayOption1(int[] input) {
        int[] result = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            int product = 1;
            for (int j = 0; j < input.length; j++) {
                if (i != j) {
                    product *= input[j];
                }
            }
            result[i] = product;
        }
        return result;
    }

    public int[] multiplyIntArrayOption2(int[] input) {
        int[] result = new int[input.length];

        int leftProduct = 1;
        for (int i = 0; i < input.length; i++) {
            result[i] = leftProduct;
            leftProduct *= input[i];
        }

        int rightProduct = 1;
        for (int i = input.length - 1; i >= 0; i--) {
            result[i] *= rightProduct;
            rightProduct *= input[i];
        }

        return result;
    }

}
