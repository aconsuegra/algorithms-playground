package com.aconsuegra.algorithms

/**
 * Given numRows, generate the first numRows of Pascal’s triangle.
 * <p>
 * Pascal’s triangle : To generate A[C] in row R, sum up A’[C] and A’[C-1] from previous row R - 1.
 * <p>
 * Example:
 * <p>
 * Given numRows = 5,
 * <p>
 * Return
 * <p>
 * [
 * [1],
 * [1,1],
 * [1,2,1],
 * [1,3,3,1],
 * [1,4,6,4,1]
 * ]
 */
class KPascalTriangle {

    fun generate(rows: Int): Array<IntArray> {
        val triangle = Array(rows, { intArrayOf() })
        for (i in 0 until rows) {
            triangle[i] = IntArray(i + 1)
            for (j in 0..i) {
                triangle[i][j] = calculateValue(triangle, i - 1, j)
            }
        }
        return triangle
    }

    private fun calculateValue(triangle: Array<IntArray>, i: Int, j: Int): Int {
        if (i < 0) {
            return 1
        }
        val row = triangle[i]
        if (j <= 0 || j >= row.size) {
            return 1
        }
        return row[j] + row[j - 1]
    }

}