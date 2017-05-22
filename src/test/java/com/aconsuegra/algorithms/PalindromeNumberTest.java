package com.aconsuegra.algorithms;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class PalindromeNumberTest {

    PalindromeNumber palindromeNumber;

    @Before
    public void setUp() {
        palindromeNumber = new PalindromeNumber();
    }

    @Test
    public void isPalindrome() {
        assertThat(palindromeNumber.isPalindrome(0), is(true));
        assertThat(palindromeNumber.isPalindrome(-1), is(false));
        assertThat(palindromeNumber.isPalindrome(123), is(false));
        assertThat(palindromeNumber.isPalindrome(12321), is(true));
        assertThat(palindromeNumber.isPalindrome(1000000003), is(false));
        assertThat(palindromeNumber.isPalindrome(111111), is(true));
    }

}