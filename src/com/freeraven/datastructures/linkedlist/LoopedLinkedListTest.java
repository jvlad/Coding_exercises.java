package com.freeraven.datastructures.linkedlist;

import com.freeraven.datastructures.linkedlist.commontest.infrastructure.TestListConfiguration;

import com.freeraven.datastructures.linkedlist.commontest.infrastructure.TestListFactory;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

@RunWith(Theories.class)
public class LoopedLinkedListTest {
    @DataPoints
    public static TestListConfiguration[] testListConfigurations = {
            /* 0 */ new TestListConfiguration<>(Arrays.asList(1, 2, 3, 4), null, false),
            /* 1 */ new TestListConfiguration<>(Arrays.asList(1, 2, 3, 4), Arrays.asList(2, 0), true),
            /* 2 */ new TestListConfiguration<>(Arrays.asList(1, 2, 3, 4), Arrays.asList(2, 1), true),
            /* 3 */ new TestListConfiguration<>(Arrays.asList(1, 2, 3, 4), Arrays.asList(3, 1), true),
            /* 4 */ new TestListConfiguration<>(Arrays.asList(1, 2, 3, 4), Arrays.asList(3, 2), true),
            /* 5 */ new TestListConfiguration<>(Arrays.asList(1, 2, 3, 4), Arrays.asList(3, 0), true)
    };

    @Theory
    public void test(TestListConfiguration<Integer, Boolean> testConfiguration) throws Exception {
        Class listType = LoopedLinkedList.class;
        LoopedLinkedList listToTest = (LoopedLinkedList) TestListFactory
                .createLinkedList(listType, testConfiguration);

        ArrayList<Integer> testElementPositionList = testConfiguration.getTestElementPositionList();
        if (testElementPositionList != null) {
            listToTest.setLoop(testElementPositionList.get(0), testElementPositionList.get(1));
        }

        boolean actualResult = listToTest.hasLoop();
        assertThat(actualResult, is(testConfiguration.getExpectedTestOutput()));
    }


}