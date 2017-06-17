package com.aconsuegra.algorithms

/**
 * Implement a method to implement a basic string compression using the counts of repeated characters. For
 * example, the string aabcccccaaa would become a2b1c5a3. If the "compressed" string would not become smaller
 * than the original string, your method should return the original string. You can assume the string hs only
 * uppercase and lowercase letters (a-z)
 */
class KStringCompression {

    fun compress(input: String): String {
        val sb = StringBuilder()
        var count = 0
        var currentChar = input[0]
        input.forEachIndexed { _, c ->
            if (currentChar == c) {
                count++
            } else {
                sb.append(currentChar).append(count)
                currentChar = c
                count = 1
            }
        }
        sb.append(currentChar).append(count)
        return if (sb.length > input.length) input else sb.toString()
    }

}