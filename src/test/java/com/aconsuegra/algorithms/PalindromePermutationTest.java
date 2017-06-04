package com.aconsuegra.algorithms;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class PalindromePermutationTest {

    PalindromePermutation palindromePermutation;

    @Before
    public void setUp() {
        palindromePermutation = new PalindromePermutation();
    }

    @Test
    public void testNullInput() {
        assertThat(palindromePermutation.isPalindromePermutation(null), is(false));
    }

    @Test
    public void testEmptyInput() {
        assertThat(palindromePermutation.isPalindromePermutation(""), is(false));
    }

    @Test
    public void testOneCharInput() {
        assertThat(palindromePermutation.isPalindromePermutation("a"), is(true));
    }

    @Test
    public void testTwoCharsInvalidInput() {
        assertThat(palindromePermutation.isPalindromePermutation("ab"), is(false));
    }

    @Test
    public void testTwoCharsValidInput() {
        assertThat(palindromePermutation.isPalindromePermutation("aa"), is(true));
    }

    @Test
    public void testValidInput() {
        assertThat(palindromePermutation.isPalindromePermutation("Tact Coa"), is(true));
    }

    @Test
    public void testInvalidInput() {
        assertThat(palindromePermutation.isPalindromePermutation("Tact j Coab"), is(false));
    }

}