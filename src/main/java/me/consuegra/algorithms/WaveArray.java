package me.consuegra.algorithms;

import java.util.Arrays;

/**
 * Given an array of integers, sort the array into a wave like array and return it,
 * In other words, arrange the elements into a sequence such that a1 >= a2 <= a3 >= a4 <= a5...
 * <p>
 * Given [1, 2, 3, 4]
 * <p>
 * One possible answer : [2, 1, 4, 3]
 * Another possible answer : [4, 1, 3, 2]
 */
public class WaveArray {

    public int[] wave(int[] a) {
        if (a == null || a.length < 2) {
            return a;
        }
        Arrays.sort(a);
        int i = 0;
        for (int j = 1; j < a.length; j = j + 2) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i = i + 2;
        }
        return a;
    }

}
