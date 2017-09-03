package me.consuegra.algorithms;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class StringPermutationsTest {

    StringPermutations stringPermutations;

    @Before
    public void setUp() {
        stringPermutations = new StringPermutations();
    }

    @Test
    public void test1Character() {
        assertThat(stringPermutations.permutations("a"), is(Collections.singletonList("a")));
    }

    @Test
    public void test4Characters() {
        assertThat(stringPermutations.permutations("abcd"), is(Arrays.asList("abcd", "abdc", "acbd",
                "acdb", "adbc", "adcb", "bacd", "badc", "bcad", "bcda", "bdac", "bdca", "cabd", "cadb", "cbad",
                "cbda", "cdab", "cdba", "dabc", "dacb", "dbac", "dbca", "dcab", "dcba")));
    }

}