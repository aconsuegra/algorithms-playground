package com.aconsuegra.algorithms;

import com.aconsuegra.datastructure.BinaryTreeNode;

public class BinaryTreeTraversal<T> {

    public void preOrder(BinaryTreeNode<T> node) {
        if (node != null) {
            visit(node);
            preOrder(node.getLeft());
            preOrder(node.getRight());
        }
    }

    public void inOrder(BinaryTreeNode<T> node) {
        if (node != null) {
            inOrder(node.getLeft());
            visit(node);
            inOrder(node.getRight());
        }
    }

    public void postOrder(BinaryTreeNode<T> node) {
        if (node != null) {
            postOrder(node.getLeft());
            postOrder(node.getRight());
            visit(node);
        }
    }

    private void visit(BinaryTreeNode<T> node) {
        System.out.println("node = [" + node.getVal() + "]");
    }

}
