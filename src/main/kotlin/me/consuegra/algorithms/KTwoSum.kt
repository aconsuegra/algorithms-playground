package me.consuegra.algorithms

/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 */
class KTwoSum {

    fun twoSum(nums: IntArray, target: Int): IntArray {
        for (i in 0..nums.size - 1) {
            (i + 1..nums.size - 1)
                    .filter { nums[i] + nums[it] == target }
                    .forEach { return intArrayOf(i, it) }
        }
        throw IllegalStateException("Target not found")
    }

}
