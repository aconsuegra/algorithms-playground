package com.aconsuegra.algorithms;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertThat;

public class WaveArrayTest {

    WaveArray waveArray;

    @Before
    public void setUp() {
        waveArray = new WaveArray();
    }

    @Test
    public void testNullArray() {
        assertThat(waveArray.wave(null), is(nullValue()));
    }

    @Test
    public void testEmptyArray() {
        assertThat(waveArray.wave(new int[] {}), is(new int[] {}));
    }

    @Test
    public void test1EntryArray() {
        assertThat(waveArray.wave(new int[] {2}), is(new int[] {2}));
    }

    @Test
    public void test2EntriesArray() {
        assertThat(waveArray.wave(new int[] {1, 2}), is(new int[] {2, 1}));
    }

    @Test
    public void testMediumArrayArray() {
        assertThat(waveArray.wave(new int[] {3, 1, 2, 5, 4}), is(new int[] {2, 1, 4, 3, 5}));
    }

}