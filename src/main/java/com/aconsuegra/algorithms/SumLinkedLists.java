package com.aconsuegra.algorithms;

import com.aconsuegra.datastructure.ListNode;

/**
 * You have two numbers represented by a linked list, where each node represents a single digit. The digits are
 * stored in reverse1 order, such as the 1's digit is at the head of the list. Write a function that adds the two
 * numbers and return the sum as a linked list.
 * <p>
 * Example
 * INPUT: 7->1->6 + 5->9->2
 * OUTPUT: 2->1->9
 */
public class SumLinkedLists {

    public ListNode<Integer> sum(ListNode<Integer> list1, ListNode<Integer> list2) {
        ListNode<Integer> result = null;

        int acc = 0;
        while (list1 != null || list2 != null) {
            int list1Value = list1 != null ? list1.getVal() : 0;
            int list2Value = list2 != null ? list2.getVal() : 0;
            int sum = acc + list1Value + list2Value;
            if (sum >= 10) {
                acc = 1;
                result = add(result, sum % 10);
            } else {
                acc = 0;
                result = add(result, sum);
            }
            list1 = list1 != null ? list1.getNext() : null;
            list2 = list2 != null ? list2.getNext() : null;
        }

        return acc == 1 ? add(result, 1) : result;
    }

    private ListNode<Integer> add(ListNode<Integer> result, int value) {
        if (result == null) {
            result = new ListNode<>(value);
        } else {
            result.append(value);
        }
        return result;
    }

    public ListNode<Integer> sumRec(ListNode<Integer> list1, ListNode<Integer> list2) {
        return sumRec(list1, list2, 0);
    }

    private ListNode<Integer> sumRec(ListNode<Integer> list1, ListNode<Integer> list2, int carry) {
        if (list1 == null && list2 == null && carry == 0) {
            return null;
        }

        int list1Value = list1 != null ? list1.getVal() : 0;
        int list2Value = list2 != null ? list2.getVal() : 0;
        int sum = carry + list1Value + list2Value;

        ListNode<Integer> result = new ListNode<>(sum % 10);
        if (list1 != null || list2 != null) {
            ListNode<Integer> more = sumRec(list1 != null ? list1.getNext() : null,
                    list2 != null ? list2.getNext() : null, sum >= 10 ? 1 : 0);
            result.setNext(more);
        }
        return result;
    }
}
