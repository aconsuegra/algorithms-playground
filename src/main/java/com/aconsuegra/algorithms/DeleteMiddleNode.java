package com.aconsuegra.algorithms;

import com.aconsuegra.datastructure.ListNode;

/**
 * Implement an algorithm to delete a node in the middle (any node but the first or the last, not necessarily the
 * exact middle) of a singly linked list, given only access to that node.
 * <p>
 * Example:
 * INPUT: the node c from the linked list a->b->c->d->e
 * OUTPUT: nothing is returned but the new linked list is a->b->d->e
 */
public class DeleteMiddleNode {

    public <T> void deleteNode(ListNode<T> node) {
        if (node == null || node.getNext() == null) {
            return;
        }
        node.setVal(node.getNext().getVal());
        node.setNext(node.getNext().getNext());
    }

}
