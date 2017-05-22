package com.aconsuegra.algorithms;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class RomanToIntegerTest {

    RomanToInteger romanToInteger;

    @Before
    public void setUp() {
        romanToInteger = new RomanToInteger();
    }

    @Test
    public void romanToInt() {
        assertThat(romanToInteger.romanToInt(""), is(0));
        assertThat(romanToInteger.romanToInt("XI"), is(11));
        assertThat(romanToInteger.romanToInt("IX"), is(9));
        assertThat(romanToInteger.romanToInt("MDC"), is(1600));
        assertThat(romanToInteger.romanToInt("CMXLIX"), is(949));
        assertThat(romanToInteger.romanToInt("MMMDCCLXXXIII"), is(3783));
    }

}