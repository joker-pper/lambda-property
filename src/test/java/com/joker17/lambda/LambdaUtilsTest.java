package com.joker17.lambda;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class LambdaUtilsTest {

    @Test
    public void test() {
        assertEquals("id", LambdaPropertyUtils.getProperty(Model::getId));
        assertEquals(Arrays.asList("id", "name"), LambdaPropertyUtils.getPropertyList(Model::getId, Model::getName));
        assertArrayEquals(new String[]{"id", "name"}, LambdaPropertyUtils.getProperties(Model::getId, Model::getName));
    }

    @Test
    public void testOther() {
        assertEquals("checkBool", LambdaPropertyUtils.getProperty(Model::getCheckBool));
        assertEquals("isCheckBool", LambdaPropertyUtils.getProperty(Model::getIsCheckBool));
        assertEquals("check", LambdaPropertyUtils.getProperty(Model::isCheck));
        assertEquals("intVal", LambdaPropertyUtils.getProperty(Model::getIntVal));
    }
}