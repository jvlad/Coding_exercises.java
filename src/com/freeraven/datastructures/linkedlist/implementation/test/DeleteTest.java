package com.freeraven.datastructures.linkedlist.implementation.test;

import com.freeraven.datastructures.linkedlist.implementation.LinkedList;
import com.freeraven.datastructures.linkedlist.implementation.singlylinked.SinglyLinkedListImpl;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

import java.util.Arrays;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

@RunWith(Theories.class)
public class DeleteTest {

    // TODO: 7/2/16 share listTypes DataPoint among different test classes by extracting it in separate class
    @DataPoints
    public static Class<? extends LinkedList>[] listTypes = new Class[]{SinglyLinkedListImpl.class};

    @DataPoints
    public static TestListConfiguration[] inputAndExpectedOutput = {
            new TestListConfiguration<Integer, String>(Arrays.asList(1, 2, 3, 4), 0, "[2, 3, 4]"),
            new TestListConfiguration<Integer, String>(Arrays.asList(1, 2, 3, 4), 1, "[1, 3, 4]"),
            new TestListConfiguration<Integer, String>(Arrays.asList(1, 2, 3, 4), 3, "[1, 2, 3]"),
            new TestListConfiguration<Integer, String>(Arrays.asList(1, 2, 6, 3, 4), 3, "[1, 2, 6, 4]"),
            new TestListConfiguration<Integer, String>(Arrays.asList(1, 2, 6, 3, 4), 0, "[2, 6, 3, 4]"),
            };

    @Theory
    public void test(Class<LinkedList> listType, TestListConfiguration<Integer, String> testListConfiguration)
            throws Exception {
        LinkedList list = TestListFactory.createLinkedList(listType, testListConfiguration);
        int originListSize = list.getSize();
        int targetElementPosition = testListConfiguration.getPositionOfElementToTestChangesOn();
        LinkedList result = list.deleteNodeAtPosition(targetElementPosition);
        assertThat(result.toString(), is(testListConfiguration.getExpectedTestOutput()));
        assertThat(result.getSize(), is(originListSize - 1));
    }
}