package com.aconsuegra.algorithms

/**
 * Given a sorted array, remove the duplicates in place such that each element appear only once and return the
 * new length.
 * <p>
 * Do not allocate extra space for another array, you must do this in place with constant memory.
 * <p>
 * For example,
 * Given input array nums = [1,1,2],
 * <p>
 * Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively. It
 * doesn't matter what you leave beyond the new length.
 */
class KRemoveDuplicatesSortedArray {

    fun removeDuplicates(input: IntArray): Int {
        var i = 0
        for (value in input) {
            if (value != input[i]) {
                i++
                input[i] = value
            }
        }
        return i + 1
    }

}
