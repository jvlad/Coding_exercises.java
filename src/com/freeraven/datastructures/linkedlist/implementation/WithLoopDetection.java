package com.freeraven.datastructures.linkedlist.implementation;

/**
 * Created by zvlad on 8/7/16.
 */
public class WithLoopDetection extends SinglyLinkedListNode {
    private SinglyLinkedListNode lastRetrievedNode;

    public void setLoop(int sourceNodeIndex, int targetNodeIndex){
        if (!(sourceNodeIndex > targetNodeIndex)){
            throw new IllegalArgumentException();
        }

        SinglyLinkedListNode sourceNode = getNode(sourceNodeIndex);
        SinglyLinkedListNode targetNode = getNode(targetNodeIndex);

        sourceNode.setNext(targetNode);
    }

    private SinglyLinkedListNode getNode(int nodeIndex) {
        // TODO: 8/7/16 implementation
        // TODO: 8/7/16 save retrieved node to lastRetrievedNode
        return null;
    }
}
