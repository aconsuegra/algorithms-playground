package com.aconsuegra.algorithms

/**
 * Write an algorithm such that if an element in a matrix MxN is 0, it's entire row and column are set to 0
 */
class KZeroMatrix {

    fun setZero(input: Array<Array<Int>>): Array<Array<Int>> {
        val zeroRows = mutableSetOf<Int>()
        val zeroColumns = mutableSetOf<Int>()
        for ((columnIndex, column) in input.withIndex()) {
            for ((rowIndex, value) in column.withIndex()) {
                if (value == 0) {
                    zeroRows.add(columnIndex)
                    zeroColumns.add(rowIndex)
                }
            }
        }

        for ((columnIndex, column) in input.withIndex()) {
            for ((rowIndex, _) in column.withIndex()) {
                if (zeroColumns.contains(columnIndex) || zeroRows.contains(rowIndex)) {
                    input[rowIndex][columnIndex] = 0
                }
            }
        }
        return input
    }

}