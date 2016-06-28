package com.freeraven.datastructures.strings.uniqueness;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assume.assumeTrue;

/**
 * Created by zvlad on 6/29/16.
 */
@RunWith(Parameterized.class)
public class ImplWithHashSetTest {
    private String stringToTest;
    private boolean expectedResult;

    public ImplWithHashSetTest(String stringToTest, boolean expectedResult) {
        this.stringToTest = stringToTest;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> generateData() {
        return Arrays.asList(new Object[][]{
                {"abc", true},
                {"abb", false},
                {"aab", false},
                {"aba", false},
                {"some crazy wd", false}
        });
    }

    @Test
    public void testWhatever() {
        CharactersUniquenessChecker instance = new ImplWithHashSet();
        boolean actualResult = instance.check(this.stringToTest);
        assertThat(actualResult, is(this.expectedResult));
    }

}