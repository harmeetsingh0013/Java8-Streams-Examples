package com.the13star.examples;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Harmeet Singh(Taara) on 7/29/2014.
 */
public class ExternalIterator {
    public static void main(String[] args){
        List<String> list = Arrays.asList("One", "Two", "Three");
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
