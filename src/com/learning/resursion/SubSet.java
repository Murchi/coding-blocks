package com.learning.resursion;

import java.util.*;
public class SubSet {

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3};
        int counter = 0;
        int[] tmp = new int[arr.length];
        printSuperset(counter, arr, tmp);

    }

    private static void printSuperset(int count, int[] arr, int[]temp) {
        if (count == arr.length) {
            printArraySelect(temp);
            return;
        }
        temp[count] = 0;
        printSuperset(count+1,arr,temp);
        temp[count] = arr[count];
        printSuperset(count+1,arr,temp);


    }

    static void printArraySelect(int [] arr) {
        for(int i =0;i<arr.length;i++) {
            if(arr[i]!=0) {
                System.out.print(arr[i]);
            }
        }
        System.out.println();
    }
}
