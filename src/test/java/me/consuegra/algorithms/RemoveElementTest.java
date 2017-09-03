package me.consuegra.algorithms;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class RemoveElementTest {

    RemoveElement removeElement;

    @Before
    public void setUp() {
        removeElement = new RemoveElement();
    }

    @Test
    public void testEmptyList() {
        assertThat(removeElement.removeElement(new int[] {}, 3), is(0));
    }

    @Test
    public void testNotFoundElement() {
        assertThat(removeElement.removeElement(new int[] {3, 2, 2, 3}, 4), is(4));
    }

    @Test
    public void testLastElement() {
        assertThat(removeElement.removeElement(new int[] {3, 2, 3, 3}, 3), is(1));
    }

    @Test
    public void testAllButOneElement() {
        assertThat(removeElement.removeElement(new int[] {3, 2, 3, 3}, 3), is(1));
    }

}