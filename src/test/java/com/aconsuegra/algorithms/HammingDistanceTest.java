package com.aconsuegra.algorithms;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class HammingDistanceTest {

    HammingDistance hammingDistance;

    @Before
    public void setUp() {
        hammingDistance = new HammingDistance();
    }

    @Test
    public void hammingDistance() {
        assertThat(hammingDistance.hammingDistance(4, 1), is(2));
        assertThat(hammingDistance.hammingDistance(4, 4), is(0));
        assertThat(hammingDistance.hammingDistance(7, 0), is(3));
    }

}