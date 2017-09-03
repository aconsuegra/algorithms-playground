package me.consuegra.algorithms;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MaxConsecutiveOnesTest {

    MaxConsecutiveOnes maxConsecutiveOnes;

    @Before
    public void setUp() {
        maxConsecutiveOnes = new MaxConsecutiveOnes();
    }

    @Test
    public void testEndArray() {
        assertThat(maxConsecutiveOnes.findMaxConsecutiveOnes(new int[] {1, 1, 0, 1, 1, 1}), is(3));
    }

    @Test
    public void testAllOverArray() {
        assertThat(maxConsecutiveOnes.findMaxConsecutiveOnes(new int[] {1, 0, 0, 1, 0, 1, 0}), is(1));
    }

    @Test
    public void testMiddleAndEndArray() {
        assertThat(maxConsecutiveOnes.findMaxConsecutiveOnes(new int[] {1, 0, 1, 1, 0, 1}), is(2));
    }

}