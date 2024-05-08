package com.joker17.lambda;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class LambdaPropertyUtilsTest {

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
        assertEquals("integer", LambdaPropertyUtils.getProperty(Model::getInteger));
        assertEquals("n", LambdaPropertyUtils.getProperty(Model::getN));

        assertEquals("an", LambdaPropertyUtils.getProperty(Model::getAn));

        assertEquals("abNNs", LambdaPropertyUtils.getProperty(Model::getAbNNs));

        //中文
        assertEquals("中文字符名", LambdaPropertyUtils.getProperty(Model::get中文字符名));

/*

        assertEquals("bN", LambdaPropertyUtils.getProperty(Model::getBN));
        assertEquals("bNs", LambdaPropertyUtils.getProperty(Model::getBNs));
        assertEquals("cN", LambdaPropertyUtils.getProperty(Model::getCN));
*/
        //若字段名第二个字母为大写，则不再将第一个字母转换为小写 （正确示例）

        assertEquals("CN", LambdaPropertyUtils.getProperty(Model::getCN));

        //若字段名第二个字母为大写，则不再将第一个字母转换为小写 （错误示例）字段名: bN bNs
        assertEquals("BN", LambdaPropertyUtils.getProperty(Model::getBN));
        assertEquals("BNs", LambdaPropertyUtils.getProperty(Model::getBNs));

        //第二个字母为大写时，首字母应为大写 （特殊示例，自定义getter方法可推断一致）
        assertEquals("bNFromCustomGetter", LambdaPropertyUtils.getProperty(Model::getbNFromCustomGetter));

    }
}