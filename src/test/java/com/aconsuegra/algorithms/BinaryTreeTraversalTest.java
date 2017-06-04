package com.aconsuegra.algorithms;

import org.junit.Before;
import org.junit.Test;

import com.aconsuegra.datastructure.BinaryTreeUtils;

public class BinaryTreeTraversalTest {

    BinaryTreeTraversal<Integer> binaryTreeTraversal;

    @Before
    public void setUp() {
        binaryTreeTraversal = new BinaryTreeTraversal<>();
    }

    @Test
    public void testPreOrderBalancedSearchTree() {
        binaryTreeTraversal.preOrder(BinaryTreeUtils.createBalancedSearchTreeFor(4, 2, 7, 5, 9, 1, 8));
    }

    @Test
    public void testPreOrderBalancedBinaryTree() {
        binaryTreeTraversal.preOrder(BinaryTreeUtils.createBalancedBinaryTreeFor(4, 2, 7, 5, 9, 1, 8));
    }

    @Test
    public void testInOrderBalancedSearchTree() {
        binaryTreeTraversal.inOrder(BinaryTreeUtils.createBalancedSearchTreeFor(4, 2, 7, 5, 9, 1, 8));
    }

    @Test
    public void testDepthBalancedSearchTree() {
        binaryTreeTraversal.depth(BinaryTreeUtils.createBalancedSearchTreeFor(4, 2, 7, 5, 9, 1, 8));
    }

    @Test
    public void testInOrderBalancedBinaryTree() {
        binaryTreeTraversal.inOrder(BinaryTreeUtils.createBalancedBinaryTreeFor(4, 2, 7, 5, 9, 1, 8));
    }

    @Test
    public void testPostOrderBalancedSearchTree() {
        binaryTreeTraversal.postOrder(BinaryTreeUtils.createBalancedSearchTreeFor(4, 2, 7, 5, 9, 1, 8));
    }

    @Test
    public void testPostOrderBalancedBinaryTree() {
        binaryTreeTraversal.postOrder(BinaryTreeUtils.createBalancedBinaryTreeFor(4, 2, 7, 5, 9, 1, 8));
    }

    @Test
    public void testDepthBalancedBinaryTree() {
        binaryTreeTraversal.depth(BinaryTreeUtils.createBalancedBinaryTreeFor(4, 2, 7, 5, 9, 1, 8));
    }

}