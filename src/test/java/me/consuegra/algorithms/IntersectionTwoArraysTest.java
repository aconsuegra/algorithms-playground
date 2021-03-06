package me.consuegra.algorithms;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class IntersectionTwoArraysTest {

    IntersectionTwoArrays intersectionTwoArrays;

    @Before
    public void setUp() {
        intersectionTwoArrays = new IntersectionTwoArrays();
    }

    @Test
    public void testEmptyArrays() {
        assertThat(intersectionTwoArrays.intersection(new int[] {}, new int[] {}), is(new int[] {}));
    }

    @Test
    public void test1Intersection() {
        assertThat(intersectionTwoArrays.intersection(new int[] {1, 2, 2, 1}, new int[] {2, 2}),
                is(new int[] {2}));
    }

    @Test
    public void testNoIntersections() {
        assertThat(intersectionTwoArrays.intersection(new int[] {1, 2, 3}, new int[] {4, 5, 6}), is(new int[] {}));
    }

    @Test
    public void test2Intersections() {
        assertThat(intersectionTwoArrays.intersection(new int[] {1, 2, 3}, new int[] {2, 3, 4}),
                is(new int[] {2, 3}));
    }

}