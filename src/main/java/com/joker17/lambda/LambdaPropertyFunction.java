package com.joker17.lambda;

import java.io.Serializable;
import java.util.function.Function;

@FunctionalInterface
public interface LambdaPropertyFunction<T, R>  extends Function<T, R>, Serializable {
}
