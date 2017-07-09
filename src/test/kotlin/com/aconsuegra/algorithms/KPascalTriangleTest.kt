package com.aconsuegra.algorithms

import org.hamcrest.CoreMatchers.`is` as iz
import org.junit.Assert.*
import org.junit.Test

class KPascalTriangleTest {
    
    val pascalTriangle = KPascalTriangle()

    @Test
    fun testGenerate2() {
        assertThat(pascalTriangle.generate(2), iz(arrayOf(intArrayOf(1), intArrayOf(1, 1))))
    }

    @Test
    fun testGenerate5() {
        assertThat(pascalTriangle.generate(5), iz(arrayOf(intArrayOf(1), intArrayOf(1, 1), intArrayOf(1, 2, 1),
                intArrayOf(1, 3, 3, 1), intArrayOf(1, 4, 6, 4, 1))))
    }

}