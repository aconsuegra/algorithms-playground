package me.consuegra.algorithms

/**
 * Given an array of integers, sort the array into a wave like array and return it,
 * In other words, arrange the elements into a sequence such that a1 >= a2 <= a3 >= a4 <= a5...
 * <p>
 * Given [1, 2, 3, 4]
 * <p>
 * One possible answer : [2, 1, 4, 3]
 * Another possible answer : [4, 1, 3, 2]
 */
class KWaveArray {

    fun wave(input: IntArray): IntArray {
        if (input.size < 2) {
            return input
        }
        input.sort()
        var i = 0
        for (j in 1..input.size - 1 step 2) {
            val temp = input[i]
            input[i] = input[j]
            input[j] = temp
            i += 2
        }
        return input
    }

}
