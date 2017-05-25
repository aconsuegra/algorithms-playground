package com.aconsuegra.algorithms;

import java.util.HashSet;
import java.util.Set;

import com.aconsuegra.datastructure.ListNode;

/**
 * Write code to remove duplicates from an unsorted linked list
 */
public class RemoveDuplicatesLinkedList {

    public void removeDuplicates(ListNode<Integer> input) {
        Set<Integer> set = new HashSet<>();
        ListNode lastValidNode = null;
        while (input != null) {
            if(set.contains(input.getVal())) {
                lastValidNode.setNext(input.getNext());
            } else {
                set.add(input.getVal());
                lastValidNode = input;
            }

            input = input.getNext();
        }
    }

}
