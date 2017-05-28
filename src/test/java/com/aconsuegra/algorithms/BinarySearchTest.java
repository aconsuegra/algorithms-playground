package com.aconsuegra.algorithms;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class BinarySearchTest {

    BinarySearch binarySearch;

    @Before
    public void setUp() {
        binarySearch = new BinarySearch();
    }

    @Test
    public void testEmptyArraySolution1() {
        assertThat(binarySearch.binarySearch(new int[] {}, 4), is(-1));
    }

    @Test
    public void testNotFoundSolution1() {
        assertThat(binarySearch.binarySearch(new int[] {1, 2, 3}, 4), is(-1));
    }

    @Test
    public void testFoundInMiddleSolution1() {
        assertThat(binarySearch.binarySearch(new int[] {3, 5, 7, 9, 10}, 9), is(3));
    }

    @Test
    public void testFoundInEdgeSolution1() {
        assertThat(binarySearch.binarySearch(new int[] {1, 2, 3, 4, 5}, 1), is(0));
    }

    @Test
    public void testEmptyArraySolution2() {
        assertThat(binarySearch.binarySearchRec(new int[] {}, 4), is(-1));
    }

    @Test
    public void testNotFoundSolution2() {
        assertThat(binarySearch.binarySearchRec(new int[] {1, 2, 3}, 4), is(-1));
    }

    @Test
    public void testFoundInMiddleSolution2() {
        assertThat(binarySearch.binarySearchRec(new int[] {3, 5, 7, 9, 10}, 9), is(3));
    }

    @Test
    public void testFoundInEdgeSolution2() {
        assertThat(binarySearch.binarySearchRec(new int[] {1, 2, 3, 4, 5}, 1), is(0));
    }

}