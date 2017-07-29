package com.aconsuegra.algorithms

import com.aconsuegra.datastructure.KListNode

/**
 * Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together
 * the nodes of the first two lists.
 */
class KMergeTwoSortedLinkedLists {

    fun merge(list1: KListNode<Int>?, list2: KListNode<Int>?) : KListNode<Int>? {
        var auxList1 = list1
        var auxList2 = list2
        var result: KListNode<Int>? = null
        while (auxList1 != null || auxList2 != null) {
            when {
                auxList1 != null && auxList2 != null -> {
                    if (auxList1.data <= auxList2.data) {
                        result = result?.append(auxList1.data) ?: KListNode(auxList1.data)
                        auxList1 = auxList1.next
                    } else {
                        result = result?.append(auxList2.data) ?: KListNode(auxList2.data)
                        auxList2 = auxList2.next
                    }
                }
                auxList1 != null -> {
                    result = result?.append(auxList1.data) ?: KListNode(auxList1.data)
                    auxList1 = auxList1.next
                }
                auxList2 != null -> {
                    result = result?.append(auxList2.data) ?: KListNode(auxList2.data)
                    auxList2 = auxList2.next
                }
            }
        }
        return result
    }

    fun mergeRec(list1: KListNode<Int>?, list2: KListNode<Int>?) : KListNode<Int>? {
        if (list1 == null) {
            return list2
        }
        if (list2 == null) {
            return list1
        }
        val result: KListNode<Int>?
        if (list1.data < list2.data) {
            result = list1
            result.next = merge(list1.next, list2)
        } else {
            result = list2
            result.next = merge(list1, list2.next)
        }
        return result
    }

}