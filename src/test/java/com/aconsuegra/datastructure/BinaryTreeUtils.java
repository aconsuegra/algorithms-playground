package com.aconsuegra.datastructure;

import java.util.Arrays;

public final class BinaryTreeUtils {

    private BinaryTreeUtils() {
        // Not meant to be instantiated
    }

    public static <T> BinaryTreeNode<T> createBalancedSearchTreeFor(T... input) {
        if (input == null || input.length == 0) {
            return null;
        }
        Arrays.sort(input);
        return createBalancedSearchTreeFor(input, 0, input.length - 1);
    }

    public static <T> BinaryTreeNode<T> createBalancedBinaryTreeFor(T... input) {
        if (input == null || input.length == 0) {
            return null;
        }
        return createBalancedSearchTreeFor(input, 0, input.length - 1);
    }

    private static <T> BinaryTreeNode<T> createBalancedSearchTreeFor(T[] input, int start, int end) {
        if (start > end) {
            return null;
        }
        int middle = start + ((end - start) / 2);
        BinaryTreeNode<T> node = new BinaryTreeNode<>(input[middle]);
        node.setLeft(createBalancedSearchTreeFor(input, start, middle - 1));
        node.setRight(createBalancedSearchTreeFor(input, middle + 1, end));
        return node;
    }
}
