package me.consuegra.algorithms;

/**
 * Reverse digits of an integer.
 * <p>
 * Example1: x = 123, return 321
 * Example2: x = -123, return -321
 * <p>
 * The input is assumed to be a 32-bit signed integer. Your function should return 0 when the reversed integer
 * overflows.
 */
public class ReverseInteger {

    /**
     * Solution 1
     */
    public int reverse1(int x) {
        boolean isNegative = x < 0;
        StringBuilder sb = new StringBuilder();
        int absX = Math.abs(x);
        while (absX > 0) {
            sb.append(absX % 10);
            absX /= 10;
        }
        if (isNegative) {
            sb.insert(0, "-");
        }
        try {
            return Integer.parseInt(sb.toString());
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    /**
     * Solution 2
     */
    public int reverse2(int x) {
        boolean isNegative = x < 0;
        int absX = Math.abs(x);
        long acc = 0;
        while (absX > 0) {
            acc = acc * 10 + absX % 10;
            if (acc > Integer.MAX_VALUE) {
                return 0;
            }
            absX /= 10;
        }
        if (isNegative) {
            acc = -acc;
        }
        return (int) acc;
    }

}
