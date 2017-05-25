package com.aconsuegra.algorithms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Given two strings, write a method to decide if one is a permutation of the other
 */
public class CheckPermutation {

    /**
     * O(n)-time solution
     */
    public boolean isPermutationSolution1(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            if (map.containsKey(s1.charAt(i))) {
                map.put(s1.charAt(i), map.get(s1.charAt(i)) + 1);
            } else {
                map.put(s1.charAt(i), 1);
            }
        }

        for (int i = 0; i < s2.length(); i++) {
            if (map.containsKey(s2.charAt(i))) {
                if (map.get(s2.charAt(i)) == 1) {
                    map.remove(s2.charAt(i));
                } else {
                    map.put(s2.charAt(i), map.get(s2.charAt(i)) - 1);
                }
            } else {
                return false;
            }
        }

        return map.isEmpty();
    }

    /**
     * O(n log n)-time solution
     */
    public boolean isPermutationSolution2(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        char[] s1chars = s1.toCharArray();
        char[] s2chars = s2.toCharArray();

        Arrays.sort(s1chars);
        Arrays.sort(s2chars);

        return Arrays.equals(s1chars, s2chars);
    }

}
