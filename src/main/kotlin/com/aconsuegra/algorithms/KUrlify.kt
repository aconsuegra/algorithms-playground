package com.aconsuegra.algorithms

/**
 * Write a method to replace all spaces in a string with '%20'. You may assume that the string has sufficient
 * space at the end to hold the additional characters, and that you are given the "true" length of the string.
 */
class KUrlify {

    fun replaceSpaces(input: CharArray, length: Int): CharArray {
        val output = CharArray(input.size)
        var i = input.size - 1
        for (j in length - 1 downTo 0) {
            if (input[j] != ' ') {
                output[i] = input[j]
                i--
            } else {
                output[i--] = '0'
                output[i--] = '2'
                output[i--] = '%'
            }
        }
        return output
    }

}
