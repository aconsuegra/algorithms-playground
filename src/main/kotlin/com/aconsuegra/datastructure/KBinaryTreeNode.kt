package com.aconsuegra.datastructure

data class KBinaryTreeNode<T>(val data: T,
                              var left: KBinaryTreeNode<T>? = null,
                              var right: KBinaryTreeNode<T>? = null)