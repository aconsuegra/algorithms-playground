package com.aconsuegra.datastructure;

import java.util.EmptyStackException;
import java.util.NoSuchElementException;

public class Queue<T> {

    private QueueItem<T> first;

    private QueueItem<T> last;

    public void add(T data) {
        QueueItem<T> item = new QueueItem<>(data);
        if (last != null) {
            last.next = item;
        }
        last = item;
        if (first == null) {
            first = last;
        }
    }

    public boolean isEmpty() {
        return first == null;
    }

    public T peek() {
        if (first == null) {
            throw new NoSuchElementException();
        }
        return first.data;
    }

    public T remove() {
        if (first == null) {
            throw new NoSuchElementException();
        }
        T data = first.data;
        first = first.next;
        if (first == null) {
            last = null;
        }
        return data;
    }

    private static class QueueItem<T> {
        private final T data;

        private QueueItem<T> next;

        private QueueItem(T data) {
            this.data = data;
        }
    }

}
