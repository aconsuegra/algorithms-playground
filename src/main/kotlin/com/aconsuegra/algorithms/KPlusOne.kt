package com.aconsuegra.algorithms

/**
 * Given a non-negative integer represented as a non-empty array of digits, plus one to the integer.
 * <p>
 * You may assume the integer do not contain any leading zero, except the number 0 itself.
 * <p>
 * The digits are stored such that the most significant digit is at the head of the list.
 */
class KPlusOne {

    fun plusOne(input: IntArray): IntArray {
        for (i in input.size - 1 downTo 0) {
            if (input[i] < 9) {
                input[i]++
                return input
            }
            input[i] = 0
        }
        val result = IntArray(input.size + 1)
        result[0] = 1
        return result
    }

}
