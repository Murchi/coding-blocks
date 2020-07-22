package com.learning.Leetcode;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;

//class MyConsumer implements Consumer<Integer> {
//
//    @Override
//    public void accept(Integer integer) {
//        System.out.println(integer);
//    }
//}

public class Java8Test {

    static Function<Integer, String> myFunc = i -> i == 1 ? "One" : "Not One";

    public static void main(String[] args) {

        ArrayList<Integer> myList= new ArrayList<>();
        myList.add(1);myList.add(2);myList.add(3);

        myList.forEach(System.out::println);


    }
}
