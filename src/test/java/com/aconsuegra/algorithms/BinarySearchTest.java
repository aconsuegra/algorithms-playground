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
    public void binarySearch() {
        assertThat(binarySearch.binarySearch(new int[] {}, 4), is(-1));
        assertThat(binarySearch.binarySearch(new int[] {0}, 4), is(-1));
        assertThat(binarySearch.binarySearch(new int[] {1, 2, 3}, 4), is(-1));
        assertThat(binarySearch.binarySearch(new int[] {1, 2, 3, 4}, 4), is(3));
        assertThat(binarySearch.binarySearch(new int[] {1, 2, 3, 4, 5}, 3), is(2));
        assertThat(binarySearch.binarySearch(new int[] {1, 2, 3, 4, 5}, 1), is(0));
        assertThat(binarySearch.binarySearch(new int[] {3, 5, 7, 9, 10}, 9), is(3));
    }

    @Test
    public void binarySearchRec() {
        assertThat(binarySearch.binarySearchRec(new int[] {}, 4), is(-1));
        assertThat(binarySearch.binarySearchRec(new int[] {0}, 4), is(-1));
        assertThat(binarySearch.binarySearchRec(new int[] {1, 2, 3}, 4), is(-1));
        assertThat(binarySearch.binarySearchRec(new int[] {1, 2, 3, 4}, 4), is(3));
        assertThat(binarySearch.binarySearchRec(new int[] {1, 2, 3, 4, 5}, 3), is(2));
        assertThat(binarySearch.binarySearchRec(new int[] {1, 2, 3, 4, 5}, 1), is(0));
        assertThat(binarySearch.binarySearchRec(new int[] {3, 5, 7, 9, 10}, 9), is(3));
    }

}