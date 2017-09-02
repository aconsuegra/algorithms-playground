package com.aconsuegra.datastructure

import java.util.NoSuchElementException

class KQueue<T> {

    private var first: QueueItem<T>? = null

    private var last: QueueItem<T>? = null

    fun isEmpty() = first == null

    fun peek() = first?.data ?: throw NoSuchElementException()

    fun remove(): T {
        first?.let {
            val data = it.data
            first = it.next
            if (first == null) last = null
            return data
        } ?: throw NoSuchElementException()
    }

    fun add(data: T) {
        val item = QueueItem(data)
        last?.let { it.next = item }
        last = item
        if (first == null) first = last
    }

    private class QueueItem<T> internal constructor(internal val data: T) {
        internal var next: QueueItem<T>? = null
    }

}
