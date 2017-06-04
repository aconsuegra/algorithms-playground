package com.aconsuegra.algorithms;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class SearchInsertPositionTest {

    SearchInsertPosition searchInsertPosition;

    @Before
    public void setUp() {
        searchInsertPosition = new SearchInsertPosition();
    }

    @Test
    public void testEmptyArray() {
        assertThat(searchInsertPosition.searchInsert(new int[] {}, 4), is(0));
    }

    @Test
    public void test1EntryNotFound() {
        assertThat(searchInsertPosition.searchInsert(new int[] {0}, 4), is(1));
    }

    @Test
    public void test1EntryFound() {
        assertThat(searchInsertPosition.searchInsert(new int[] {0}, 0), is(0));
    }

    @Test
    public void test2EntriesNotFound() {
        assertThat(searchInsertPosition.searchInsert(new int[] {1, 3}, 0), is(0));
    }

    @Test
    public void test2EntriesFound() {
        assertThat(searchInsertPosition.searchInsert(new int[] {1, 3}, 3), is(1));
    }

    @Test
    public void testLargeArrayNotFound() {
        assertThat(searchInsertPosition.searchInsert(new int[] {3, 5, 7, 9, 10}, 8), is(3));
    }

    @Test
    public void testLargeArrayFound() {
        assertThat(searchInsertPosition.searchInsert(new int[] {3, 5, 7, 9, 10}, 7), is(2));
    }

    @Test
    public void testEmptyArrayRec() {
        assertThat(searchInsertPosition.searchInsertRec(new int[] {}, 4), is(0));
    }

    @Test
    public void test1EntryNotFoundRec() {
        assertThat(searchInsertPosition.searchInsertRec(new int[] {0}, 4), is(1));
    }

    @Test
    public void test1EntryFoundRec() {
        assertThat(searchInsertPosition.searchInsertRec(new int[] {0}, 0), is(0));
    }

    @Test
    public void test2EntriesNotFoundRec() {
        assertThat(searchInsertPosition.searchInsertRec(new int[] {1, 3}, 0), is(0));
    }

    @Test
    public void test2EntriesFoundRec() {
        assertThat(searchInsertPosition.searchInsertRec(new int[] {1, 3}, 3), is(1));
    }

    @Test
    public void testLargeArrayNotFoundRec() {
        assertThat(searchInsertPosition.searchInsertRec(new int[] {3, 5, 7, 9, 10}, 8), is(3));
    }

    @Test
    public void testLargeArrayFoundRec() {
        assertThat(searchInsertPosition.searchInsertRec(new int[] {3, 5, 7, 9, 10}, 7), is(2));
    }

}