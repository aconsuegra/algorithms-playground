package me.consuegra.algorithms;

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
public class OneAway {

    public boolean oneAway(String s1, String s2) {
        int s1Length = s1.length();
        int s2Length = s2.length();
        if (Math.abs(s1Length - s2Length) > 1) {
            return false;
        }

        String shorterString;
        String longerString;
        if (s1Length > s2Length) {
            shorterString = s2;
            longerString = s1;
        } else {
            shorterString = s1;
            longerString = s2;
        }
        boolean sameLength = s1Length == s2Length;
        int numChanges = 0;

        int indexShorterString = 0;
        int indexLongerString = 0;
        while (indexShorterString < shorterString.length() && indexLongerString < longerString.length()) {
            if (shorterString.charAt(indexShorterString) != longerString.charAt(indexLongerString)) {
                if (numChanges == 1) {
                    return false;
                }
                numChanges++;
                if (sameLength) {
                    indexShorterString++;
                }
            } else {
                indexShorterString++;
            }
            indexLongerString++;
        }

        return true;
    }

}
