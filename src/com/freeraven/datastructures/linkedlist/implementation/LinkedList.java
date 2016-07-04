package com.freeraven.datastructures.linkedlist.implementation;

/**
 * Created by zvlad on 6/29/16.
 */
public interface LinkedList<T> {
    void append(T obj);

    T getData(int position);

    void deleteNodeAt(int position);

    // TODO: 7/3/16 implement getDataAt(int position)

    // TODO: 7/2/16 write unitTest
    int getSize();
}
