package com.learning.GeeksForGeeks;

public class EquilibriumIndex {
    public static void main(String[] args) {
        int arr[] = {-7, 1, 5, 2, -4, 3, 0};
        int res = equilibriumIndex(arr);
        System.out.println(res);
    }

    public static int equilibriumIndex(int [] arr) {
        int sum =0;
        int leftSum =0;

        for(int i =0;i<arr.length;i++) {
            sum+=arr[i];
        }

        for (int i =0;i<arr.length;i++) {
            sum = sum-arr[i];

            if(leftSum == sum)
                return i;
            leftSum = leftSum+arr[i];
        }
        return -1;
    }
}
