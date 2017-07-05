package com.aconsuegra.datastructure

import org.junit.Assert.assertThat
import org.junit.Test
import org.hamcrest.CoreMatchers.`is` as iz

class KListNodeTest {

    @Test
    fun testAppend() {
        val listNode = KListNode(1)
        assertThat(listNode.append(2).append(3).toString(),
                iz("KListNode(data=1, next=KListNode(data=2, next=KListNode(data=3, next=null)))"))
    }

    @Test
    fun testSize() {
        val listNode = KListNode(1, KListNode(2))
        assertThat(listNode.size(), iz(2))
    }

}