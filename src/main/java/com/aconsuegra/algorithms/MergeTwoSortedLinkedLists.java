package com.aconsuegra.algorithms;

import com.aconsuegra.datastructure.ListNode;

/**
 * Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together
 * the nodes of the first two lists.
 */
public class MergeTwoSortedLinkedLists {

    public ListNode<Integer> mergeTwoLists(ListNode<Integer> l1, ListNode<Integer> l2) {
        ListNode<Integer> result = null;
        while (l1 != null || l2 != null) {
            if (l1 != null && l2 != null) {
                if (l1.getVal() <= l2.getVal()) {
                    result = appendListNode(result, l1.getVal());
                    l1 = l1.getNext();
                } else {
                    result = appendListNode(result, l2.getVal());
                    l2 = l2.getNext();
                }
            } else if (l1 != null) {
                result = appendListNode(result, l1.getVal());
                l1 = l1.getNext();
            } else {
                result = appendListNode(result, l2.getVal());
                l2 = l2.getNext();
            }
        }
        return result;
    }

    private ListNode appendListNode(ListNode result, int value) {
        if (result == null) {
            result = new ListNode<>(value);
        } else {
            result.append(value);
        }

        return result;
    }

    public ListNode mergeTwoListsRec(ListNode<Integer> l1, ListNode<Integer> l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }

        ListNode result;
        if (l1.getVal() < l2.getVal()) {
            result = l1;
            result.setNext(mergeTwoLists(l1.getNext(), l2));
        } else {
            result = l2;
            result.setNext(mergeTwoLists(l1, l2.getNext()));
        }
        return result;
    }

}
