package com.aconsuegra.algorithms;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class OneAwayTest {

    OneAway oneAway;

    @Before
    public void setUp() {
        oneAway = new OneAway();
    }

    @Test
    public void testOneAway() {
        assertThat(oneAway.oneAway("abc", "a"), is(false));
        assertThat(oneAway.oneAway("a", "b"), is(true));
        assertThat(oneAway.oneAway("ab", "cd"), is(false));
        assertThat(oneAway.oneAway("abc", "ac"), is(true));
        assertThat(oneAway.oneAway("abc", "bc"), is(true));
        assertThat(oneAway.oneAway("abcd", "abcdef"), is(false));
        assertThat(oneAway.oneAway("abcdef", "abcdff"), is(true));
    }

}