package com.aconsuegra.algorithms;

import java.util.ArrayList;
import java.util.List;

/**
 * Print all permutations of a given string.
 */
public class StringPermutations {

    public List<String> permutations(String string) {
        return permutations("", string, new ArrayList<>());
    }

    private List<String> permutations(String prefix, String s, List<String> permutations) {
        int n = s.length();
        if (n == 0) {
            permutations.add(prefix);
        } else {
            for (int i = 0; i < n; i++) {
                permutations(prefix + s.charAt(i), s.substring(0, i) + s.substring(i + 1, n),
                        permutations);
            }
        }
        return permutations;
    }
}
