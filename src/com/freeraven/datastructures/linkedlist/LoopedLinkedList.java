package com.freeraven.datastructures.linkedlist;

import com.freeraven.datastructures.linkedlist.SinglyLinkedListNode;

/**
 * Created by zvlad on 8/7/16.
 */
public class LoopedLinkedList<T> extends SinglyLinkedListNode<T> {

    @Override
    public void setLoop(int sourceNodeIndex, int targetNodeIndex) {
        super.setLoop(sourceNodeIndex, targetNodeIndex);
    }

    public boolean hasLoop(){
        return hasLoopUsingTraversing();
    }

    private boolean hasLoopUsingTraversing(){
        SinglyLinkedListNode<T> tail = super.getTail();
        if (getNodeAtPosition(super.getSize() - 1) == tail
                && tail.getNext() == null){
            return false;
        }
        return true;
    }

//    public boolean hasLoopUsingRunners(){
//
//    }
}
