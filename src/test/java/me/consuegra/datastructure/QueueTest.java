package me.consuegra.datastructure;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class QueueTest {

    Queue<Integer> queue;

    @Before
    public void setUp() {
        queue = new Queue<>();
    }

    @Test
    public void testAdd() {
        queue.add(1);
        assertThat(queue.isEmpty(), is(false));
    }

    @Test
    public void testIsEmpty() {
        assertThat(queue.isEmpty(), is(true));
    }

    @Test
    public void testPeek() {
        queue.add(1);
        assertThat(queue.peek(), is(1));
    }

    @Test
    public void testRemove() {
        queue.add(1);
        queue.add(2);
        assertThat(queue.remove(), is(1));
        assertThat(queue.remove(), is(2));
        assertThat(queue.isEmpty(), is(true));
    }

}