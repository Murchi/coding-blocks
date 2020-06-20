/*Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.

        (i.e.,  [0,1,2,4,5,6,7] might become  [4,5,6,7,0,1,2]).

        Find the minimum element.

        You may assume no duplicate exists in the array */
package com.learning.Leetcode;

public class MinimumInRotatedSortedArray {
    public static void main(String[] args) {
        int[]nums = {4,5,6,7,0,1,2};
        int res = findMinimum(nums);
        System.out.println(res);
    }

    public static int findMinimum(int[]nums) {
        int l = 0;
        int r = nums.length-1;


        while(l<r) {
            int mid  = (l+r)/2;
            if(nums[mid] > nums[nums.length-1]) {
                l = mid+1;
            }
            else {
                r =mid;
            }
        }
        return nums[r];
    }
}
