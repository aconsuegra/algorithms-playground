package com.aconsuegra.algorithms;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ReverseIntegerTest {

    ReverseInteger reverseInteger;

    @Before
    public void setUp() throws Exception {
        reverseInteger = new ReverseInteger();
    }

    @Test
    public void test1DigitSolution1() {
        assertThat(reverseInteger.reverse1(1), is(1));
    }

    @Test
    public void test3DigitsSolution1() {
        assertThat(reverseInteger.reverse1(123), is(321));
    }

    @Test
    public void testNegativeSolution1() {
        assertThat(reverseInteger.reverse1(-123), is(-321));
    }

    @Test
    public void testOverflowSolution1() {
        assertThat(reverseInteger.reverse1(1000000003), is(0));
    }

    @Test
    public void testLeadingZerosSolution1() {
        assertThat(reverseInteger.reverse1(100), is(1));
    }

    @Test
    public void test1DigitSolution2() {
        assertThat(reverseInteger.reverse2(1), is(1));
    }

    @Test
    public void test3DigitsSolution2() {
        assertThat(reverseInteger.reverse2(123), is(321));
    }

    @Test
    public void testNegativeSolution2() {
        assertThat(reverseInteger.reverse2(-123), is(-321));
    }

    @Test
    public void testOverflowSolution2() {
        assertThat(reverseInteger.reverse2(1000000003), is(0));
    }

    @Test
    public void testLeadingZerosSolution2() {
        assertThat(reverseInteger.reverse2(100), is(1));
    }

}