package com.aconsuegra.algorithms;

import com.aconsuegra.datastructure.BinaryTreeNode;

/**
 * Implement a function if a binary tree is balanced. For the purposes of this question a balanced tree is
 * defined to be a tree such that the heights of the two subtrees of any node never differ by more than one
 */
public class CheckBalancedBinaryTree {

    public boolean isBalanced(BinaryTreeNode<Integer> node) {
        return checkHeight(node) != Integer.MIN_VALUE;
    }

    private int checkHeight(BinaryTreeNode<Integer> node) {
        if (node == null) {
            return -1;
        }

        int leftHeight = checkHeight(node.getLeft());
        if (leftHeight == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }

        int rightHeight = checkHeight(node.getRight());
        if (rightHeight == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }

        int heightDiff = leftHeight - rightHeight;
        if (Math.abs(heightDiff) > 1) {
            return Integer.MIN_VALUE;
        } else {
            return Math.max(leftHeight, rightHeight) + 1;
        }
    }

}
