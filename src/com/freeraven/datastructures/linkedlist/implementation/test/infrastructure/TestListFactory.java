package com.freeraven.datastructures.linkedlist.implementation.test.infrastructure;

import com.freeraven.datastructures.linkedlist.implementation.LinkedList;

import java.util.List;

/**
 * Created by zvlad on 7/2/16.
 */
public class TestListFactory {
    public static LinkedList createLinkedList(Class<LinkedList> listType,
                                       TestListConfiguration listConfiguration)
            throws IllegalAccessException, InstantiationException {
        LinkedList listToTest = listType.newInstance();
        List parameters = listConfiguration.getDataItemsToPutInCollection();
        parameters.forEach(listToTest::append);
        return listToTest;
    }
}
