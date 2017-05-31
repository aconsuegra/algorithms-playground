package com.aconsuegra.algorithms;

/**
 * Given an array of numbers move all 0s to the right end and all other numbers to the left while keeping
 * relative order of non-zero numbers. Has to be linear in time and in-place.
 * <p>
 * For array [1, 2, 0, 3, 0, 1, 2], the program can output [1, 2, 3, 1, 2, 0, 0]
 */
public class MoveZeros {

    public int[] move(int[] a) {

        int ii = 1000;
        System.out.println(ii >> 2);

        if (a == null || a.length == 0) {
            return new int[] {};
        }
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                a[i - count] = a[i];
            } else {
                count++;
            }
        }
        for (int i = a.length - count; i < a.length; i++) {
            a[i] = 0;
        }
        return a;
    }

}
