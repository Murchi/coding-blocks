package com.learning.Tree;

public class Subsets {

    public static void main(String[] args) {
        int [] arr = new int[]{1,2,3};
        int count =0;
        int temp [] = new int[arr.length];
        printSubsets(arr,count,temp);
    }

    public static void printSubsets(int[] arr, int count, int[] temp) {
        if(count == arr.length){
            printValue(temp);
            return;
        }
        temp[count] = 0;
        printSubsets(arr,count+1,temp);
        temp[count] = arr[count];
        printSubsets(arr,count+1,temp);
    }

    public static void printValue(int[] arr) {
        for(int i =0;i<arr.length;i++) {
            if(arr[i] !=0){
                System.out.print(arr[i]+" ");

            }

        }
        System.out.println();
    }

}
