package com.aconsuegra.algorithms;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class MultiplyIntArrayTest {

    MultiplyIntArray multiplyIntArray;

    @Before
    public void setUp() {
        multiplyIntArray = new MultiplyIntArray();
    }

    @Test
    public void multiplyIntArrayOption1() {
        assertThat(multiplyIntArray.multiplyIntArrayOption1(new int[] {1, 2, 3, 4}), is(new int[] {24, 12, 8, 6}));
        assertThat(multiplyIntArray.multiplyIntArrayOption1(new int[] {6, -4, 0, 5}), is(new int[] {0, 0, -120, 0}));
        assertThat(multiplyIntArray.multiplyIntArrayOption1(new int[] {3, 3}), is(new int[] {3, 3}));
    }

    @Test
    public void multiplyIntArrayOption2() {
        assertThat(multiplyIntArray.multiplyIntArrayOption2(new int[] {1, 2, 3, 4}), is(new int[] {24, 12, 8, 6}));
        assertThat(multiplyIntArray.multiplyIntArrayOption2(new int[] {6, -4, 0, 5}), is(new int[] {0, 0, -120, 0}));
        assertThat(multiplyIntArray.multiplyIntArrayOption2(new int[] {3, 3}), is(new int[] {3, 3}));
    }

}