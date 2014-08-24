package com.the13star.examples;

/**
 * Created by Harmeet Singh(Taara) on 7/27/2014.
 */
public class EffectiveFinalVariable {
    public static void main(String[] args){
        Runnable runnable1 = new Runnable(){
            @Override
            public void run() {
                System.out.println("Code Refactoring Using Inner Class");
            }
        };

        Runnable runnable2 = () -> System.out.println("Code Refactoring Using Lambda Expression");
    }
}
