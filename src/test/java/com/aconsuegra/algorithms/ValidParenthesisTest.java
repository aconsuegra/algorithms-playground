package com.aconsuegra.algorithms;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class ValidParenthesisTest {

    ValidParenthesis validParenthesis;

    @Before
    public void setUp() {
        validParenthesis = new ValidParenthesis();
    }

    @Test
    public void isValid() {
        assertThat(validParenthesis.isValid("["), is(false));
        assertThat(validParenthesis.isValid("()"), is(true));
        assertThat(validParenthesis.isValid("()[]{}"), is(true));
        assertThat(validParenthesis.isValid("([)]"), is(false));
        assertThat(validParenthesis.isValid("([]{})"), is(true));
    }

}