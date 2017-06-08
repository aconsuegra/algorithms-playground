package com.aconsuegra.datastructure

import org.junit.Assert.assertThat
import org.junit.Test
import java.util.*
import org.hamcrest.CoreMatchers.`is` as iz

class KStackTest {

    val stack = KStack<Int>()

    @Test
    fun testIsEmpty() {
        assertThat(stack.isEmpty(), iz(true))
    }

    @Test
    fun testPeek() {
        stack.push(1)
        assertThat(stack.peek(), iz(1))
    }

    @Test(expected = EmptyStackException::class)
    fun testPeekEmpty() {
        assertThat(stack.peek(), iz(1))
    }

    @Test
    fun testPush() {
        stack.push(1)
        assertThat(stack.isEmpty(), iz(false))
    }

    @Test
    fun testPop() {
        stack.push(1)
        stack.push(2)
        assertThat(stack.pop(), iz(2))
        assertThat(stack.pop(), iz(1))
        assertThat(stack.isEmpty(), iz(true))
    }

    @Test(expected = EmptyStackException::class)
    fun testPopEmpty() {
        assertThat(stack.pop(), iz(1))
    }

}