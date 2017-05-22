package com.aconsuegra.datastructure;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

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
        assertThat(stack.isEmpty(), is(false));
        assertThat(stack.peek(), is(1));
    }

    @Test
    public void pop() {
        stack.push(1);
        assertThat(stack.isEmpty(), is(false));
        assertThat(stack.pop(), is(1));
        assertThat(stack.isEmpty(), is(true));
    }

}