package me.consuegra.algorithms;

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
public class PascalTriangle {

    public int[][] generate(int a) {
        int[][] result = new int[a][];
        for (int i = 0; i < a; i++) {
            result[i] = new int[i + 1];
            for (int j = 0; j < i + 1; j++) {
                result[i][j] = calculateValue(result, i - 1, j);
            }
        }
        return result;
    }

    private int calculateValue(int[][] triangle, int i, int j) {
        if (i < 0) {
            return 1;
        }
        int[] row = triangle[i];
        if (j <= 0 || j >= row.length) {
            return 1;
        }
        return row[j] + row[j - 1];
    }
}
