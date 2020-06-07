package com.learning.resursion;

public class FirstIndexInAnArray {
    public static void main(String[] args) {
        int arr[] = {3,5,6,6,1,3};
        int res = firstIndex(arr,0,6);
        System.out.println(res);
    }

    public  static int firstIndex(int arr[], int i , int data) {
        if(i == arr.length-1)
            return -1;

        if(arr[i] == data)
            return i;
        else {
            int res = firstIndex(arr, i+1, data);
            return res;
        }
    }
}
