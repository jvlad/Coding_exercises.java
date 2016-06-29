package com.freeraven.datastructures.linkedlist.implementation;

/**
 * Created by zvlad on 6/29/16.
 */
public class SinglyLinkedListImpl<T> implements LinkedList<T> {
    private T data;
    private int size;
    LinkedList<T> next;

    public SinglyLinkedListImpl(T data) {
        this.data = data;
        size = 1;
    }

    @Override
    public LinkedList<T> append(T obj) {
        if (next != null) {
            next.append(obj);
        } else {
            next = new SinglyLinkedListImpl<T>(obj);
        }
        size++;
        return this;
    }

    @Override
    public LinkedList<T> getNext() {
        return next;
    }

    public T getData() {
        return data;
    }

    @Override
    public T getData(int position) {
        if (position < 0 || position >= size) {
            throw new IndexOutOfBoundsException();
        }
        LinkedList<T> currentNode = this;
        for (int i = 0; i != position; i++) {
            currentNode = currentNode.getNext();
        }
        return currentNode.getData();
    }

    @Override
    public String toString() {
        return "[" + print() + "]";
    }

    public String print() {
        StringBuilder builder = new StringBuilder();
        builder.append(data);
        if (next != null) {
            builder.append(", ");
            builder.append(next.print());
        }
        return builder.toString();
    }
}
