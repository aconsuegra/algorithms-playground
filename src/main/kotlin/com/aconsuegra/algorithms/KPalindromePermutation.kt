package com.aconsuegra.algorithms

/**
 * Given a string, write a function to check if it i a permutation of a palindrome. The palindrome does not need
 * to be limited to just dictionary words.
 * <p>
 * Example:
 * INPUT: "Tact Coa"
 * OUTPUT: true ("taco cat", "atco cta", etc.)
 */
class KPalindromePermutation {

    fun isPalindromePermutation(input: String): Boolean {
        if (input.isEmpty()) {
            return false
        }
        val map = HashMap<Char, Int>()
        for (char in input.toLowerCase()) {
            if (char != ' ') {
                map.put(char, map.getOrDefault(char, 0) + 1)
            }
        }
        var oddFound = false
        for (count in map.values) {
            if (count % 2 != 0) {
                if (oddFound) {
                    return false
                }
                oddFound = true
            }
        }
        return true
    }

}