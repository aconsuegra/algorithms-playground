package com.aconsuegra.algorithms

/**
 * Given a binary array, find the maximum number of consecutive 1s in this array.
 * <p>
 * Example
 * <p>
 * Input: [1,1,0,1,1,1]
 * Output: 3
 */
class KMaxConsecutiveOnes {

    fun findMaxConsecutiveOnes(input: IntArray) : Int {
        var maxOnes = 0
        var ones = 0
        input.forEach { num ->
            if (num == 1) {
                ones++
                if (ones > maxOnes) {
                    maxOnes++
                }
            } else {
                ones = 0
            }
        }
        return maxOnes
    }

}