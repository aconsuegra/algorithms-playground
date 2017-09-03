package me.consuegra.algorithms;

import me.consuegra.datastructure.ListNode;

/**
 * Given a linked list, remove the nth node from the end of list and return its head.
 * <p>
 * For example,
 * Given linked list: 1->2->3->4->5, and n = 2.
 * After removing the second node from the end, the linked list becomes 1->2->3->5.
 * <p>
 * Note:
 * If n is greater than the size of the list, remove the first node of the list.
 */
public class RemoveKthElementLinkedList {

    public <T> ListNode<T> removeNthFromEnd(ListNode<T> a, int b) {
        int position = Math.max(0, getSize(a) - b);
        if (position == 0) {
            return a.getNext();
        }
        int index = 0;
        ListNode<T> result = a;
        while (a != null) {
            if (index == position - 1) {
                a.setNext(a.getNext().getNext());
                break;
            }
            index++;
            a = a.getNext();
        }
        return result;
    }

    private int getSize(ListNode a) {
        int size = 0;
        while (a != null) {
            size++;
            a = a.getNext();
        }
        return size;
    }

    public <T> ListNode<T> removeNthFromEndOnePass(ListNode<T> head, int n) {
        ListNode<T> result = head;
        ListNode<T> pointer = result;
        int i = 0;
        while (head != null) {
            if (i > n) {
                pointer = pointer.getNext();
            }
            i++;
            head = head.getNext();
        }
        if (n == i) {
            result = pointer.getNext();
        } else {
            pointer.setNext(pointer.getNext().getNext());
        }
        return result;
    }
}
