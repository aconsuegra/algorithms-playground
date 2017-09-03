package me.consuegra.algorithms

import me.consuegra.datastructure.KListNode

/**
 * Write code to remove duplicates from an unsorted linked list
 */
class KRemoveDuplicatesLinkedList {

    fun <T> removeDuplicates(list: KListNode<T>?): KListNode<T>? {
        val set = HashSet<T>()
        var lastValidNode: KListNode<T>? = null
        var head = list
        while (head != null) {
            if (set.contains(head.data)) {
                lastValidNode?.next = head.next
            } else {
                set.add(head.data)
                lastValidNode = head
            }
            head = head.next
        }
        return list
    }

}
