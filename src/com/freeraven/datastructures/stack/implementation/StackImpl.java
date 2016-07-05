package com.freeraven.datastructures.stack.implementation;

import java.util.LinkedList;
import java.util.NoSuchElementException;

/**
 * Created by zvlad on 7/5/16.
 */
public class StackImpl<T> implements Stack<T> {
    private LinkedList<T> container;

    StackImpl(){
        container = new LinkedList<>();
    }

    @Override
    public void push(T obj) {
        container.addFirst(obj);
    }

    @Override
    public void pop() {
        if (container.getFirst() == null){
            throw new NoSuchElementException();
        }
        container.remove();
    }

    @Override
    public T pick() {
        return container.getFirst();
    }
}
