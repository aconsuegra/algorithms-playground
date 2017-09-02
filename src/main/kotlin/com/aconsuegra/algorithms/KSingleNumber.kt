package com.aconsuegra.algorithms

/**
 * Given an array of integers, every element appears twice except for one. Find that single one.
 * <p>
 * Note:
 * Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 */
class KSingleNumber {

    fun singleNumber(input: IntArray): Int {
        val map = mutableMapOf<Int, Int>()
        for (number in input) {
            if (map.containsKey(number)) {
                map.put(number, 2)
            } else {
                map.put(number, 1)
            }
        }
        return map.keys.filter { map[it] == 1 }.first()
    }

    fun singleNumberNoMemory(input: IntArray): Int {
        var result = 0
        for (number in input) {
            result = result.xor(number)
        }
        return result
    }

}
