package com.aconsuegra.algorithms

import org.junit.Assert.assertThat
import org.junit.Test
import org.hamcrest.CoreMatchers.`is` as iz

class KZeroMatrixTest {

    val zeroMatrix = KZeroMatrix()

    @Test
    fun test2x2Matrix() {
        assertThat(zeroMatrix.setZero(arrayOf(intArrayOf(0, 1), intArrayOf(2, 0))),
                iz(arrayOf(intArrayOf(0, 0), intArrayOf(0, 0))))
    }

    @Test
    fun test3x3Matrix() {
        assertThat(zeroMatrix.setZero(arrayOf(intArrayOf(1, 2, 3), intArrayOf(4, 5, 6), intArrayOf(7, 0, 9))),
                iz(arrayOf(intArrayOf(1, 0, 3), intArrayOf(4, 0, 6), intArrayOf(0, 0, 0))))
    }

    @Test
    fun test3x3NoZerosMatrix() {
        assertThat(zeroMatrix.setZero(arrayOf(intArrayOf(1, 2, 3), intArrayOf(4, 5, 6), intArrayOf(7, 8, 9))),
                iz(arrayOf(intArrayOf(1, 2, 3), intArrayOf(4, 5, 6), intArrayOf(7, 8, 9))))
    }

}