package com.the13star.examples;

import com.the13star.stream.pojo.User;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Harmeet Singh(Taara) on 6/8/14.
 */
public class StreamCollectors {
    private static List<String> lanugage = Arrays.asList("Java", "C++", "C#", "PHP6.0", "Python3", "RubyOnRails");
    private static List<Integer> numbers = Arrays.asList(3, 65, 54, 32, 11, 90, 332);
    private static List<String> mix = Arrays.asList("One", "1", "Two", "2", "Three", "3");
    private static List<User> users = new ArrayList<>();

    static{
        for (int i=0;i<10;i++){
            User user = new User();
            String age = new Integer((int)(Math.random()*5)).toString();
            user.setAge(age);
            user.setName("User: "+i);
            users.add(user);
        }
    }
    public static void toListTest(){
        List<String> result = lanugage.stream()
                                .map(value -> value.toLowerCase())
                                .collect(Collectors.toList());
        System.out.println(result);
    }

    public static void toSetTest(){
        Set<String> result = lanugage.stream()
                                .map(value -> value.toLowerCase())
                                .collect(Collectors.toSet());
        System.out.println(result);
    }

    public static void toMapTest(){
        Map<Integer, String> result = lanugage.stream()
                                        .map(value -> value.toLowerCase())
                                        .collect(Collectors.toMap(key -> key.length(), value -> value));
        // In the case of toMap() collector, when we add duplicate key, it will thrown an exception
        System.out.println(result);
    }

    public static void maxByTest(){
        Stream<Integer> numbersStream = numbers.stream();
        Function<Integer, Integer> function = value -> value;
        int maxNumber = numbersStream.collect(Collectors.maxBy(Comparator.comparing(function))).get();
        System.out.println("Max Number from Collection: "+maxNumber);
    }

    public static void minByTest(){
        Stream<Integer> numbersStream = numbers.stream();
        Function<Integer, Integer> function = value -> value;
        int minNumber = numbersStream.collect(Collectors.minBy(Comparator.comparing(function))).get();
        System.out.println("Max Number from Collection: "+minNumber);
    }

    public static void averagingIntTest(){
        Stream<Integer> numbersStream = numbers.stream();
        ToIntFunction<Integer> function = value -> value.intValue();
        int average = numbersStream.collect(Collectors.averagingInt(function)).intValue();
        System.out.println("Max Number from Collection: "+average);
    }

    public static void partitionByTest(){
        List<String> mix = Arrays.asList("One", "1", "Two", "2", "Three", "3");

        Predicate<String> predicate = value -> {
          try{
              Integer.parseInt(value);
              return true;
          }  catch (Exception ex){
              return false;
          }
        };
        Map<Boolean, List<String>> partitionValues = mix.stream()
                .collect(Collectors.partitioningBy(predicate));
        System.out.println(partitionValues);
    }

    public static void groupingByTest(){
        Function<User, String> function = value ->value.getAge();
        Map<String, List<User>> usersAgeGroup = users.stream()
                .collect(Collectors.groupingBy(function));

        System.out.println(usersAgeGroup);
    }

    static{
        for (int i=0;i<10;i++){
            User user = new User();
            String age = new Integer((int)(Math.random()*5)).toString();
            user.setAge(age);
            user.setName("User: "+i);
            users.add(user);
        }
    }
    public static void joiningTest(){
        String joiningResult = users.stream()
                .map(user -> user.getName())
                .collect(Collectors.joining(" || "));

        System.out.println(joiningResult);
    }

    public static void main(String[] args){
        StreamCollectors.joiningTest();
    }
}
