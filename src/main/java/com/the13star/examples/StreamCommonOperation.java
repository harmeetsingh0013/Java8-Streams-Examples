package com.the13star.examples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by programmers on 3/8/14.
 */
public class StreamCommonOperation {
    private static List<String> list = Arrays.asList("One", "Two", "Three", "Four", "Five");
    private static List<String> list2 = Arrays.asList("1", "2", "3", "4", "5");

    public static void filterTest(){
        list.stream()
                .filter(value -> {
                    System.out.println("The Value is : "+value);
                    if(value.length()<3){
                        return  false;
                    }return  true;
                });
    }

    public static void mapTest(){
      list.stream()
              .map(value -> {
                  System.out.println("Value Of Element: "+value.length());
                  return value.length();
              })
              .count();
    }

    public static void flatMapTest(){
        List<String> results = Stream.of(list, list2)
                .flatMap(value -> value.stream())
                .map(temp -> "Values: "+temp + "| Length: " + temp.length())
                .collect(Collectors.toList());

        System.out.println(results);
    }

    public static void forEachTest(){
        list.stream()
                .forEach(value -> {
                    System.out.println("To Upper Case Elements: "+value.toUpperCase());
                });
    }

    public static void peekTest(){
        List<String> results = list.stream()
                .peek(value -> value.toUpperCase())
                .collect(Collectors.toList());

        System.out.println(results);
    }

    public static void reducePatternTest(){
        List<String> list = Arrays.asList("Dog", "Monkey", "Three", "Stream", "Accumulator");
        String accumulator = "AccumulatorTest"; //initial value
        for (String value: list){
            if(value.length() < accumulator.length()){
                accumulator = value;
            }
        }
        System.out.println("The Shortest Value: "+accumulator);
    }

    public static void reduceTest(){
        List<String> list = Arrays.asList("Dog", "Monkey", "Three", "Stream", "Accumulator");
        String shortestValue = list.stream()
                .reduce("AccumulatorTest", (accumulator, value) -> {
                    if(value.length() < accumulator.length()){
                        return value;
                    }return accumulator;
                });

        System.out.println("The Shortest Value: "+shortestValue);
    }

    public static void main(String[] args){
        StreamCommonOperation.reduceTest();
    }
}
