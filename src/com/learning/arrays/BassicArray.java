package com.learning.arrays;

import java.util.ArrayList;
import java.util.List;

public class BassicArray {

    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);

        myList.stream().forEach(System.out::println);
    }
}
