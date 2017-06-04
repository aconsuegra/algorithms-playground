package com.aconsuegra.algorithms;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MoveZerosTest {

    MoveZeros moveZeros;

    @Before
    public void setUp() {
        moveZeros = new MoveZeros();
    }

    @Test
    public void testNullArray() {
        assertThat(moveZeros.move(null), is(new int[] {}));
    }

    @Test
    public void testEmptyArray() {
        assertThat(moveZeros.move(new int[] {}), is(new int[] {}));
    }

    @Test
    public void test1EntryArray() {
        assertThat(moveZeros.move(new int[] {0}), is(new int[] {0}));
    }

    @Test
    public void test2EntriesArray() {
        assertThat(moveZeros.move(new int[] {0, 1}), is(new int[] {1, 0}));
    }

    @Test
    public void testNormalArray() {
        assertThat(moveZeros.move(new int[] {1, 2, 0, 3, 0, 1, 2}), is(new int[] {1, 2, 3, 1, 2, 0, 0}));
    }

}