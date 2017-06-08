package com.aconsuegra.datastructure

data class KListNode<T>(val data:T, var next:KListNode<T>? = null) {

    fun append(value: T): KListNode<T> {
        val newNode = KListNode(value)
        var currentNode = this
        while (currentNode.next != null) {
            currentNode = currentNode.next as KListNode<T>
        }
        currentNode.next = newNode
        return this
    }

}