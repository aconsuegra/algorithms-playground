package com.aconsuegra.algorithms;

/**
 * Write a method to replace all spaces in a string with '%20'. You may assume that the string has sufficient
 * space at the end to hold the additional characters, and that you are given the "true" length of the string.
 */
public class URLify {

    public char[] replaceSpaces(char[] input, int length) {
        char[] output = new char[input.length];

        int i = input.length - 1;
        for (int j = length - 1; j >= 0; j--) {
            if (input[j] != ' ') {
                output[i] = input[j];
                i--;
            } else {
                output[i--] = '0';
                output[i--] = '2';
                output[i--] = '%';
            }
        }

        return output;
    }

}
