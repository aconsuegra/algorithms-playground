package com.aconsuegra.algorithms;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class SingleNumberTest {

    SingleNumber singleNumber;

    @Before
    public void setUp() {
        singleNumber = new SingleNumber();
    }

    @Test
    public void testSingleNumber() {
        assertThat(singleNumber.singleNumber(new int[] {1, 1, 2}), is(2));
        assertThat(singleNumber.singleNumber(new int[] {1, 1, 2, 3, 3, 4, 4}), is(2));
    }

    @Test
    public void testSingleNumberNoMemory() {
        assertThat(singleNumber.singleNumberNoMemory(new int[] {1, 1, 2}), is(2));
        assertThat(singleNumber.singleNumberNoMemory(new int[] {1, 1, 2, 3, 3, 4, 4}), is(2));
    }
}