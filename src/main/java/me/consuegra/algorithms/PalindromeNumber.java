package me.consuegra.algorithms;

/**
 * Determine whether an integer is a palindrome. Do this without extra space.
 */
public class PalindromeNumber {

    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int input = x;
        int reverse = 0;
        while (x > 0) {
            reverse = reverse * 10 + x % 10;
            x /= 10;
        }
        return input == reverse;
    }

}
