package com.aconsuegra.algorithms;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ValidParenthesisTest {

    ValidParenthesis validParenthesis;

    @Before
    public void setUp() {
        validParenthesis = new ValidParenthesis();
    }

    @Test
    public void testOneParenthesis() {
        assertThat(validParenthesis.isValid("["), is(false));
    }

    @Test
    public void testTwoParenthesis() {
        assertThat(validParenthesis.isValid("()"), is(true));
    }

    @Test
    public void testFourInvalidParenthesis() {
        assertThat(validParenthesis.isValid("([)]"), is(false));
    }

    @Test
    public void testSixInvalidParenthesis() {
        assertThat(validParenthesis.isValid("([]{})"), is(true));
    }

    @Test
    public void testSixValidParenthesis() {
        assertThat(validParenthesis.isValid("()[]{}"), is(true));
    }

}