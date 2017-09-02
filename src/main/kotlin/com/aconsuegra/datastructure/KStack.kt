package com.aconsuegra.datastructure

import java.util.EmptyStackException

class KStack<T> {

    private var top: StackItem<T>? = null

    fun isEmpty() = top == null

    fun peek() = top?.data ?: throw EmptyStackException()

    fun pop(): T {
        top?.let {
            top = it.next
            return it.data
        } ?: throw EmptyStackException()
    }

    fun push(data: T) {
        val newTop = StackItem(data)
        newTop.next = top
        top = newTop
    }

    private class StackItem<T> internal constructor(internal val data: T) {
        internal var next: StackItem<T>? = null
    }

}
