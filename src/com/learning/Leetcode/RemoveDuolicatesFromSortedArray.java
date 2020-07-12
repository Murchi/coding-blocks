/*
Given a sorted array nums, r
emove the duplicates in-place such that duplicates appeared at most twice and return the new length.

Do not allocate extra space for another array,
you must do this by modifying the input array in-place with O(1) extra memory.
 */
package com.learning.Leetcode;

public class RemoveDuolicatesFromSortedArray {
    public static void main(String[] args) {
        int[]nums = {1,1,1,2,2,2,3,3,3};
        int res = removeDuplicates(nums);
        for(int i =0;i<res;i++) {
            System.out.print(nums[i]+" ");
        }
    }
    public static int removeDuplicates(int[] nums) {
        int n = nums.length;
        int j=0;
        if(n == 0 || n ==1 )
            return n;

        for(int i =0;i<n-2;i++) {
            if(nums[i] !=nums[i+2]){
                nums[j++] = nums[i];
            }
        }

        nums[j++] = nums[n-2];
        nums[j++] = nums[n-1];
        return j;
    }
}
