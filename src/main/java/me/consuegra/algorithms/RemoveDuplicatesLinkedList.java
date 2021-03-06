package me.consuegra.algorithms;

import java.util.HashSet;
import java.util.Set;

import me.consuegra.datastructure.ListNode;

/**
 * Write code to remove duplicates from an unsorted linked list
 */
public class RemoveDuplicatesLinkedList {

    public ListNode<Integer> removeDuplicates(ListNode<Integer> input) {
        Set<Integer> set = new HashSet<>();
        ListNode<Integer> lastValidNode = null;
        ListNode<Integer> head = input;
        while (input != null) {
            if (set.contains(input.getVal())) {
                lastValidNode.setNext(input.getNext());
            } else {
                set.add(input.getVal());
                lastValidNode = input;
            }

            input = input.getNext();
        }
        return head;
    }

}
