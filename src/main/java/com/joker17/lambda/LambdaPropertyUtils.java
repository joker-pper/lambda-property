package com.joker17.lambda;

import java.util.ArrayList;
import java.util.List;

public class LambdaPropertyUtils {

    public static <T> List<String> getPropertyList(LambdaPropertyFunction<T, ?>... propertyFunctions) {
        List<String> propertyList = new ArrayList<>(16);
        for (LambdaPropertyFunction propertyFunction : propertyFunctions) {
            propertyList.add(getProperty(propertyFunction));
        }
        return propertyList;
    }

    public static <T> String[] getProperties(LambdaPropertyFunction<T, ?>... propertyFunctions) {
        List<String> propertyList = getPropertyList(propertyFunctions);
        return propertyList.toArray(new String[propertyList.size()]);
    }

    public static <T> String getProperty(LambdaPropertyFunction<T, ?> propertyFunction) {
        SerializedLambda serializedLambda = LambdaUtils.resolve(propertyFunction);
        return serializedLambda.methodToProperty(serializedLambda.getImplMethodName());
    }

}
