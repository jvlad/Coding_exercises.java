package com.freeraven.datastructures.linkedlist.implementation.test;

import org.junit.experimental.theories.ParametersSuppliedBy;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by zvlad on 7/4/16.
 */
@Retention(RetentionPolicy.RUNTIME)
@ParametersSuppliedBy(ListTypesSupplier.class)
@interface ListTypes {
}
