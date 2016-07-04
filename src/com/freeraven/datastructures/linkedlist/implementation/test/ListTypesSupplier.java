package com.freeraven.datastructures.linkedlist.implementation.test;

import com.freeraven.datastructures.linkedlist.implementation.singlylinked.SinglyLinkedListNode;
import org.junit.experimental.theories.ParameterSignature;
import org.junit.experimental.theories.ParameterSupplier;
import org.junit.experimental.theories.PotentialAssignment;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by zvlad on 7/4/16.
 */
public class ListTypesSupplier extends ParameterSupplier {
    static List<Class> listImplementationsToTest = Arrays.asList(new Class[]{

            SinglyLinkedListNode.class,

    });

    @Override
    public List getValueSources(ParameterSignature parameterSignature) throws Throwable {
        return ListTypesSupplier.listImplementationsToTest
                .stream()
                .map(listType ->
                             PotentialAssignment.forValue(listType.getSimpleName(), listType))
                .collect(Collectors.toList());
    }
}
