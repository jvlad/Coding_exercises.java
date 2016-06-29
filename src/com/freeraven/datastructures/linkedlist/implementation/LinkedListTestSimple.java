package com.freeraven.datastructures.linkedlist.implementation;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by zvlad on 6/29/16.
 */
public class LinkedListTestSimple {
    @Test
    public void toStringTest() throws Exception {
        LinkedList<Integer> listNode = new SinglyLinkedListImpl<Integer>(2);
        listNode.append(3).append(5);
        Assert.assertEquals("", listNode.print(), "[2, 3, 5]");
    }
}