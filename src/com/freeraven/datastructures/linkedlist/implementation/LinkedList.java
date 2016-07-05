package com.freeraven.datastructures.linkedlist.implementation;

/**
 * Created by zvlad on 6/29/16.
 */
public interface LinkedList<T> {
    void append(T obj);

    T getData(int position);

    void deleteNodeAt(int position);
    
    int getSize();
}
