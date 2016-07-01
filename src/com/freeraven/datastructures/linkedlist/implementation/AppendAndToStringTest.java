package com.freeraven.datastructures.linkedlist.implementation;

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
        SinglyLinkedListImpl<Integer> integerSinglyLinkedList = new SinglyLinkedListImpl<>(2);
        integerSinglyLinkedList.append(56);
        integerSinglyLinkedList.append(13);
        return Arrays.asList(new Object[][]{
                {new SinglyLinkedListImpl<Integer>(2).append(3).append(16), "[2, 3, 16]"},
                {new SinglyLinkedListImpl<Integer>(2).append(4).append(16), "[2, 4, 16]"},
                {integerSinglyLinkedList, "[2, 56, 13]"},
                });
    }

    @Test
    public void test() throws Exception {
        String actualResult = this.input.toString();
        assertThat(actualResult, is(this.expectedOutput));
    }
}