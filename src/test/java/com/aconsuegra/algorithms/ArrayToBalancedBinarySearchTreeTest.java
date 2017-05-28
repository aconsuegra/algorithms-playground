package com.aconsuegra.algorithms;

import org.junit.Before;
import org.junit.Test;

import com.aconsuegra.datastructure.BinaryTreeNode;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class ArrayToBalancedBinarySearchTreeTest {

    ArrayToBalancedBinarySearchTree arrayToBalancedBinarySearchTree;

    @Before
    public void setUp() {
        arrayToBalancedBinarySearchTree = new ArrayToBalancedBinarySearchTree();
    }

    @Test
    public void testArrayToTree() {
        BinaryTreeNode<Integer> node5 = new BinaryTreeNode<>(5);
        BinaryTreeNode<Integer> node2 = new BinaryTreeNode<>(2);
        BinaryTreeNode<Integer> node1 = new BinaryTreeNode<>(1);
        BinaryTreeNode<Integer> node4 = new BinaryTreeNode<>(4);
        BinaryTreeNode<Integer> node8 = new BinaryTreeNode<>(8);
        BinaryTreeNode<Integer> node7 = new BinaryTreeNode<>(7);
        BinaryTreeNode<Integer> node9 = new BinaryTreeNode<>(9);
        node5.setLeft(node2);
        node2.setLeft(node1);
        node2.setRight(node4);
        node5.setRight(node8);
        node8.setLeft(node7);
        node8.setRight(node9);

        BinaryTreeNode<Integer> result
                = arrayToBalancedBinarySearchTree.arrayToTree(new int[] {4, 2, 7, 5, 9, 1, 8});
        assertThat(result, is(node5));
    }

}