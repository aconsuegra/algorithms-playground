package me.consuegra.algorithms

import me.consuegra.datastructure.KListNode

/**
 * Given a linked list, remove the nth node from the end of list and return its head.
 * <p>
 * For example,
 * Given linked list: 1->2->3->4->5, and n = 2.
 * After removing the second node from the end, the linked list becomes 1->2->3->5.
 * <p>
 * Note:
 * Given n will always be valid.
 * Try to do this in one pass.
 */
class KRemoveKthElementLinkedList {

    fun <T> removeKthFromEnd(list: KListNode<T>?, k: Int): KListNode<T>? {
        var head = list
        var result = head
        var pointer = result
        var index = 0
        while (head != null) {
            if (index > k) {
                pointer = pointer?.next
            }
            index++
            head = head.next
        }
        when (index) {
            k -> result = pointer?.next
            else -> pointer?.next = pointer?.next?.next
        }
        return result
    }

}
