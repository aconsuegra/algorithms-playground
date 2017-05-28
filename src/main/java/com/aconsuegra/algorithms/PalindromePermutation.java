package com.aconsuegra.algorithms;

import java.util.HashMap;
import java.util.Map;

/**
 * Given a string, write a function to check if it i a permutation of a palindrome. The palindrome does not need
 * to be limited to just dictionary words.
 * <p>
 * Example:
 * INPUT: "Tact Coa"
 * OUTPUT: true ("taco cat", "atco cta", etc.)
 */
public class PalindromePermutation {

    public boolean isPalindromePermutation(String input) {
        if (input == null || input.length() == 0) {
            return false;
        }
        input = input.toLowerCase();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ' ') {
                continue;
            }
            if (map.containsKey(input.charAt(i))) {
                map.put(input.charAt(i), map.get(input.charAt(i)) + 1);
            } else {
                map.put(input.charAt(i), 1);
            }
        }

        boolean oddFound = false;
        for (Integer count : map.values()) {
            if (count % 2 != 0) {
                if (oddFound) {
                    return false;
                }
                oddFound = true;
            }
        }
        return true;
    }

}
