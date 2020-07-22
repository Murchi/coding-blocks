package com.learning.array;

import java.util.Arrays;

public class ArrayIntersection {

    public static void main(String[] args) {
        int arr1[] = {10,1,4,5,6};
        int arr2[] = {7,2,1,10};
        findIntersection(arr1,arr2,arr1.length,arr2.length);

    }

    public static void findIntersection(int arr1[],int arr2[],int m , int n) {
        if(m > n) {
            int[] temp = arr1;
            arr1 = arr2;
            arr2 = temp;

            int t = m;
            m = n;
            n =t;
        }

        Arrays.sort(arr1);

        for(int i =0;i<n;i++) {
           if( binarySearch(arr1,0,m-1,arr2[i] )!= -1)
               System.out.println(arr2[i]+" ");
        }
    }

    public  static int binarySearch(int[]arr, int low,int high,int x){
        if(high >= low){
            int mid = low+(high-1)/2;
            if(arr[mid] == x)
                return mid;
            if(arr[mid] > x) {
                return binarySearch(arr,low,mid-1,x);
            }
            if(arr[mid] < x){
                return binarySearch(arr,mid+1,high,x);
            }

        }
        return -1;
    }
}
