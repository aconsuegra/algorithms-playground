package me.consuegra.algorithms;

/**
 * Given a column title as appears in an Excel sheet, return its corresponding column number.
 * <p>
 * Example:
 * A -> 1
 * B -> 2
 * C -> 3
 * ...
 * Z -> 26
 * AA -> 27
 * AB -> 28
 */
public class ExcelRows {

    public int titleToNumber(String a) {
        a = a.toUpperCase();
        int sum = 0;
        for (int i = 0; i < a.length(); i++) {
            sum *= 26;
            sum += a.charAt(i) - 'A' + 1;
        }
        return sum;
    }

}
