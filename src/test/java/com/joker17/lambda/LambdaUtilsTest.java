//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.joker17.lambda;

import org.junit.Assert;
import org.junit.Test;

public class LambdaUtilsTest {

    @Test
    public void testSerialize() {
        Assert.assertNull(LambdaUtils.serialize(null));
        Assert.assertNotNull(LambdaUtils.serialize(1));
    }

    @Test
    public void testResolve() {
        SerializedLambda serializedLambda = LambdaUtils.resolve(Model::getId);
        Assert.assertNotNull(serializedLambda);

        //获取实现者的方法名称
        Assert.assertEquals("getId", serializedLambda.getImplMethodName());

        //获取实现的 class 的名称
        Assert.assertEquals(Model.class.getName(), serializedLambda.getImplClassName());
        //获取实现的 class
        Assert.assertEquals(Model.class, serializedLambda.getImplClass());

        //获取接口 class名称
        Assert.assertEquals(LambdaPropertyFunction.class.getName(), serializedLambda.getFunctionalInterfaceClassName());
        //获取接口 class
        Assert.assertEquals(LambdaPropertyFunction.class, serializedLambda.getFunctionalInterfaceClass());

        //获取捕获此lambda的 class
        Assert.assertEquals(LambdaUtilsTest.class.getName(), serializedLambda.getCapturingClassName());
        //获取捕获此lambda的 class名称
        Assert.assertEquals(LambdaUtilsTest.class, serializedLambda.getCapturingClass());

        //instantiatedMethodTypeClass
        Assert.assertEquals(Model.class, serializedLambda.getInstantiatedMethodTypeClass());

        //同SerializedLambda原有方法
        Assert.assertEquals("apply", serializedLambda.getFunctionalInterfaceMethodName());
        Assert.assertNotNull(serializedLambda.getFunctionalInterfaceMethodSignature());
        Assert.assertNotNull(serializedLambda.getImplMethodSignature());
        Assert.assertNotNull(serializedLambda.getInstantiatedMethodType());
        Assert.assertTrue(serializedLambda.getCapturedArgCount() >= 0);
        Assert.assertTrue(serializedLambda.getImplMethodKind() >= 0);

        //toString
        Assert.assertEquals("com.joker17.lambda.LambdaPropertyFunction -> Model::getId", serializedLambda.toString());
    }
}
