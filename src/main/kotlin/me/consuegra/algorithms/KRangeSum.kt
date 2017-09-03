package me.consuegra.algorithms

/**
 * Given and array of positive integers and another integer find whether there is a consecutive range in the
 * array, so that the sum of integers in the range is equal to the given number
 */
class KRangeSum {

    fun rangeSum(array: IntArray, target: Int): IntArray? {
        if (array.isEmpty()) {
            return null
        }
        var i = 0
        var j = 0
        var sum = 0
        while (j < array.size) {
            when {
                sum + array[j] == target -> return intArrayOf(i, j)
                sum + array[j] > target -> {
                    sum -= array[i]
                    i++
                    j--
                }
                else -> sum += array[j]
            }
            j++
        }
        return null
    }

}
