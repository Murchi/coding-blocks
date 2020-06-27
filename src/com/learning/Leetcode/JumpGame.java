/*Given an array of non-negative integers, you are initially positioned at the first index of the array.

Each element in the array represents your maximum jump length at that position.

Determine if you are able to reach the last index.*/

package com.learning.Leetcode;

public class JumpGame {
    public static void main(String[] args) {
        int[] arr = {2,3,1,1,4};
        System.out.println(canLastBeReached(arr));
    }
    public static boolean canLastBeReached(int[] nums) {
        int lastIndexpos = nums.length-1;
        for(int i = nums.length-1;i>=0;i--){
            if(i+nums[i] >= lastIndexpos)
                lastIndexpos=i;
        }
        return lastIndexpos==0;
    }



}
