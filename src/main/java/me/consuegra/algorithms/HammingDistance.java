package me.consuegra.algorithms;

/**
 * The Hamming distance between two integers is the number of positions at which the corresponding bits are
 * different.
 * <p>
 * Given two integers x and y, calculate the Hamming distance.
 * <p>
 * Note:
 * 0 ≤ x, y < 2^31.
 */
public class HammingDistance {

    public int hammingDistance(int x, int y) {
        return Integer.bitCount(x ^ y);
    }

}
