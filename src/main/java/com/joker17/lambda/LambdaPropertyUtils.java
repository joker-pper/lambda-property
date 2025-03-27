package com.joker17.lambda;

import java.util.ArrayList;
import java.util.List;

public class LambdaPropertyUtils {

    private LambdaPropertyUtils() {
    }

    /**
     * 获取属性列表
     *
     * @param propertyFunctions
     * @param <T>
     * @return
     */
    @SafeVarargs
    @SuppressWarnings("varargs")
    public static <T> List<String> getPropertyList(LambdaPropertyFunction<T, ?>... propertyFunctions) {
        List<String> propertyList = new ArrayList<>(propertyFunctions.length);
        for (LambdaPropertyFunction<T, ?> propertyFunction : propertyFunctions) {
            propertyList.add(getProperty(propertyFunction));
        }
        return propertyList;
    }

    /**
     * 获取属性数组
     *
     * @param propertyFunctions
     * @param <T>
     * @return
     */
    @SafeVarargs
    @SuppressWarnings("varargs")
    public static <T> String[] getProperties(LambdaPropertyFunction<T, ?>... propertyFunctions) {
        List<String> propertyList = getPropertyList(propertyFunctions);
        return propertyList.toArray(new String[0]);
    }

    /**
     * 获取属性
     *
     * @param propertyFunction
     * @param <T>
     * @return
     */
    public static <T> String getProperty(LambdaPropertyFunction<T, ?> propertyFunction) {
        SerializedLambda serializedLambda = LambdaUtils.resolve(propertyFunction);
        return serializedLambda.methodToProperty(serializedLambda.getImplMethodName());
    }

}
