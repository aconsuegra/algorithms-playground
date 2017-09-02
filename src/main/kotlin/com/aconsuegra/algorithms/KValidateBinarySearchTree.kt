package com.aconsuegra.algorithms

import com.aconsuegra.datastructure.KBinaryTreeNode

/**
 * Implement a function to check if a binary tree is a binary search tree
 */
class KValidateBinarySearchTree {

    fun isBST(node: KBinaryTreeNode<Int>): Boolean = isBST(node, null, null)

    private fun isBST(node: KBinaryTreeNode<Int>?, min: Int?, max: Int?): Boolean {
        if (node == null) {
            return true
        }
        if (minValue(node, min) || maxValue(node, max)) {
            return false
        }
        if (!isBST(node.left, min, node.data) || !isBST(node.right, node.data, max)) {
            return false
        }
        return true
    }

    fun minValue(node: KBinaryTreeNode<Int>, min: Int?) = min != null && node.data <= min

    fun maxValue(node: KBinaryTreeNode<Int>, max: Int?) = max != null && node.data > max

}
