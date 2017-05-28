package com.aconsuegra.algorithms;

import com.aconsuegra.datastructure.ListNode;

/**
 * Implement an algorithm to find the kth to last element on a singly linked list
 */
public class ReturnKthToLast {

    public <T> ListNode<T> findKthElement1(ListNode<T> head, int k) {
        int position = getSize(head) - k - 1;
        if (position < 0) {
            return null;
        }
        int index = 0;
        while (head != null) {
            if (index == position) {
                return head;
            }
            head = head.getNext();
            index++;
        }
        return null;
    }

    public <T> ListNode<T> findKthElement2(ListNode<T> head, int k) {
        ListNode<T> pointer = head;
        for (int i = 0; i <= k; i++) {
            if (pointer == null) {
                return null;
            }
            pointer = pointer.getNext();
        }

        while (pointer != null) {
            head = head.getNext();
            pointer = pointer.getNext();
        }

        return head;
    }

    private <T> int getSize(ListNode<T> head) {
        int size = 0;
        while (head != null) {
            size++;
            head = head.getNext();
        }
        return size;
    }

}
