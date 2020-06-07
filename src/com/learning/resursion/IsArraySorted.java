package com.learning.resursion;

public class IsArraySorted {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        //3,8,6,1,9,7
        boolean res = isArraySorted(arr,0);
        System.out.println(res);
    }

    public static boolean isArraySorted(int arr[],int i) {
        if(arr.length-1 == i){
            return true;
        }

        if(arr[i]>arr[i+1]) {
            return false;
        }
        else {
            boolean restAns = isArraySorted(arr , i+1);
                    return restAns;
        }
        //return false;
    }
}
