package com.joker17.lambda;

public class Test {

    public static void main(String[] args) {
        System.out.println(LambdaPropertyUtils.getPropertyList(Model::getId, Model::getName));
    }
}
