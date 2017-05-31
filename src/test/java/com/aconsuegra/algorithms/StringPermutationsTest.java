package com.aconsuegra.algorithms;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringPermutationsTest {

    StringPermutations stringPermutations;

    @Before
    public void setUp() {
        stringPermutations = new StringPermutations();
    }

    @Test
    public void test1Character() {
        stringPermutations.permutations("a");
    }

    @Test
    public void test4Characters() {
        stringPermutations.permutations("abcd");
    }

}