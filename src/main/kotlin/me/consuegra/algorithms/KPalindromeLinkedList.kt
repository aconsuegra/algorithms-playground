package me.consuegra.algorithms

import me.consuegra.datastructure.KListNode
import me.consuegra.datastructure.KStack

/**
 * Implement a function to check if a linked list is a palindrome
 */
class KPalindromeLinkedList {

    fun <T> isPalindromeSolution1(input: KListNode<T>?) : Boolean {
        return input?.let { it == KReverseLinkedList().reverseOption1(input) } ?: false
    }

    fun <T> isPalindromeSolution2(input: KListNode<T>?) : Boolean {
        val stack = KStack<T>()
        var slow = input
        var fast = input

        while (fast != null && fast.next != null) {
            slow?.data?.let { stack.push(it) }
            slow = slow?.next
            fast = fast.next?.next
        }

        if (fast != null) {
            slow = slow?.next
        }

        while (slow != null) {
            if (stack.pop() != slow.data) {
                return false
            }
            slow = slow.next
        }
        return true
    }

}
