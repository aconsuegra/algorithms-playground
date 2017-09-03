package me.consuegra.algorithms;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class PlusOneTest {

    PlusOne plusOne;

    @Before
    public void setUp() {
        plusOne = new PlusOne();
    }

    @Test
    public void test1Digit() {
        assertThat(plusOne.plusOne(new int[] {0}), is(new int[] {1}));
    }

    @Test
    public void test1DigitOverflow() {
        assertThat(plusOne.plusOne(new int[] {9}), is(new int[] {1, 0}));
    }

    @Test
    public void test2Digits() {
        assertThat(plusOne.plusOne(new int[] {3, 4}), is(new int[] {3, 5}));
    }

    @Test
    public void test2DigitsOverflow() {
        assertThat(plusOne.plusOne(new int[] {9, 9}), is(new int[] {1, 0, 0}));
    }

    @Test
    public void test3Digits() {
        assertThat(plusOne.plusOne(new int[] {8, 9, 9}), is(new int[] {9, 0, 0}));
    }

}