package com.aconsuegra.algorithms;

import com.aconsuegra.datastructure.ListNode;
import com.aconsuegra.datastructure.Stack;

/**
 * Implement a function to check if a linked list is a palindrome
 */
public class PalindromeLinkedList {

    public <T> boolean isPalindrome1(ListNode<T> list) {
        if (list == null) {
            return false;
        }
        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
        ListNode<T> reversed = reverseLinkedList.reverse1(list);
        return reversed.equals(list);
    }

    public <T> boolean isPalindrome2(ListNode<T> list) {
        if (list == null) {
            return false;
        }

        Stack<T> stack = new Stack<>();
        ListNode<T> fast = list;
        ListNode<T> slow = list;

        while (fast != null && fast.getNext() != null) {
            stack.push(slow.getVal());
            slow = slow.getNext();
            fast = fast.getNext().getNext();
        }

        if (fast != null) {
            slow = slow.getNext();
        }

        while (slow != null) {
            if (!stack.pop().equals(slow.getVal())) {
                return false;
            }
            slow = slow.getNext();
        }

        return true;
    }

}
