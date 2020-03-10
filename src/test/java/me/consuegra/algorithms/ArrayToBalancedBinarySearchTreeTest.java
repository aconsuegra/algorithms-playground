package me.consuegra.algorithms;

import org.junit.Before;
import org.junit.Test;

import me.consuegra.datastructure.BinaryTreeNode;
import me.consuegra.datastructure.BinaryTreeUtils;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ArrayToBalancedBinarySearchTreeTest {

    ArrayToBalancedBinarySearchTree arrayToBalancedBinarySearchTree;

    @Before
    public void setUp() {
        arrayToBalancedBinarySearchTree = new ArrayToBalancedBinarySearchTree();
    }

    @Test
    public void testArrayToTree() {
        BinaryTreeNode<Integer> tree = BinaryTreeUtils.createBalancedSearchTreeFor(5, 2, 1, 4, 8, 7, 9);
        assertThat(arrayToBalancedBinarySearchTree.arrayToTree(new int[] {4, 2, 7, 5, 9, 1, 8}), is(tree));
    }

}