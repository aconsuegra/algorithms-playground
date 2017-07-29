package com.aconsuegra.algorithms

/**
 * Given an array of integers, return an array in which each position is the result of multiplying all other entries
 * in the array
 * <p>
 * Examples:
 * [1,2,3,4] -> [24,12,8,6]
 * [6,-4,0,5] -> [0,0,-120,0]
 */
class KMultiplyIntArray {

    fun multiplyIntArrayOption1(input: IntArray) : IntArray {
        val result = IntArray(input.size)
        for (i in 0 until input.size) {
            var product = 1
            (0 until input.size)
                    .filter { i != it }
                    .forEach { product *= input[it] }
            result[i] = product
        }
        return result
    }

    fun multiplyIntArrayOption2(input: IntArray) : IntArray {
        val result = IntArray(input.size)

        var leftProduct = 1
        for (i in 0 until input.size) {
            result[i] = leftProduct
            leftProduct *= input[i]
        }

        var rightProduct = 1
        for (i in input.size - 1 downTo 0) {
            result[i] *= rightProduct
            rightProduct *= input[i]
        }

        return result
    }

}