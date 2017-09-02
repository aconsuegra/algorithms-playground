package com.aconsuegra.algorithms

import com.aconsuegra.datastructure.KListNode

/**
 * Implement an algorithm to find the kth to last element on a singly linked list
 */
class KReturnKthToLast {

    fun <T> findKthElement1(list: KListNode<T>?, k: Int): KListNode<T>? {
        val position = (list?.size() ?: 0) - k - 1
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
