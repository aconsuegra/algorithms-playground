package com.aconsuegra.datastructure

object KBinaryTreeUtils {

    fun <T> createBalancedSearchTreeFor(input: Array<T>): KBinaryTreeNode<T> {
        if (input.isEmpty()) {
            throw IllegalArgumentException("Invalid input")
        }
        input.sort()
        return createBalancedSearchTreeFor(input, 0, input.size - 1)!!
    }

    fun <T> createBalancedBinaryTreeFor(input: Array<T>): KBinaryTreeNode<T> {
        if (input.isEmpty()) {
            throw IllegalArgumentException("Invalid input")
        }
        return createBalancedSearchTreeFor(input, 0, input.size - 1)!!
    }

    private fun <T> createBalancedSearchTreeFor(input: Array<T>, start: Int, end: Int): KBinaryTreeNode<T>? {
        if (start > end) {
            return null
        }
        val middle = start + (end - start) / 2
        val node = KBinaryTreeNode(input[middle])
        node.left = createBalancedSearchTreeFor(input, start, middle - 1)
        node.right = createBalancedSearchTreeFor(input, middle + 1, end)
        return node
    }

}