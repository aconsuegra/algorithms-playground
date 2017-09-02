package com.aconsuegra.algorithms

/**
 * Given an array of numbers move all 0s to the right end and all other numbers to the left while keeping
 * relative order of non-zero numbers. Has to be linear in time and in-place.
 * <p>
 * For array [1, 2, 0, 3, 0, 1, 2], the program can output [1, 2, 3, 1, 2, 0, 0]
 */
class KMoveZeros {

    fun move(input: IntArray): IntArray {
        if (input.isEmpty()) {
            return IntArray(0)
        }
        var count = 0
        for (i in 0 until input.size) {
            if (input[i] != 0) {
                input[i - count] = input[i]
            } else {
                count++
            }
        }
        for (i in input.size - count until input.size) {
            input[i] = 0
        }
        return input
    }

}
