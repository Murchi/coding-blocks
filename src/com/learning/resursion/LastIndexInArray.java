package com.learning.resursion;

public class LastIndexInArray {
    public static void main(String[] args) {
        int[] arr = {3,8,1,8,8,7};
        int res = lastIndex(arr,0,8);
        System.out.println(res);
    }

    public static int lastIndex(int arr[], int i ,int data) {
        if(arr.length == i)
            return -1;
        int index = lastIndex(arr,i+1,data);
        if(index == -1) {
            if(arr[i] == data)
                return i;
            else
                return -1;
        }
        else {
            return index;
        }
    }
}
