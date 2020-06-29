/*
Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0?
Find all unique triplets in the array which gives the sum of zero.
ref : https://leetcode.com/problems/3sum/
 */
package com.learning.Leetcode;

import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        int [] arr = {-1, 0, 1, 2, -1, -4};
        System.out.println(threeSum(arr));
    }
    public static List<List<Integer>> threeSum(int [] arr) {
        Arrays.sort(arr);
        Set<List<Integer>> res = new HashSet<>();
        for(int i=0;i<arr.length-2;i++) {
            int j = i+1;
            int k = arr.length-1;
            while (j<k) {
                int sum = arr[i]+arr[j]+arr[k];
                if(sum == 0){
                    res.add(Arrays.asList(arr[i],arr[j],arr[k]));
                    j++;
                    k--;
                }
                else if(sum < 0){
                    j++;
                }
                else if(sum > 0) {
                    k--;
                }
            }
        }
            return new ArrayList<>(res);
    }
}
