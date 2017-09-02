package com.aconsuegra.algorithms

/**
 * Determine whether an integer is a palindrome. Do this without extra space.
 */
class KPalindromeNumber {

    fun isPalindrome(x: Int) : Boolean {
        if (x < 0) {
            return false
        }
        var input = x
        var reverse = 0
        while (input > 0) {
            reverse = reverse * 10 + input % 10
            input /= 10
        }
        return reverse == x
    }

}
