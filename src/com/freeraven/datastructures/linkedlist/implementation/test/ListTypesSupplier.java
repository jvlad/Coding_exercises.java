package com.freeraven.datastructures.linkedlist.implementation.test;

import com.freeraven.datastructures.linkedlist.implementation.singlylinked.SinglyLinkedListNode;
import org.junit.experimental.theories.ParameterSignature;
import org.junit.experimental.theories.ParameterSupplier;
import org.junit.experimental.theories.PotentialAssignment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zvlad on 7/4/16.
 */
public class ListTypesSupplier extends ParameterSupplier {
    @Override
    public List getValueSources(ParameterSignature parameterSignature) throws Throwable {
        List<PotentialAssignment> listTypes = new ArrayList<PotentialAssignment>();
        listTypes.add(PotentialAssignment.forValue("SinglyLinkedListNode", SinglyLinkedListNode.class));
        return listTypes;
    }
}
