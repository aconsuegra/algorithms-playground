package com.aconsuegra.algorithms;

/**
 * Given a sorted array or integers, find the index of the given target, using binary search
 */
public class BinarySearch {

    public int binarySearch(int[] input, int target) {
        int low = 0;
        int high = input.length - 1;
        while (low <= high) {
            int middle = (low + high) / 2;
            if (input[middle] < target) {
                low = middle + 1;
            } else if (input[middle] > target) {
                high = middle - 1;
            } else {
                return middle;
            }
        }
        return -1;
    }

    public int binarySearchRec(int[] input, int target) {
        return binarySearchRec(input, 0, input.length - 1, target);
    }

    private int binarySearchRec(int[] input, int start, int end, int target) {
        if (start > end) {
            return -1;
        }
        int middle = (start + end) / 2;
        if (input[middle] == target) {
            return middle;
        } else if (input[middle] > target) {
            return binarySearchRec(input, start, middle - 1, target);
        } else {
            return binarySearchRec(input, middle + 1, end, target);
        }
    }

}
