package com.aconsuegra.algorithms;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class SearchInsertPositionTest {

    SearchInsertPosition searchInsertPosition;

    @Before
    public void setUp() {
        searchInsertPosition = new SearchInsertPosition();
    }

    @Test
    public void searchInsert() {
        assertThat(searchInsertPosition.searchInsert(new int[] {}, 4), is(0));
        assertThat(searchInsertPosition.searchInsert(new int[] {0}, 4), is(1));
        assertThat(searchInsertPosition.searchInsert(new int[] {0}, 0), is(0));
        assertThat(searchInsertPosition.searchInsert(new int[] {1, 3}, 0), is(0));
        assertThat(searchInsertPosition.searchInsert(new int[] {1, 3}, 4), is(2));
        assertThat(searchInsertPosition.searchInsert(new int[] {1, 2, 3}, 4), is(3));
        assertThat(searchInsertPosition.searchInsert(new int[] {1, 2, 3}, 0), is(0));
        assertThat(searchInsertPosition.searchInsert(new int[] {1, 2, 3, 4}, 4), is(3));
        assertThat(searchInsertPosition.searchInsert(new int[] {1, 2, 3, 4, 5}, 3), is(2));
        assertThat(searchInsertPosition.searchInsert(new int[] {1, 2, 3, 4, 5}, 1), is(0));
        assertThat(searchInsertPosition.searchInsert(new int[] {1, 3, 5, 6}, 5), is(2));
        assertThat(searchInsertPosition.searchInsert(new int[] {1, 3, 5, 6}, 2), is(1));
        assertThat(searchInsertPosition.searchInsert(new int[] {1, 3, 5, 6}, 9), is(4));
        assertThat(searchInsertPosition.searchInsert(new int[] {3, 5, 7, 9, 10}, 8), is(3));
    }

    @Test
    public void searchInsertRec() {
        assertThat(searchInsertPosition.searchInsertRec(new int[] {}, 4), is(0));
        assertThat(searchInsertPosition.searchInsertRec(new int[] {0}, 4), is(1));
        assertThat(searchInsertPosition.searchInsertRec(new int[] {0}, 0), is(0));
        assertThat(searchInsertPosition.searchInsertRec(new int[] {1, 3}, 0), is(0));
        assertThat(searchInsertPosition.searchInsertRec(new int[] {1, 3}, 4), is(2));
        assertThat(searchInsertPosition.searchInsertRec(new int[] {1, 2, 3}, 4), is(3));
        assertThat(searchInsertPosition.searchInsertRec(new int[] {1, 2, 3}, 0), is(0));
        assertThat(searchInsertPosition.searchInsertRec(new int[] {1, 2, 3, 4}, 4), is(3));
        assertThat(searchInsertPosition.searchInsertRec(new int[] {1, 2, 3, 4, 5}, 3), is(2));
        assertThat(searchInsertPosition.searchInsertRec(new int[] {1, 2, 3, 4, 5}, 1), is(0));
        assertThat(searchInsertPosition.searchInsertRec(new int[] {1, 3, 5, 6}, 5), is(2));
        assertThat(searchInsertPosition.searchInsertRec(new int[] {1, 3, 5, 6}, 2), is(1));
        assertThat(searchInsertPosition.searchInsertRec(new int[] {1, 3, 5, 6}, 9), is(4));
        assertThat(searchInsertPosition.searchInsertRec(new int[] {3, 5, 7, 9, 10}, 8), is(3));
    }

}