package com.aconsuegra.algorithms;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class PascalTriangleTest {

    PascalTriangle pascalTriangle;

    @Before
    public void setUp() {
        pascalTriangle = new PascalTriangle();
    }

    @Test
    public void testGenerate2() {
        assertThat(pascalTriangle.generate(2), is(new int[][] {{1}, {1, 1}}));
    }

    @Test
    public void testGenerate5() {
        assertThat(pascalTriangle.generate(5), is(new int[][] {{1}, {1, 1}, {1, 2, 1}, {1, 3, 3, 1},
                {1, 4, 6, 4, 1}}));
    }
}