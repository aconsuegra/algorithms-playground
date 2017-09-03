package me.consuegra.algorithms;

import me.consuegra.datastructure.BinaryTreeNode;

/**
 * Implement a function to check if a binary tree is a binary search tree
 */
public class ValidateBinarySearchTree {

    public boolean isBST(BinaryTreeNode<Integer> node) {
        return isBST(node, null, null);
    }

    private boolean isBST(BinaryTreeNode<Integer> node, Integer min, Integer max) {
        if (node == null) {
            return true;
        }
        if ((min != null && node.getVal() <= min) || (max != null && node.getVal() > max)) {
            return false;
        }
        if (!isBST(node.getLeft(), min, node.getVal()) || !isBST(node.getRight(), node.getVal(), max)) {
            return false;
        }
        return true;
    }

}
