package com.aconsuegra.algorithms

import com.aconsuegra.datastructure.BinaryTreeUtils
import org.hamcrest.CoreMatchers.`is` as iz
import org.junit.Assert.*
import org.junit.Test

class KValidateBinarySearchTreeTest {

    val validateBST = KValidateBinarySearchTree()

    @Test
    fun testBinarySearchTree() {
        assertThat(validateBST.isBST(
                BinaryTreeUtils.createBalancedSearchTreeFor(2, 4, 5, 1, 7, 6, 3)), iz(true))
    }

    @Test
    fun testNotBinarySearchTree() {
        assertThat(validateBST.isBST(
                BinaryTreeUtils.createBalancedBinaryTreeFor(2, 4, 5, 1, 7, 6, 3)), iz(false))
    }

}