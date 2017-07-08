package com.aconsuegra.algorithms

import com.aconsuegra.datastructure.KListNode

/**
 * Write code to remove duplicates from a sorted linked list
 */
class KRemoveDuplicatesSortedLinkedList {

    fun <T> removeDuplicates(list: KListNode<T>?): KListNode<T>? {
        var head = list
        while (head != null && head.next != null) {
            if (head.next?.data == head.data) {
                head.next = head.next?.next
            } else {
                head = head.next
            }
        }
        return list
    }

}