package com.aconsuegra.algorithms

/**
 * Given a roman numeral, convert it to an integer.
 * <p>
 * Input is guaranteed to be within the range from 1 to 3999.
 */
class KRomanToInteger {

    fun romanToInt(input: String): Int {
        var result = 0
        var lastChar = 'I'
        for (c in input.reversed()) {
            when (c) {
                'M' -> result += 1000
                'D' -> result += 500
                'C' -> result += if (lastChar == 'M' || lastChar == 'D') -100 else 100
                'L' -> result += 50
                'X' -> result += if (lastChar == 'C' || lastChar == 'L') -10 else 10
                'V' -> result += 5
                'I' -> result += if (lastChar == 'X' || lastChar == 'V') -1 else 1
                else -> throw IllegalStateException("Invalid Roman number")
            }
            lastChar = c
        }
        return result
    }

}
