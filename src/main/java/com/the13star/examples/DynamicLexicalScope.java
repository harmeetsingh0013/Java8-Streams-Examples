package com.the13star.examples;

import java.util.function.Predicate;

/**
 * Created by Harmeet Singh(Taara) on 7/27/2014.
 */
public class DynamicLexicalScope {
    public static boolean dynamicLexicalScope(Predicate<Integer> predicate){
        return predicate.test(11);
    }
    public static void main(String[] args){
        Integer value = 10;
        Predicate<Integer> predicate = (age) -> {
                if(age > value){
                    return true;
                }return false;
        };
        boolean flag = DynamicLexicalScope.dynamicLexicalScope(predicate);
        System.out.println("My Age Is Greater Then 10: "+flag);
    }
}
