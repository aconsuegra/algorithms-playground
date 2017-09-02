package com.aconsuegra.algorithms

import com.aconsuegra.datastructure.KListNode

/**
 * You have two numbers represented by a linked list, where each node represents a single digit. The digits are
 * stored in reverse1 order, such as the 1's digit is at the head of the list. Write a function that adds the two
 * numbers and return the sum as a linked list.
 * <p>
 * Example
 * INPUT: 7->1->6 + 5->9->2
 * OUTPUT: 2->1->9
 */
class KSumLinkedLists {

    fun sum(param1: KListNode<Int>?, param2: KListNode<Int>?): KListNode<Int>? {
        var result: KListNode<Int>? = null
        var list1 = param1
        var list2 = param2

        var acc = 0
        while (list1 != null || list2 != null) {
            val list1Data = list1?.data ?: 0
            val list2Data = list2?.data ?: 0

            val sum = acc.plus(list1Data).plus(list2Data)
            if (sum >= 10) {
                acc = 1
                result = add(result, sum % 10)
            } else {
                acc = 0
                result = add(result, sum)
            }
            list1 = list1?.next
            list2 = list2?.next
        }

        return if (acc == 1) add(result, acc) else result
    }

    private fun add(result: KListNode<Int>?, value: Int): KListNode<Int> {
        return result?.append(value) ?: KListNode(data = value)
    }

    fun sumRec(list1: KListNode<Int>?, list2: KListNode<Int>?): KListNode<Int>? = sumRec(list1, list2, 0)

    private fun sumRec(list1: KListNode<Int>?, list2: KListNode<Int>?, carry: Int): KListNode<Int>? {
        if (list1 == null && list2 == null && carry == 0) {
            return null
        }

        val list1Data = list1?.data ?: 0
        val list2Data = list2?.data ?: 0
        val sum = carry.plus(list1Data).plus(list2Data)

        val result = KListNode(sum % 10)
        if (list1 != null || list2 != null) {
            val more = sumRec(list1?.next, list2?.next, if (sum >= 10) 1 else 0)
            result.next = more
        }
        return result
    }

}
