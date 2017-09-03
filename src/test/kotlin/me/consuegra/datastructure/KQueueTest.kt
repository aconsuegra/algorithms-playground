package me.consuegra.datastructure

import org.junit.Assert.assertThat
import org.junit.Test
import java.util.*
import org.hamcrest.CoreMatchers.`is` as iz

class KQueueTest {

    val queue = KQueue<Int>()

    @Test
    fun testIsEmpty() {
        assertThat(queue.isEmpty(), iz(true))
    }

    @Test
    fun testPeek() {
        queue.add(1)
        assertThat(queue.peek(), iz(1))
    }

    @Test(expected = NoSuchElementException::class)
    fun testPeekEmpty() {
        assertThat(queue.peek(), iz(1))
    }

    @Test
    fun testAdd() {
        queue.add(1)
        assertThat(queue.isEmpty(), iz(false))
    }

    @Test(expected = NoSuchElementException::class)
    fun testRemoveEmpty() {
        assertThat(queue.remove(), iz(1))
    }

    @Test
    fun testRemove() {
        queue.add(1)
        queue.add(2)
        queue.add(3)
        assertThat(queue.remove(), iz(1))
        assertThat(queue.remove(), iz(2))
        assertThat(queue.remove(), iz(3))
        assertThat(queue.isEmpty(), iz(true))
    }

}