package com.freeraven.datastructures.linkedlist.implementation;

/**
 * Created by zvlad on 6/29/16.
 */
public interface LinkedList<T> {
    LinkedList<T> append(T obj);

    T getData();

    T getData(int position);

    LinkedList<T> deleteNodeAtPosition(int position);

    // TODO: 7/2/16 write unitTest
    int getSize();
}
