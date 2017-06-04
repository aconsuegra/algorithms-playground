package com.aconsuegra.algorithms;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class URLifyTest {

    URLify urlify;

    @Before
    public void setUp() {
        urlify = new URLify();
    }

    @Test
    public void testOneSpaceStartOneSpaceEnd() {
        assertThat(urlify.replaceSpaces(" John     ".toCharArray(), 6),
                is("%20John%20".toCharArray()));
    }

    @Test
    public void testOneSpaceMiddle() {
        assertThat(urlify.replaceSpaces("Mr John Smith    ".toCharArray(), 13),
                is("Mr%20John%20Smith".toCharArray()));
    }

    @Test
    public void testThreeSpacessMiddle() {
        assertThat(urlify.replaceSpaces("Mr   John      ".toCharArray(), 9),
                is("Mr%20%20%20John".toCharArray()));
    }

}