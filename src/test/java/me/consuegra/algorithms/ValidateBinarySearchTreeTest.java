package me.consuegra.algorithms;

import org.junit.Before;
import org.junit.Test;

import me.consuegra.datastructure.BinaryTreeUtils;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ValidateBinarySearchTreeTest {

    ValidateBinarySearchTree validateBinarySearchTree;

    @Before
    public void setUp() {
        validateBinarySearchTree = new ValidateBinarySearchTree();
    }

    @Test
    public void testBinarySearchTree() {
        assertThat(validateBinarySearchTree.isBST(
                BinaryTreeUtils.createBalancedSearchTreeFor(2, 4, 5, 1, 7, 6, 3)), is(true));
    }

    @Test
    public void testNotBinarySearchTree() {
        assertThat(validateBinarySearchTree.isBST(
                BinaryTreeUtils.createBalancedBinaryTreeFor(2, 4, 5, 1, 7, 6, 3)), is(false));
    }
}