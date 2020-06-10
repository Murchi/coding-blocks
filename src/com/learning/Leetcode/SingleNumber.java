//Given a non-empty array of integers, every element appears twice except for one. Find that single one.
package com.learning.Leetcode;

public class SingleNumber {
    public static void main(String[] args) {
        int arr[] = {4,1,2,2,1};
        int res = singleNumber(arr);
        System.out.println(res);
    }
    public static int singleNumber(int [] arr) {
        int sum =0;
        for(int i=0;i<arr.length;i++) {
            sum = sum^arr[i];
        }
        return sum;
    }
}
