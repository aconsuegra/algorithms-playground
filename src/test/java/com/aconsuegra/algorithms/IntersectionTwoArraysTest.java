package com.aconsuegra.algorithms;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class IntersectionTwoArraysTest {

    IntersectionTwoArrays intersectionTwoArrays;

    @Before
    public void setUp() {
        intersectionTwoArrays = new IntersectionTwoArrays();
    }

    @Test
    public void intersection() {
        assertThat(intersectionTwoArrays.intersection(new int[] {1, 2, 2, 1}, new int[] {2, 2}), is(new int[] {2}));
        assertThat(intersectionTwoArrays.intersection(new int[] {}, new int[] {}), is(new int[] {}));
        assertThat(intersectionTwoArrays.intersection(new int[] {1, 2, 3}, new int[] {4, 5, 6}), is(new int[] {}));
        assertThat(intersectionTwoArrays.intersection(new int[] {1, 2, 3}, new int[] {2, 3, 4}), is(new int[] {2, 3}));
    }

}