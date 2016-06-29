package com.freeraven.datastructures.linkedlist;

/**
 * Created by zvlad on 6/29/16.
 */
public class SinglyLinkedListNode<T> {
    private T data;
    SinglyLinkedListNode<T> next;

    public SinglyLinkedListNode(T data) {
        this.data = data;
    }

    void append(T obj){
        next = new SinglyLinkedListNode<T>(obj);
    }

    public T getData(){
        return data;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("LinkedList: [");
        builder.append(data);
        while (next != null){
            builder.append(", ");
            builder.append(next);
        }
        builder.append("]");
        return builder.toString();
    }
}
