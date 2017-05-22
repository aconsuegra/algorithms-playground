package com.aconsuegra.algorithms;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class RemoveElementTest {

    RemoveElement removeElement;

    @Before
    public void setUp() {
        removeElement = new RemoveElement();
    }

    @Test
    public void removeElement() {
        assertThat(removeElement.removeElement(new int[] {3, 2, 2, 3}, 4),is(4));
        assertThat(removeElement.removeElement(new int[] {3, 2, 2, 3}, 3),is(2));
        assertThat(removeElement.removeElement(new int[] {3, 2, 3, 3}, 3),is(1));
        assertThat(removeElement.removeElement(new int[] {}, 3),is(0));
    }

}