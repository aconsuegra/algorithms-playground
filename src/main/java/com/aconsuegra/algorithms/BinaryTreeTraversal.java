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

    public void depth(BinaryTreeNode<T> node) {
        int height = height(node);
        for (int i = 0; i <= height; i++) {
            visitLevel(node, i);
        }
    }

    private int height(BinaryTreeNode<T> node) {
        if (node == null) {
            return 0;
        }
        int leftHeight = height(node.getLeft());
        int rightHeight = height(node.getRight());

        if (leftHeight > rightHeight) {
            return leftHeight + 1;
        } else {
            return rightHeight + 1;
        }
    }

    private void visitLevel(BinaryTreeNode<T> node, int level) {
        if (node != null) {
            if (level == 1) {
                visit(node);
            } else if (level > 1) {
                visitLevel(node.getLeft(), level - 1);
                visitLevel(node.getRight(), level - 1);
            }
        }
    }

    private void visit(BinaryTreeNode<T> node) {
        System.out.println("node = [" + node.getVal() + "]");
    }

}
