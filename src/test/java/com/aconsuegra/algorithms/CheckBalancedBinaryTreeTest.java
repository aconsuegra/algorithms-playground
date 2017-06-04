package com.aconsuegra.algorithms;

import org.junit.Before;
import org.junit.Test;

import com.aconsuegra.datastructure.BinaryTreeUtils;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class CheckBalancedBinaryTreeTest {

    CheckBalancedBinaryTree checkBalancedBinaryTree;

    @Before
    public void setUp() {
        checkBalancedBinaryTree = new CheckBalancedBinaryTree();
    }

    @Test
    public void testBalancedTree() {
        assertThat(checkBalancedBinaryTree
                .isBalanced(BinaryTreeUtils.createBalancedBinaryTreeFor(2, 4, 5, 3, 1, 7)), is(true));
    }

    @Test
    public void testNotBalancedTree() {
        assertThat(checkBalancedBinaryTree
                .isBalanced(BinaryTreeUtils.createBalancedBinaryTreeFor(2, 4, 5, 3, 1, 7)), is(true));
    }

}