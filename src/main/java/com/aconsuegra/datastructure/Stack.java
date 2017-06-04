package com.aconsuegra.datastructure;

import java.util.EmptyStackException;

public class Stack<T> {

    private StackItem<T> top;

    public void push(T data) {
        StackItem<T> newTop = new StackItem<>(data);
        newTop.next = top;
        top = newTop;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public T peek() {
        if (top == null) {
            throw new EmptyStackException();
        }
        return top.data;
    }

    public T pop() {
        if (top == null) {
            throw new EmptyStackException();
        }
        T data = top.data;
        top = top.next;
        return data;
    }

    private static final class StackItem<T> {
        private final T data;

        private StackItem<T> next;

        private StackItem(T data) {
            this.data = data;
        }
    }

}
