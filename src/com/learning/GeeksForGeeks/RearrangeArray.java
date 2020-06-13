package com.learning.GeeksForGeeks;

import java.util.Arrays;

public class RearrangeArray {
    public static void main(String[] args) {
            int[] arr = {1,2,3,4,5,6,7,8,9,10};
            rearrangearray(arr);
    }

    public static void rearrangearray(int arr[]) {
        for(int i=0;i<arr.length;i++) {
            if(i%2 ==0) {
                int temp = arr[arr.length-1];
                for(int j = arr.length-2;j>=i;j--) {
                    arr[j+1]= arr[j];
                }
                arr[i] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
