package com.freeraven.datastructures.linkedlist.implementation;

/**
 * Created by zvlad on 6/29/16.
 */
class SinglyLinkedListImpl<T> implements LinkedList<T> {
    private T data;
    private int size;
    private SinglyLinkedListImpl<T> next;

    SinglyLinkedListImpl(T data) {
        this.data = data;
        next = null;
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

    public T getData() {
        return data;
    }

    @Override
    public T getData(int targetPosition) {
        checkPositionIsValid(targetPosition);
        SinglyLinkedListImpl<T> targetNode = this;
        for (int i = 0; i < targetPosition; i++) {
            targetNode = targetNode.getNext();
        }
        return targetNode.getData();
    }

    @Override
    public void delete(int targetPosition) {
        checkPositionIsValid(targetPosition);
        SinglyLinkedListImpl<T> nodeBeforeTarget = this;
        for (int i = 0; i < (targetPosition - 1); i++) {
            nodeBeforeTarget = nodeBeforeTarget.getNext();
        }
        SinglyLinkedListImpl<T> targetNode = nodeBeforeTarget.getNext();
        SinglyLinkedListImpl<T> nodeAfterTarget = targetNode.getNext();
        if (nodeAfterTarget == null){
            nodeBeforeTarget.setNext(null);
        } else {
            nodeBeforeTarget.setNext(nodeAfterTarget);
        }
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "[" + print() + "]";
    }

    private String print() {
        StringBuilder builder = new StringBuilder();
        builder.append(data);
        if (next != null) {
            builder.append(", ");
            builder.append(next.print());
        }
        return builder.toString();
    }

    private SinglyLinkedListImpl<T> getNext() {
        return next;
    }

    private void setNext(SinglyLinkedListImpl<T> node) {
        next = node;
    }

    private void checkPositionIsValid(int position) {
        if (position < 0 || position >= size) {
            throw new IndexOutOfBoundsException();
        }
    }
}
