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
public class GetDataTest {
    private LinkedList<Integer> input;
    private int targetPositionInput;
    private Integer expectedOutput;

    public GetDataTest(LinkedList<Integer> input, int targetPositionInput, Integer expectedOutput) {
        this.input = input;
        this.targetPositionInput = targetPositionInput;
        this.expectedOutput = expectedOutput;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> generateData() {
        return Arrays.asList(new Object[][]{
                {LinkedListWithIntegersFactory.createLinkedList(2, 78, 13, 42),
                 1, 78},
                {LinkedListWithIntegersFactory.createLinkedList(435, 0, 0, 1),
                 0, 435},
                {LinkedListWithIntegersFactory.createLinkedList(435, 0, 0, 1, 32),
                 4, 32}
        });
    }

    @Test
    public void test() throws Exception {
        Integer actualResult = input.getData(this.targetPositionInput);
        assertThat(actualResult, is(this.expectedOutput));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void exceptionTest1() throws Exception {
        Integer actualResult = input.getData(20);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void exceptionTest2() throws Exception {
        Integer actualResult = input.getData(-1);
    }
}