package me.consuegra.algorithms;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class SingleNumberTest {

    SingleNumber singleNumber;

    @Before
    public void setUp() {
        singleNumber = new SingleNumber();
    }

    @Test
    public void testSmallInput() {
        assertThat(singleNumber.singleNumber(new int[] {1, 1, 2}), is(2));
    }

    @Test
    public void testLargeInput() {
        assertThat(singleNumber.singleNumber(new int[] {1, 1, 2, 3, 3, 4, 4}), is(2));
    }

    @Test
    public void testSmallInputNoMemory() {
        assertThat(singleNumber.singleNumberNoMemory(new int[] {1, 1, 2}), is(2));
    }

    @Test
    public void testLargeInputNoMemory() {
        assertThat(singleNumber.singleNumberNoMemory(new int[] {1, 1, 2, 3, 3, 4, 4}), is(2));
    }
}