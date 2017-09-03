package me.consuegra.algorithms

import me.consuegra.datastructure.KBinaryTreeUtils
import org.junit.Assert.assertThat
import org.junit.Test
import org.hamcrest.CoreMatchers.`is` as iz

class KSymmetricBinaryTreeTest {

    val symmetricBinaryTree = KSymmetricBinaryTree()

    @Test
    fun testNotSymmetric() {
        assertThat(symmetricBinaryTree
                .isSymmetric(KBinaryTreeUtils.createBalancedBinaryTreeFor(arrayOf(-1, 2, 3, 1, -1, 2, 3))),
                iz(false))
    }

    @Test
    fun testSymmetric() {
        assertThat(symmetricBinaryTree
                .isSymmetric(KBinaryTreeUtils.createBalancedBinaryTreeFor(arrayOf(3, 2, 4, 1, 4, 2, 3))), iz(true))
    }

}