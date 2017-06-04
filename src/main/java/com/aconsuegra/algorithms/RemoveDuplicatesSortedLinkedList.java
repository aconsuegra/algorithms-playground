package com.aconsuegra.algorithms;

import com.aconsuegra.datastructure.ListNode;

/**
 * Write code to remove duplicates from a sorted linked list
 */
public class RemoveDuplicatesSortedLinkedList {

    public <T> ListNode<T> removeDuplicates(ListNode<T> input) {
        ListNode<T> current = input;
        while (current != null && current.getNext() != null) {
            if (current.getNext().getVal().equals(current.getVal())) {
                current.setNext(current.getNext().getNext());
            } else {
                current = current.getNext();
            }
        }
        return input;
    }

}
