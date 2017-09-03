package me.consuegra.datastructure

import org.hamcrest.CoreMatchers.nullValue
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.CoreMatchers.`is` as iz
import org.junit.Test

class KBinaryTreeNodeTest {

    @Test
    fun testCreationWithoutChildren() {
        val binaryTreeNode = KBinaryTreeNode(4)
        assertThat(binaryTreeNode.data, iz(4))
        assertThat(binaryTreeNode.left, iz(nullValue()))
        assertThat(binaryTreeNode.right, iz(nullValue()))
    }

    @Test
    fun testCreationWithChildren() {
        val binaryTreeNode = KBinaryTreeNode(4, KBinaryTreeNode(3), KBinaryTreeNode(5))
        assertThat(binaryTreeNode.data, iz(4))
        assertThat(binaryTreeNode.left, iz(KBinaryTreeNode(3)))
        assertThat(binaryTreeNode.right, iz(KBinaryTreeNode(5)))
    }

}