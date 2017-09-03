package me.consuegra.algorithms

/**
 * Given an array and a value, remove all instances of that value in place and return the new length.
 * <p>
 * Do not allocate extra space for another array, you must do this in place with constant memory.
 * <p>
 * The order of elements can be changed. It doesn't matter what you leave beyond the new length.
 * <p>
 * Example:
 * Given input array nums = [3,2,2,3], val = 3
 * <p>
 * Your function should return length = 2, with the first two elements of nums being 2.
 */
class KRemoveElement {

    fun removeElement(input: IntArray, element: Int): Int {
        var i = 0
        for (value in input) {
            if (value != element) {
                input[i] = value
                i++
            }
        }
        return i
    }

}
