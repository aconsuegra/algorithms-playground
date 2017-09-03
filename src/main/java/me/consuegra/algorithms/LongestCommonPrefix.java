package me.consuegra.algorithms;

/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 */
public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        String result = strs[0];
        for (int i = 1; i < strs.length; i++) {
            result = findCommonPrefix(result, strs[i]);
        }
        return result;
    }

    private String findCommonPrefix(String prefix, String str) {
        StringBuilder sb = new StringBuilder();
        int length = Math.min(prefix.length(), str.length());
        for (int i = 0; i < length; i++) {
            if (prefix.charAt(i) != str.charAt(i)) {
                break;
            }
            sb.append(prefix.charAt(i));
        }
        return sb.toString();
    }

}
