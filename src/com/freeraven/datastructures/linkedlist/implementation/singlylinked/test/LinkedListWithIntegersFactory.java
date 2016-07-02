package com.freeraven.datastructures.linkedlist.implementation.singlylinked.test;

import com.freeraven.datastructures.linkedlist.implementation.LinkedList;
import com.freeraven.datastructures.linkedlist.implementation.singlylinked.SinglyLinkedListImpl;

public class LinkedListWithIntegersFactory {
    static LinkedList<Integer> createLinkedList(int... args) {
        LinkedList<Integer> list = new SinglyLinkedListImpl<Integer>();
        for (int arg : args) {
            list.append(arg);
        }
        return list;
    }
}