package com.learning.interview;

public class MinInArray {
    public static void main(String[] args) {
        int [] arr = {2,5,0,9,6,1};
        System.out.println(findMin(arr));
    }

    public static int findMin(int[] arr) {

        int min =0;
        int min2 =0;
        if(arr[0]  < arr[1]) {
            min = arr[0];
            min2 = arr[1];
        }
        else {
            min2 = arr[0];
            min = arr[1];
        }
        for(int i =2;i<arr.length;i++) {
            if(arr[i] < min && arr[i] < min2) {
                min2 = min;
                min = arr[i];

            }
            else if(arr[i]> min && arr[i] < min2) {
                min2 = arr[i];
            }

        }
        return min2;
    }
}
