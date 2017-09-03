package me.consuegra.datastructure;

/**
 * Linked List node
 */
public class ListNode<T> {

    private T val;

    private ListNode<T> next;

    public ListNode(T val) {
        this.val = val;
    }

    public void setVal(T val) {
        this.val = val;
    }

    public T getVal() {
        return val;
    }

    public void setNext(ListNode<T> next) {
        this.next = next;
    }

    public ListNode<T> getNext() {
        return next;
    }

    public void append(T val) {
        ListNode<T> node = new ListNode<>(val);
        ListNode<T> n = this;
        while (n.getNext() != null) {
            n = n.getNext();
        }
        n.setNext(node);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        ListNode<?> listNode = (ListNode<?>) o;

        if (val != null ? !val.equals(listNode.val) : listNode.val != null) {
            return false;
        }
        return next != null ? next.equals(listNode.next) : listNode.next == null;
    }

    @Override
    public int hashCode() {
        int result = val != null ? val.hashCode() : 0;
        result = 31 * result + (next != null ? next.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ListNode{val=" + val + ", next=" + next + '}';
    }
}
