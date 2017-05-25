package com.aconsuegra.algorithms;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class StringCompressionTest {

    StringCompression stringCompression;

    @Before
    public void setUp() {
        stringCompression = new StringCompression();
    }

    @Test
    public void testCompress() {
        assertThat(stringCompression.compress("a"), is("a"));
        assertThat(stringCompression.compress("aa"), is("a2"));
        assertThat(stringCompression.compress("abbcccccaaa"), is("a1b2c5a3"));
    }

}