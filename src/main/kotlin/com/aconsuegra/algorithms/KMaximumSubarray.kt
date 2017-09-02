package com.aconsuegra.algorithms

/**
 * Find the contiguous subarray within an array (containing at least one number) which has the largest sum.
 * <p>
 * For example, given the array [-2,1,-3,4,-1,2,1,-5,4],
 * the contiguous subarray [4,-1,2,1] has the largest sum = 6.
 */
class KMaximumSubarray {

    fun maxSubarray(input: IntArray) : Int {
        var maxSum = Integer.MIN_VALUE
        var acc = 0
        input.forEach { num ->
            acc += num
            if (maxSum < acc) {
                maxSum = acc
            }
            if (acc < 0) {
                acc = 0
            }
        }
        return maxSum
    }

}