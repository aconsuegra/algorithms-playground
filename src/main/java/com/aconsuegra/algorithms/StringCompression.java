package com.aconsuegra.algorithms;

/**
 * Implement a method to implement a basic string compression using the counts of repeated characters. For
 * example, the string aabcccccaaa would become a2b1c5a3. If the "compressed" string would not become smaller
 * than the original string, your method should return the original string. You can assume the string hs only
 * uppercase and lowercase letters (a-z)
 */
public class StringCompression {

    public String compress(String input) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        char currentCharacter = input.charAt(0);
        for (int i = 0; i < input.length(); i++) {
            if (currentCharacter == input.charAt(i)) {
                count++;
            } else {
                sb.append(currentCharacter).append(count);
                currentCharacter = input.charAt(i);
                count = 1;
            }
        }
        sb.append(currentCharacter).append(count);
        return sb.length() > input.length() ? input : sb.toString();
    }

}
