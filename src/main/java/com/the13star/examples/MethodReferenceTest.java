package com.the13star.examples;

import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

/**
 * Created by Harmeet Singh(Taara) on 7/29/2014.
 */
public class MethodReferenceTest {

    public static int stringLength(Function<String,Integer> function, String string){
        return function.apply(string);
    }
    public static void main(String[] args){
        int length = MethodReferenceTest.stringLength(String::length, "Harmeet-Singh");
        System.out.println(length);
    }
}
/*
* Warning: Binary file MethodReferenceTest contains com.the13star.examples.MethodR
eferenceTest
Classfile /D:/java/java8/MethodReferenceTest.class  Last modified Jul 29, 2014; size 1417 bytes
  MD5 checksum 1b6aca3c6e13e733a4a2f65f1b4c9227  Compiled from "MethodReferenceTest.java"
public class com.the13star.examples.MethodReferenceTest  SourceFile: "MethodReferenceTest.java"
  InnerClasses:
       public static final #65= #64 of #70; //Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
  BootstrapMethods:
    0: #30 invokestatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Lj
ava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
      Method arguments:
        #31 (Ljava/lang/Object;)Ljava/lang/Object;
        #32 invokevirtual java/lang/String.length:()I
        #33 (Ljava/lang/String;)Ljava/lang/Integer;
  minor version: 0
  major version: 52
  flags: ACC_PUBLIC, ACC_SUPER
Constant pool:
   #1 = Methodref          #11.#24        //  java/lang/Object."<init>":()V
   #2 = InterfaceMethodref #25.#26        //  java/util/function/Function.apply:
(Ljava/lang/Object;)Ljava/lang/Object;
   #3 = Class              #27            //  java/lang/Integer
   #4 = Methodref          #3.#28         //  java/lang/Integer.intValue:()I
   #5 = InvokeDynamic      #0:#34         //  #0:apply:()Ljava/util/function/Fun
ction;
   #6 = String             #35            //  Harmeet-Singh
   #7 = Methodref          #10.#36        //  com/the13star/examples/MethodRefer
enceTest.stringLength:(Ljava/util/function/Function;Ljava/lang/String;)I
   #8 = Fieldref           #37.#38        //  java/lang/System.out:Ljava/io/Prin
tStream;
   #9 = Methodref          #39.#40        //  java/io/PrintStream.println:(I)V
  #10 = Class              #41            //  com/the13star/examples/MethodRefer
enceTest
  #11 = Class              #42            //  java/lang/Object
  #12 = Utf8               <init>
  #13 = Utf8               ()V
  #14 = Utf8               Code
  #15 = Utf8               LineNumberTable
  #16 = Utf8               stringLength
  #17 = Utf8               (Ljava/util/function/Function;Ljava/lang/String;)I
  #18 = Utf8               Signature
  #19 = Utf8               (Ljava/util/function/Function<Ljava/lang/String;Ljava/lang/Integer;>;Ljava/lang/String;)I
  #20 = Utf8               main
  #21 = Utf8               ([Ljava/lang/String;)V
  #22 = Utf8               SourceFile
  #23 = Utf8               MethodReferenceTest.java
  #24 = NameAndType        #12:#13        //  "<init>":()V
  #25 = Class              #43            //  java/util/function/Function
  #26 = NameAndType        #44:#45        //  apply:(Ljava/lang/Object;)Ljava/la
ng/Object;
  #27 = Utf8               java/lang/Integer
  #28 = NameAndType        #46:#47        //  intValue:()I
  #29 = Utf8               BootstrapMethods
  #30 = MethodHandle       #6:#48         //  invokestatic java/lang/invoke/Lamb
daMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/
MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #31 = MethodType         #45            //  (Ljava/lang/Object;)Ljava/lang/Obj
ect;
  #32 = MethodHandle       #5:#49         //  invokevirtual java/lang/String.len
gth:()I
  #33 = MethodType         #50            //  (Ljava/lang/String;)Ljava/lang/Int
eger;
  #34 = NameAndType        #44:#51        //  apply:()Ljava/util/function/Functi
on;
  #35 = Utf8               Harmeet-Singh
  #36 = NameAndType        #16:#17        //  stringLength:(Ljava/util/function/Function;Ljava/lang/String;)I
  #37 = Class              #52            //  java/lang/System
  #38 = NameAndType        #53:#54        //  out:Ljava/io/PrintStream;
  #39 = Class              #55            //  java/io/PrintStream
  #40 = NameAndType        #56:#57        //  println:(I)V
  #41 = Utf8               com/the13star/examples/MethodReferenceTest
  #42 = Utf8               java/lang/Object
  #43 = Utf8               java/util/function/Function
  #44 = Utf8               apply
  #45 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
  #46 = Utf8               intValue
  #47 = Utf8               ()I
  #48 = Methodref          #58.#59        //  java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lan
g/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;
Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #49 = Methodref          #60.#61        //  java/lang/String.length:()I
  #50 = Utf8               (Ljava/lang/String;)Ljava/lang/Integer;
  #51 = Utf8               ()Ljava/util/function/Function;
  #52 = Utf8               java/lang/System
  #53 = Utf8               out
  #54 = Utf8               Ljava/io/PrintStream;
  #55 = Utf8               java/io/PrintStream
  #56 = Utf8               println
  #57 = Utf8               (I)V
  #58 = Class              #62            //  java/lang/invoke/LambdaMetafactory

  #59 = NameAndType        #63:#67        //  metafactory:(Ljava/lang/invoke/Met
hodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invo
ke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava
/lang/invoke/CallSite;
  #60 = Class              #68            //  java/lang/String
  #61 = NameAndType        #69:#47        //  length:()I
  #62 = Utf8               java/lang/invoke/LambdaMetafactory
  #63 = Utf8               metafactory
  #64 = Class              #71            //  java/lang/invoke/MethodHandles$Loo
kup
  #65 = Utf8               Lookup
  #66 = Utf8               InnerClasses
  #67 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/St
ring;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke
/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #68 = Utf8               java/lang/String
  #69 = Utf8               length
  #70 = Class              #72            //  java/lang/invoke/MethodHandles
  #71 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #72 = Utf8               java/lang/invoke/MethodHandles
{
  public com.the13star.examples.MethodReferenceTest();
    descriptor: ()V
    flags: ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>
":()V
         4: return
      LineNumberTable:
        line 11: 0

  public static int stringLength(java.util.function.Function<java.lang.String, j
ava.lang.Integer>, java.lang.String);
    descriptor: (Ljava/util/function/Function;Ljava/lang/String;)I
    flags: ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokeinterface #2,  2            // InterfaceMethod java/util/funct
ion/Function.apply:(Ljava/lang/Object;)Ljava/lang/Object;
         7: checkcast     #3                  // class java/lang/Integer
        10: invokevirtual #4                  // Method java/lang/Integer.intVal
ue:()I
        13: ireturn
      LineNumberTable:
        line 14: 0
    Signature: #19                          // (Ljava/util/function/Function<Lja
va/lang/String;Ljava/lang/Integer;>;Ljava/lang/String;)I

  public static void main(java.lang.String[]);
    descriptor: ([Ljava/lang/String;)V
    flags: ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=2, args_size=1
         0: invokedynamic #5,  0              // InvokeDynamic #0:apply:()Ljava/util/function/Function;
         5: ldc           #6                  // String Harmeet-Singh
         7: invokestatic  #7                  // Method stringLength:(Ljava/util
/function/Function;Ljava/lang/String;)I
        10: istore_1
        11: getstatic     #8                  // Field java/lang/System.out:Ljav
a/io/PrintStream;
        14: iload_1
        15: invokevirtual #9                  // Method java/io/PrintStream.prin
tln:(I)V
        18: return
      LineNumberTable:
        line 17: 0
        line 18: 11
        line 19: 18
}
* */
