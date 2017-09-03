package me.consuegra.algorithms

import me.consuegra.datastructure.KBinaryTreeUtils
import org.junit.Assert.assertThat
import org.junit.Test
import org.hamcrest.CoreMatchers.`is` as iz

class KValidateBinarySearchTreeTest {

    val validateBST = KValidateBinarySearchTree()

    @Test
    fun testBinarySearchTree() {
        assertThat(validateBST.isBST(
                KBinaryTreeUtils.createBalancedSearchTreeFor(arrayOf(2, 4, 5, 1, 7, 6, 3))), iz(true))
    }

    @Test
    fun testNotBinarySearchTree() {
        assertThat(validateBST.isBST(KBinaryTreeUtils.createBalancedBinaryTreeFor(arrayOf(2, 4, 5, 1, 7, 6, 3))),
                iz(false))
    }

}