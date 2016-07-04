package com.freeraven.datastructures.linkedlist.implementation.test;

import com.freeraven.datastructures.linkedlist.implementation.LinkedList;
import com.freeraven.datastructures.linkedlist.implementation.test.infrastructure.ListTypeParameterSupplier;
import com.freeraven.datastructures.linkedlist.implementation.test.infrastructure.TestListConfiguration;
import com.freeraven.datastructures.linkedlist.implementation.test.infrastructure.TestListFactory;
import org.junit.experimental.theories.*;
import org.junit.runner.RunWith;

import java.util.Arrays;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

@RunWith(Theories.class)
public class DeleteTest {
    @DataPoints
    public static TestListConfiguration[] inputAndExpectedOutput = {
            new TestListConfiguration<>(Arrays.asList(1, 2, 3, 4), 0, "[2, 3, 4]"),
            new TestListConfiguration<>(Arrays.asList(1, 2, 3, 4), 1, "[1, 3, 4]"),
            new TestListConfiguration<>(Arrays.asList(1, 2, 3, 4), 3, "[1, 2, 3]"),
            };

    @Theory
    public void test(@ListTypeParameterSupplier.ListTypes Class<LinkedList> listType,
                     TestListConfiguration<Integer, String> testListConfiguration)
            throws Exception {
        LinkedList list = TestListFactory.createLinkedList(listType, testListConfiguration);
        int originListSize = list.getSize();
        int targetElementPosition = testListConfiguration.getPositionOfElementToTestChangesOn();
        list.deleteNodeAt(targetElementPosition);
        assertThat(list.toString(), is(testListConfiguration.getExpectedTestOutput()));
        assertThat(list.getSize(), is(originListSize - 1));
    }
}