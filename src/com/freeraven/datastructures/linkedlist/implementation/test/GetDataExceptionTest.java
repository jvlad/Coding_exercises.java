package com.freeraven.datastructures.linkedlist.implementation.test;

import com.freeraven.datastructures.linkedlist.implementation.LinkedList;
import com.freeraven.datastructures.linkedlist.implementation.test.infrastructure.ListTypeParameterSupplier;
import com.freeraven.datastructures.linkedlist.implementation.test.infrastructure.TestListConfiguration;
import com.freeraven.datastructures.linkedlist.implementation.test.infrastructure.TestListFactory;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;

import java.util.Arrays;

@RunWith(Theories.class)
public class GetDataExceptionTest {
    @DataPoints
    public static TestListConfiguration[] inputAndExpectedOutput = {
            /* 0 */ new TestListConfiguration<>(Arrays.asList(2, 78, 13, 42), -1, null),
            /* 1 */ new TestListConfiguration<>(Arrays.asList(2, 78, 13, 42), 4, null),
            /* 2 */ new TestListConfiguration<>(Arrays.asList(2, 78, 13, 42), -50, null),
            /* 3 */ new TestListConfiguration<>(Arrays.asList(2, 78, 13, 42), 50, null),
            };

    @Rule
    public final ExpectedException exception = ExpectedException.none();

    @Theory
    public void test(@ListTypeParameterSupplier.ListTypes Class<LinkedList> listType,
                     TestListConfiguration<Integer, Object> testListConfiguration)
            throws Exception {
        LinkedList list = TestListFactory.createLinkedList(listType, testListConfiguration);
        invokeTestLogic(testListConfiguration, list);
    }

    private void invokeTestLogic(TestListConfiguration<Integer, Object> testListConfiguration, LinkedList list) {
        int testElementPosition = testListConfiguration.getTestElementPosition();

        exception.expect(IndexOutOfBoundsException.class);
        list.getData(testElementPosition);
    }

}