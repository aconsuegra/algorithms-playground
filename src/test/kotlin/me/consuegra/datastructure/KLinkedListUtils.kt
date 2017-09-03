package me.consuegra.datastructure

object KLinkedListUtils {

    fun <T> createLinkedListFor(vararg input: T): KListNode<T>? {
        if (input.isEmpty()) {
            return null
        }
        val head = KListNode(input[0])
        for(index in 1..input.size - 1) {
            head.append(input[index])
        }
        return head
    }

}