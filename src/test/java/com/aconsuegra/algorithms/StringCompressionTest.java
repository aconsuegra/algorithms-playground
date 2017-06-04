package com.aconsuegra.algorithms;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class StringCompressionTest {

    StringCompression stringCompression;

    @Before
    public void setUp() {
        stringCompression = new StringCompression();
    }

    @Test
    public void test1Character() {
        assertThat(stringCompression.compress("abbcccccaaa"), is("a1b2c5a3"));
    }

    @Test
    public void testTwoCharacters() {
        assertThat(stringCompression.compress("aa"), is("a2"));
    }

    @Test
    public void testMultipleCharacters() {
        assertThat(stringCompression.compress("abbcccccaaa"), is("a1b2c5a3"));
    }

}