package com.aconsuegra.algorithms

/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 */
class KLongestCommonPrefix {

    fun longestCommonPrefix(input: Array<String>) : String {
        if (input.isEmpty()) {
            return ""
        }
        var result = input[0]
        for (index in 1 until input.size) {
            result = findCommonPrefix(result, input[index])
        }
        return result
    }

    private fun findCommonPrefix(prefix: String, str: String) : String {
        val builder = StringBuilder()
        val length = Math.min(prefix.length, str.length)
        (0..length - 1)
                .takeWhile { prefix[it] == str[it] }
                .forEach { builder.append(prefix[it]) }
        return builder.toString()
    }

}
