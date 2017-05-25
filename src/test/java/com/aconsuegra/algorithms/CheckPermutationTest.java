package com.aconsuegra.algorithms;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class CheckPermutationTest {

    CheckPermutation checkPermutation;

    @Before
    public void setUp() {
        checkPermutation = new CheckPermutation();
    }

    @Test
    public void testIsPermutationSolution1() {
        assertThat(checkPermutation.isPermutationSolution1("a", "b"), is(false));
        assertThat(checkPermutation.isPermutationSolution1("a", "a"), is(true));
        assertThat(checkPermutation.isPermutationSolution1("ab", "a"), is(false));
        assertThat(checkPermutation.isPermutationSolution1("ababab", "aaabbb"), is(true));
        assertThat(checkPermutation.isPermutationSolution1("abcabcabc", "aaabbbcccc"), is(false));
    }

    @Test
    public void testIsPermutationSolution2() {
        assertThat(checkPermutation.isPermutationSolution2("a", "b"), is(false));
        assertThat(checkPermutation.isPermutationSolution2("a", "a"), is(true));
        assertThat(checkPermutation.isPermutationSolution2("ab", "a"), is(false));
        assertThat(checkPermutation.isPermutationSolution2("ababab", "aaabbb"), is(true));
        assertThat(checkPermutation.isPermutationSolution2("abcabcabc", "aaabbbcccc"), is(false));
    }

}