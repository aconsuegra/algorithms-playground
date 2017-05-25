package com.aconsuegra.algorithms;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class PlusOneTest {

    PlusOne plusOne;

    @Before
    public void setUp() {
        plusOne = new PlusOne();
    }

    @Test
    public void plusOne() {
        assertThat(plusOne.plusOne(new int[] {0}), is(new int[] {1}));
        assertThat(plusOne.plusOne(new int[] {9}), is(new int[] {1, 0}));
        assertThat(plusOne.plusOne(new int[] {3, 4}), is(new int[] {3, 5}));
        assertThat(plusOne.plusOne(new int[] {8, 9, 9}), is(new int[] {9, 0, 0}));
        assertThat(plusOne.plusOne(new int[] {9, 9}), is(new int[] {1, 0, 0}));
    }

}