package com.aconsuegra.algorithms

import com.aconsuegra.datastructure.KBinaryTreeNode

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
class KSymmetricBinaryTree {

    fun isSymmetric(treeNode: KBinaryTreeNode<Int>): Boolean {
        val preOrder = preOrder(treeNode)
        val postOrder = postOrder(treeNode)

        if (preOrder.length != postOrder.length) {
            return false
        }

        var j = postOrder.length - 1
        for (c in preOrder) {
            if (c != postOrder[j]) {
                return false
            }
            j--
        }
        return true
    }

    private fun preOrder(treeNode: KBinaryTreeNode<Int>?): String = preOrder(treeNode, StringBuilder()).toString()

    private fun preOrder(treeNode: KBinaryTreeNode<Int>?, acc: StringBuilder): StringBuilder {
        treeNode?.let {
            acc.append(treeNode.data)
            preOrder(treeNode.left, acc)
            preOrder(treeNode.right, acc)
        }
        return acc
    }

    private fun postOrder(treeNode: KBinaryTreeNode<Int>?): String = postOrder(treeNode, StringBuilder()).toString()

    private fun postOrder(treeNode: KBinaryTreeNode<Int>?, acc: StringBuilder): StringBuilder {
        treeNode?.let {
            postOrder(treeNode.left, acc)
            postOrder(treeNode.right, acc)
            acc.append(treeNode.data)
        }
        return acc
    }

}