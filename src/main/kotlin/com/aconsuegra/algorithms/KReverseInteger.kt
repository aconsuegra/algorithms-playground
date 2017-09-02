package com.aconsuegra.algorithms

/**
 * Reverse digits of an integer.
 * <p>
 * Example1: x = 123, return 321
 * Example2: x = -123, return -321
 * <p>
 * The input is assumed to be a 32-bit signed integer. Your function should return 0 when the reversed integer
 * overflows.
 */
class KReverseInteger {

    fun reverse1(input: Int): Int {
        val isNegative = input < 0
        val sb = StringBuilder()
        var positiveInput = Math.abs(input)
        while (positiveInput > 0) {
            sb.append(positiveInput % 10)
            positiveInput /= 10
        }
        if (isNegative) {
            sb.insert(0, "-")
        }
        try {
            return Integer.parseInt(sb.toString())
        } catch (e: NumberFormatException) {
            return 0
        }
    }

    fun reverse2(input: Int): Int {
        val isNegative = input < 0
        var positiveInput = Math.abs(input)
        var acc: Long = 0
        while (positiveInput > 0) {
            acc = acc * 10 + positiveInput % 10
            if (acc > Integer.MAX_VALUE) {
                return 0
            }
            positiveInput /= 10
        }
        return if (isNegative) -1 * acc.toInt() else acc.toInt()
    }

}
