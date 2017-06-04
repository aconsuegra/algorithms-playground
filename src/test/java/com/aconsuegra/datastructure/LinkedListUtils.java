package com.aconsuegra.datastructure;

public final class LinkedListUtils {

    private LinkedListUtils() {
        // Not meant to be instantiated
    }

    public static <T> ListNode<T> createLinkedListFor(T... input) {
        if (input == null || input.length == 0) {
            return null;
        }
        ListNode<T> listNode = new ListNode<>(input[0]);
        for (int i = 1; i < input.length; i++) {
            ListNode<T> newNode = new ListNode<>(input[i]);
            ListNode<T> l = listNode;
            while (l.getNext() != null) {
                l = l.getNext();
            }
            l.setNext(newNode);
        }
        return listNode;
    }

}
