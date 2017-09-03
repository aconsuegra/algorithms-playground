package me.consuegra.algorithms;

import me.consuegra.datastructure.ListNode;
import me.consuegra.datastructure.Stack;

/**
 * Implement an algorithm to return a reverse1 of a given linked list
 */
public class ReverseLinkedList {

    public <T> ListNode<T> reverse1(ListNode<T> head) {
        Stack<T> stack = new Stack<>();
        while (head != null) {
            stack.push(head.getVal());
            head = head.getNext();
        }

        ListNode<T> result = null;
        while (!stack.isEmpty()) {
            if (result == null) {
                result = new ListNode<>(stack.pop());
            } else {
                result.append(stack.pop());
            }
        }

        return result;
    }

    public <T> ListNode<T> reverse2(ListNode<T> head) {
        ListNode<T> result = null;

        while (head != null) {
            ListNode<T> current = head;
            head = head.getNext();
            current.setNext(result);
            result = current;
        }

        return result;
    }

    public <T> ListNode<T> reverseRec(ListNode<T> head) {
        if (head == null || head.getNext() == null) {
            return head;
        }
        ListNode<T> result = reverseRec(head.getNext());
        head.getNext().setNext(head);
        head.setNext(null);
        return result;
    }

}
