package com.aconsuegra.algorithms;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class MaxConsecutiveOnesTest {

    MaxConsecutiveOnes maxConsecutiveOnes;

    @Before
    public void setUp() {
        maxConsecutiveOnes = new MaxConsecutiveOnes();
    }

    @Test
    public void findMaxConsecutiveOnes() {
        assertThat(maxConsecutiveOnes.findMaxConsecutiveOnes(new int[] {1, 1, 0, 1, 1, 1}), is(3));
        assertThat(maxConsecutiveOnes.findMaxConsecutiveOnes(new int[] {1, 0, 0, 1, 0, 1, 0}), is(1));
        assertThat(maxConsecutiveOnes.findMaxConsecutiveOnes(new int[] {1, 0, 1, 1, 0, 1}), is(2));
    }

}