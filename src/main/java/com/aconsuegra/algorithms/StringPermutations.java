package com.aconsuegra.algorithms;

/**
 * Print all permutations of a given string.
 */
public class StringPermutations {

    public void permutations(String string) {
        permutations("", string);
    }

    private void permutations(String prefix, String s) {
        int n = s.length();
        if (n == 0) {
            System.out.println(prefix);
        } else {
            for (int i = 0; i < n; i++) {
                permutations(prefix + s.charAt(i), s.substring(0, i) + s.substring(i + 1, n));
            }
        }
    }
}
