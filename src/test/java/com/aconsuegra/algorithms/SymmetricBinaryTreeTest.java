package com.aconsuegra.algorithms;

import org.junit.Before;
import org.junit.Test;

import com.aconsuegra.datastructure.BinaryTreeNode;
import com.aconsuegra.datastructure.BinaryTreeUtils;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class SymmetricBinaryTreeTest {

    SymmetricBinaryTree symmetricBinaryTree;

    @Before
    public void setUp() {
        symmetricBinaryTree = new SymmetricBinaryTree();
    }

    @Test
    public void testNotSymmetric() {
        assertThat(symmetricBinaryTree
                .isSymmetric(BinaryTreeUtils.createBalancedBinaryTreeFor(-1, 2, 3, 1, -1, 2, 3)),
                is(false));
    }

    @Test
    public void testSymmetric() {
        assertThat(symmetricBinaryTree
                        .isSymmetric(BinaryTreeUtils.createBalancedBinaryTreeFor(3, 2, 4, 1, 4, 2, 3)),
                is(true));
    }
}