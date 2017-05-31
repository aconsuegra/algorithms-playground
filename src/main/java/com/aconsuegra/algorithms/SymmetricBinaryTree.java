package com.aconsuegra.algorithms;

import com.aconsuegra.datastructure.BinaryTreeNode;

/**
 * Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).
 * Example :
 *
 *     1
 *    / \
 *   2   2
 *  / \ / \
 * 3  4 4  3
 *
 * The above binary tree is symmetric.
 * But the following is not:
 *
 *     1
 *    / \
 *   2   2
 *   \   \
 *   3    3
 *
 */
public class SymmetricBinaryTree {

    public boolean isSymmetric(BinaryTreeNode a) {
        String preOrder = preOrder(a);
        String postOrder = postOrder(a);

        if (preOrder.length() != postOrder.length()) {
            return false;
        }
        int j = postOrder.length() - 1;
        for (int i = 0; i < preOrder.length(); i++) {
            if (preOrder.charAt(i) != postOrder.charAt(j)) {
                return false;
            }
            j--;
        }
        return true;
    }

    private String preOrder(BinaryTreeNode<Integer> a) {
        return preOrder(a, new StringBuilder()).toString();
    }

    private StringBuilder preOrder(BinaryTreeNode<Integer> a, StringBuilder sb) {
        if (a != null) {
            sb.append(a.getVal());
            preOrder(a.getLeft(), sb);
            preOrder(a.getRight(), sb);
        }
        return sb;
    }

    private String postOrder(BinaryTreeNode<Integer> a) {
        return postOrder(a, new StringBuilder()).toString();
    }

    private StringBuilder postOrder(BinaryTreeNode<Integer> a, StringBuilder sb) {
        if (a != null) {
            postOrder(a.getLeft(), sb);
            postOrder(a.getRight(), sb);
            sb.append(a.getVal());
        }
        return sb;
    }

}
