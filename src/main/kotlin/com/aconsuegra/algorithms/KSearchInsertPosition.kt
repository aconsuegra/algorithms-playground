package com.aconsuegra.algorithms

/**
 * Given a sorted array and a target value, return the index if the target is found. If not, return the index
 * where it would be if it were inserted in order.
 * <p>
 * You may assume no duplicates in the array.
 * <p>
 * Here are few examples.
 * [1,3,5,6], 5 → 2
 * [1,3,5,6], 2 → 1
 * [1,3,5,6], 7 → 4
 * [1,3,5,6], 0 → 0
 */
class KSearchInsertPosition {

    fun searchInsert(input: IntArray, target: Int): Int {
        var low = 0
        var high = input.size - 1
        while (low <= high) {
            val middle = (low + high) / 2
            when {
                input[middle] < target -> low = middle + 1
                input[middle] > target -> high = middle - 1
                else -> return middle
            }
        }
        return low
    }

    fun searchInsertRec(input: IntArray, target: Int): Int {
        if (input.isEmpty()) {
            return 0
        }
        return searchInsertRec(input, 0, input.size - 1, target)
    }

    fun searchInsertRec(input: IntArray, start: Int, end: Int, target: Int): Int {
        if (start > end) {
            return start
        }
        val middle = (start + end) / 2
        when {
            input[middle] < target -> return searchInsertRec(input, middle + 1, end, target)
            input[middle] > target -> return searchInsertRec(input, start, middle - 1, target)
            else -> return middle
        }
    }

}
