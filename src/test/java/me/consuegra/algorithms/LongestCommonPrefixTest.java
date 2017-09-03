package me.consuegra.algorithms;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class LongestCommonPrefixTest {

    LongestCommonPrefix longestCommonPrefix;

    @Before
    public void setUp() {
        longestCommonPrefix = new LongestCommonPrefix();
    }

    @Test
    public void testNullString() {
        assertThat(longestCommonPrefix.longestCommonPrefix(null), is(""));
    }

    @Test
    public void testNoStrings() {
        assertThat(longestCommonPrefix.longestCommonPrefix(new String[] {}), is(""));
    }

    @Test
    public void testEmptyString() {
        assertThat(longestCommonPrefix.longestCommonPrefix(new String[] {""}), is(""));
    }

    @Test
    public void test1String() {
        assertThat(longestCommonPrefix.longestCommonPrefix(new String[] {"abc"}), is("abc"));
    }

    @Test
    public void test2Strings() {
        assertThat(longestCommonPrefix.longestCommonPrefix(new String[] {"abcde", "abc"}), is("abc"));
    }

    @Test
    public void test4Strings() {
        assertThat(longestCommonPrefix.longestCommonPrefix(new String[] {"aaaaa", "aaa", "aab", "a"}),
                is("a"));
    }

    @Test
    public void test5Strings() {
        assertThat(longestCommonPrefix.longestCommonPrefix(new String[] {"aaaaa", "aaa", "aab", "a", "b"}),
                is(""));
    }

}