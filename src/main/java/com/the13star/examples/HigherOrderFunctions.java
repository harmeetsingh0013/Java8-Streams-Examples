package com.the13star.examples;

import java.util.function.Consumer;

/**
 * Created by Harmeet Singh(Taara) on 7/27/2014.
 */
public class HigherOrderFunctions {
    public static void higherOrderFunction(Consumer<String> consumer){
        consumer.accept("Hello Higher Order Functions As A Argument");
    }

    public static void main(String[] args){
        HigherOrderFunctions.higherOrderFunction((var) -> System.out.println(var));
    }
}
