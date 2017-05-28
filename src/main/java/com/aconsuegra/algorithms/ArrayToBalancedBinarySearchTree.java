package com.aconsuegra.algorithms;

import java.util.Arrays;

import com.aconsuegra.datastructure.BinaryTreeNode;

/**
 * Given an array of integers, build a balanced binary search tree ouf of it
 */
public class ArrayToBalancedBinarySearchTree {

    public BinaryTreeNode<Integer> arrayToTree(int[] input) {
        if (input == null || input.length == 0) {
            return null;
        }
        Arrays.sort(input);
        return arrayToTreeRec(input, 0, input.length - 1);
    }

    private BinaryTreeNode<Integer> arrayToTreeRec(int[] input, int start, int end) {
        if (start < 0 || end >= input.length || end < start) {
            return null;
        }
        int middle = start + ((end - start) / 2);
        BinaryTreeNode<Integer> node = new BinaryTreeNode<>(input[middle]);
        node.setLeft(arrayToTreeRec(input, start, middle - 1));
        node.setRight(arrayToTreeRec(input, middle + 1, end));
        return node;
    }
}
