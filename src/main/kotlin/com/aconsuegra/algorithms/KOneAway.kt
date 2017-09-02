package com.aconsuegra.algorithms

/**
 * There are three types of edits that can be performed on strings: insert a character, remove a character, or
 * replace a character. Given two strings, write a function to check if they are one edit (or) zero edits away.
 * <p>
 * Examples:
 * <p>
 * pale,  ple  -> true
 * pales, pale -> true
 * pale,  bale -> true
 * pale,  bake -> false
 */
class KOneAway {

    fun oneAway(s1: String, s2: String) : Boolean {
        if (Math.abs(s1.length - s2.length) > 1) {
            return false
        }
        val (shorterString, longerString) = categorizeStrings(s1, s2)
        var numChanges = 0
        var indexShorterString = 0
        var indexLongerString = 0
        while (indexShorterString < shorterString.length && indexLongerString < longerString.length) {
            if (shorterString[indexShorterString] != longerString[indexLongerString]) {
                if (numChanges == 1) {
                    return false
                }
                numChanges++
                if (s1.length == s2.length) {
                    indexShorterString++
                }
            } else {
                indexShorterString++
            }
            indexLongerString++
        }
        return true
    }

    private fun categorizeStrings(s1: String, s2: String) : Pair<String, String> {
        when {
            s1.length > s2.length -> return s2 to s1
            else -> return s1 to s2
        }
    }
}
