package com.freeraven.datastructures.linkedlist.implementation.singlylinked.test;

import com.freeraven.datastructures.linkedlist.implementation.LinkedList;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

@RunWith(Parameterized.class)
public class AppendAndToStringTest {
    private LinkedList<Integer> input;
    private String expectedOutput;

    public AppendAndToStringTest(LinkedList<Integer> input, String expectedOutput) {
        this.input = input;
        this.expectedOutput = expectedOutput;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> generateData() {
        return Arrays.asList(new Object[][]{
                {LinkedListWithIntegersFactory.createLinkedList(2, 3, 16), "[2, 3, 16]"},
                {LinkedListWithIntegersFactory.createLinkedList(2, 4, 16), "[2, 4, 16]"},
                {LinkedListWithIntegersFactory.createLinkedList(2, 56, 13), "[2, 56, 13]"},
                });
    }

    @Test
    public void test() throws Exception {
        String actualResult = this.input.toString();
        assertThat(actualResult, is(this.expectedOutput));
    }
}