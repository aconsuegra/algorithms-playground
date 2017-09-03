package me.consuegra.algorithms;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class PalindromeNumberTest {

    PalindromeNumber palindromeNumber;

    @Before
    public void setUp() {
        palindromeNumber = new PalindromeNumber();
    }

    @Test
    public void test1Digit() {
        assertThat(palindromeNumber.isPalindrome(0), is(true));
    }

    @Test
    public void test1NegativeDigit() {
        assertThat(palindromeNumber.isPalindrome(-1), is(false));
    }

    @Test
    public void test3ConsecutiveDigits() {
        assertThat(palindromeNumber.isPalindrome(123), is(false));
    }

    @Test
    public void test5DigitsPalindrome() {
        assertThat(palindromeNumber.isPalindrome(12321), is(true));
    }

    @Test
    public void testOverflow() {
        assertThat(palindromeNumber.isPalindrome(1000000003), is(false));
    }

    @Test
    public void testSameDigit() {
        assertThat(palindromeNumber.isPalindrome(111111), is(true));
    }

}