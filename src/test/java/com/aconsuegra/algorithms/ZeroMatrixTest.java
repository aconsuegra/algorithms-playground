package com.aconsuegra.algorithms;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class ZeroMatrixTest {

    ZeroMatrix zeroMatrix;

    @Before
    public void setUp() {
        zeroMatrix = new ZeroMatrix();
    }

    @Test
    public void test2x2Matrix() {
        assertThat(zeroMatrix.setZero(new int[][] {{0, 1}, {2, 0}}), is(new int[][] {{0, 0}, {0, 0}}));
    }

    @Test
    public void test3x3Matrix() {
        assertThat(zeroMatrix.setZero(new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 0, 9}}),
                is(new int[][] {{1, 0, 3}, {4, 0, 6}, {0, 0, 0}}));
    }

    @Test
    public void test3x3NoZerosMatrix() {
        assertThat(zeroMatrix.setZero(new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}),
                is(new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}));
    }

}