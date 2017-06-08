package com.aconsuegra.algorithms

import org.junit.Assert.assertThat
import org.junit.Test
import org.hamcrest.CoreMatchers.`is` as iz

class KZeroMatrixTest {

    val zeroMatrix = KZeroMatrix()

    @Test
    fun test2x2Matrix() {
        assertThat(zeroMatrix.setZero(arrayOf(arrayOf(0, 1), arrayOf(2, 0))),
                iz(arrayOf(arrayOf(0, 0), arrayOf(0, 0))))
    }

    @Test
    fun test3x3Matrix() {
        assertThat(zeroMatrix.setZero(arrayOf(arrayOf(1, 2, 3), arrayOf(4, 5, 6), arrayOf(7, 0, 9))),
                iz(arrayOf(arrayOf(1, 0, 3), arrayOf(4, 0, 6), arrayOf(0, 0, 0))))
    }

    @Test
    fun test3x3NoZerosMatrix() {
        assertThat(zeroMatrix.setZero(arrayOf(arrayOf(1, 2, 3), arrayOf(4, 5, 6), arrayOf(7, 8, 9))),
                iz(arrayOf(arrayOf(1, 2, 3), arrayOf(4, 5, 6), arrayOf(7, 8, 9))))
    }

}