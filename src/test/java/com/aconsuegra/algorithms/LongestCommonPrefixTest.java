package com.aconsuegra.algorithms;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class LongestCommonPrefixTest {

    LongestCommonPrefix longestCommonPrefix;

    @Before
    public void setUp() {
        longestCommonPrefix = new LongestCommonPrefix();
    }

    @Test
    public void longestCommonPrefix() {
        assertThat(longestCommonPrefix.longestCommonPrefix(null), is(""));
        assertThat(longestCommonPrefix.longestCommonPrefix(new String[]{}), is(""));
        assertThat(longestCommonPrefix.longestCommonPrefix(new String[]{""}), is(""));
        assertThat(longestCommonPrefix.longestCommonPrefix(new String[]{"abc"}), is("abc"));
        assertThat(longestCommonPrefix.longestCommonPrefix(new String[]{"abc", "abc"}), is("abc"));
        assertThat(longestCommonPrefix.longestCommonPrefix(new String[]{"abcde", "abc"}), is("abc"));
        assertThat(longestCommonPrefix.longestCommonPrefix(new String[]{"aaaaa", "aaa", "aab", "a"}), is("a"));
        assertThat(longestCommonPrefix.longestCommonPrefix(new String[]{"aaaaa", "aaa", "aab", "a", "b"}), is(""));
    }

}