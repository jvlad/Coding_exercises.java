package com.freeraven.datastructures.strings.uniqueness;

import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

import static org.junit.Assume.assumeTrue;

/**
 * Created by zvlad on 6/29/16.
 */
@RunWith(Theories.class)
public class ImplWithHashSetTest {
    @DataPoint
    public static String a = "a";

    @DataPoint
    public static String b = "bb";

    @DataPoint
    public static String c = "ccc";

    @Theory
    public void stringTest(String x, String y) {
        assumeTrue(x.length() > 1);
        System.out.println(x + " " + y);
    }}