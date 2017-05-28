package com.aconsuegra.datastructure;

public class BinaryTreeNode<T> {

    private T val;

    private BinaryTreeNode<T> left;

    private BinaryTreeNode<T> right;

    public BinaryTreeNode(T val) {
        this.val = val;
    }

    public void setLeft(BinaryTreeNode<T> left) {
        this.left = left;
    }

    public void setRight(BinaryTreeNode<T> right) {
        this.right = right;
    }

    public T getVal() {
        return val;
    }

    public BinaryTreeNode<T> getLeft() {
        return left;
    }

    public BinaryTreeNode<T> getRight() {
        return right;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        BinaryTreeNode<?> that = (BinaryTreeNode<?>) o;

        if (val != null ? !val.equals(that.val) : that.val != null) {
            return false;
        }
        if (left != null ? !left.equals(that.left) : that.left != null) {
            return false;
        }
        return right != null ? right.equals(that.right) : that.right == null;
    }

    @Override
    public int hashCode() {
        int result = val != null ? val.hashCode() : 0;
        result = 31 * result + (left != null ? left.hashCode() : 0);
        result = 31 * result + (right != null ? right.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "BinaryTreeNode{val=" + val + ", left=" + left + ", right=" + right + '}';
    }
}
