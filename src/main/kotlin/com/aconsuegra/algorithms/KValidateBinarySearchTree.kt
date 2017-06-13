package com.aconsuegra.algorithms

import com.aconsuegra.datastructure.BinaryTreeNode

/**
 * Implement a function to check if a binary tree is a binary search tree
 */
class KValidateBinarySearchTree {

    fun isBST(node: BinaryTreeNode<Int>): Boolean = isBST(node, null, null)

    private fun isBST(node: BinaryTreeNode<Int>?, min: Int?, max: Int?): Boolean {
        if (node == null) {
            return true
        }
        if (minValue(node, min) || maxValue(node, max)) {
            return false
        }
        if (!isBST(node.left, min, node.`val`) || !isBST(node.right, node.`val`, max)) {
            return false
        }
        return true
    }

    fun minValue(node: BinaryTreeNode<Int>, min: Int?) = min != null && node.`val` <= min

    fun maxValue(node: BinaryTreeNode<Int>, max: Int?) = max != null && node.`val` > max

}