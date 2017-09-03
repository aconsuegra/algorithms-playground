package me.consuegra.algorithms;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class HammingDistanceTest {

    HammingDistance hammingDistance;

    @Before
    public void setUp() {
        hammingDistance = new HammingDistance();
    }

    @Test
    public void testNoDistance() {
        assertThat(hammingDistance.hammingDistance(4, 4), is(0));
    }

    @Test
    public void testDistance() {
        assertThat(hammingDistance.hammingDistance(7, 0), is(3));
    }

}