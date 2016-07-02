package com.freeraven.datastructures.linkedlist.implementation.test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zvlad on 7/2/16.
 */
public class TestListConfiguration<TypeOfListItem, TypeOfTestOutput> {
    private List<TypeOfListItem> dataItemsToPutInCollection;
    private TypeOfTestOutput expectedTestOutput;
    private int positionOfElementToTestChangesOn;

    public TestListConfiguration(List<TypeOfListItem> dataItemsToPutInList,
                                 int positionOfElementToPerformTestActionOn,
                                 TypeOfTestOutput expectedOutput) {
        this.dataItemsToPutInCollection = dataItemsToPutInList;
        this.expectedTestOutput = expectedOutput;
        this.positionOfElementToTestChangesOn = positionOfElementToPerformTestActionOn;
    }

    public List<TypeOfListItem> getDataItemsToPutInCollection() {
        return dataItemsToPutInCollection;
    }

    public int getPositionOfElementToTestChangesOn() {
        return positionOfElementToTestChangesOn;
    }

    public TypeOfTestOutput getExpectedTestOutput() {
        return expectedTestOutput;
    }
}
