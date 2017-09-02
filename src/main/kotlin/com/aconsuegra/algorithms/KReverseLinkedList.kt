package com.aconsuegra.algorithms

import com.aconsuegra.datastructure.KListNode
import com.aconsuegra.datastructure.KStack

/**
 * Implement an algorithm to return a reverse1 of a given linked list
 */
class KReverseLinkedList {

    fun <T> reverseOption1(input: KListNode<T>?): KListNode<T>? {
        val stack = KStack<T>()
        var head = input
        while (head != null) {
            stack.push(head.data)
            head = head.next
        }

        var result: KListNode<T>? = null
        while (!stack.isEmpty()) {
            result = result?.append(stack.pop()) ?: KListNode(data = stack.pop())
        }
        return result
    }

    fun <T> reverseOption2(input: KListNode<T>?): KListNode<T>? {
        var result: KListNode<T>? = null
        var head = input
        while (head != null) {
            val current = head
            head = head.next
            current.next = result
            result = current
        }
        return result
    }

    fun <T> reverseOptionRec(input: KListNode<T>?): KListNode<T>? {
        if (input == null || input.next == null) {
            return input
        }
        val head = input
        val result = reverseOptionRec(input.next)
        head.next?.next = head
        head.next = null
        return result
    }

}
