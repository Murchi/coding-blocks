/*
Given an array of integers, print a sum triangle from it such that the first level has all array elements.
From then, at each level number of elements is one less than the previous level
and elements at the level is be the Sum of consecutive two elements in the previous level.
ref : https://www.geeksforgeeks.org/sum-triangle-from-array/
 */
package com.learning.resursion;

import java.util.Arrays;

public class SumTriangleFromArray {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4};
        printTriangle(arr);
    }

    public static void printTriangle(int[]arr) {
        if(arr.length <1)
            return;
        int temp[] = new int[arr.length-1];
        for(int i=0;i<arr.length-1;i++) {
            temp[i] = arr[i]+arr[i+1];
        }
        printTriangle(temp);
        System.out.println(Arrays.toString(arr));
    }

}
