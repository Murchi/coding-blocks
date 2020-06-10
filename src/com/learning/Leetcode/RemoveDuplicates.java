package com.learning.Leetcode;

public class RemoveDuplicates {

    public static void main(String[] args) {
        int arr[] = {0,0,1,1,2,3,3,4};
        int res = removeDuplicates(arr);
        System.out.println("Total number of duplicates are "+res);
        for(int i =0;i<res;i++) {
            System.out.println(arr[i]);
        }
    }

    public static int removeDuplicates(int[] nums) {
        int index =1;
        for(int i =0 ;i<nums.length-1;i++){
            if(nums[i] != nums[i+1]) {
                nums[index++] = nums[i+1];
            }
        }
        return index;
    }
}
