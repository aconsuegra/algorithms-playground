package com.aconsuegra.algorithms

import com.aconsuegra.datastructure.BinaryTreeNode

/**
 * Implement a function to check if a binary tree is a binary search tree
 */
class KValidateBinarySearchTree {

    fun isBST(node: BinaryTreeNode<Int>): Boolean = isBST(node, null, null)

    internal fun isBST(node: BinaryTreeNode<Int>?, min: Int?, max: Int?): Boolean {
        if (node == null) {
            return true
        }
        if ((min != null && node.`val` <= min) || (max != null && node.`val` > max)) {
            return false
        }
        if (!isBST(node.left, min, node.`val`) || !isBST(node.right, node.`val`, max)) {
            return false
        }
        return true
    }

}