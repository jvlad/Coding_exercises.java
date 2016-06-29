package com.freeraven.datastructures.linkedlist.implementation;

import com.freeraven.datastructures.linkedlist.implementation.LinkedList;
import com.freeraven.datastructures.linkedlist.implementation.SinglyLinkedListImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

@RunWith(Parameterized.class)
public class LinkedListGetDataAtPositinTest {
    private LinkedList<Integer> input;
    private int targetPositionInput;
    private Integer expectedOutput;

    public LinkedListGetDataAtPositinTest(LinkedList<Integer> input, int targetPositionInput, Integer expectedOutput) {
        this.input = input;
        this.targetPositionInput = targetPositionInput;
        this.expectedOutput = expectedOutput;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> generateData() {
        return Arrays.asList(new Object[][]{
                {new SinglyLinkedListImpl<Integer>(2).append(78).append(13).append(42), 2, 13},
                {new SinglyLinkedListImpl<Integer>(0).append(0).append(0).append(1), 3, 1}
        });
    }

    @Test
    public void test() throws Exception {
        Integer actualResult = input.getData(this.targetPositionInput);
                assertThat(actualResult, is(this.expectedOutput));
    }


}