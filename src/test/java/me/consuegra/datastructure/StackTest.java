package me.consuegra.datastructure;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class StackTest {

    Stack<Integer> stack;

    @Before
    public void setUp() {
        stack = new Stack<>();
    }

    @Test
    public void testPush() {
        stack.push(1);
        assertThat(stack.isEmpty(), is(false));
    }

    @Test
    public void testIsEmpty() {
        assertThat(stack.isEmpty(), is(true));
    }

    @Test
    public void testPeek() {
        stack.push(1);
        assertThat(stack.peek(), is(1));
    }

    @Test
    public void testPop() {
        stack.push(1);
        stack.push(2);
        assertThat(stack.pop(), is(2));
        assertThat(stack.pop(), is(1));
        assertThat(stack.isEmpty(), is(true));
    }

}