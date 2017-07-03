package com.aconsuegra.algorithms

import com.aconsuegra.datastructure.KListNode

/**
 * Implement an algorithm to find the kth to last element on a singly linked list
 */
class KReturnKthToLast {

    fun <T> findKthElement1(list: KListNode<T>?, k: Int): KListNode<T>? {
        val position = getSize(list) - k - 1
        if (position < 0) {
            return null
        }
        var index = 0
        var head = list
        while (head != null) {
            if (index == position) {
                return head
            }
            index++
            head = head.next
        }
        return null
    }

    private fun <T> getSize(list: KListNode<T>?): Int {
        var size = 0
        var head = list
        while (head != null) {
            size++
            head = head.next
        }
        return size
    }

    fun <T> findKthElement2(list: KListNode<T>?, k: Int): KListNode<T>? {
        var head = list
        var pointer = list
        for (i in 0..k) {
            pointer?.let {
                pointer = pointer?.next
            } ?: return null
        }
        while (pointer != null) {
            head = head?.next
            pointer = pointer?.next
        }
        return head
    }

}