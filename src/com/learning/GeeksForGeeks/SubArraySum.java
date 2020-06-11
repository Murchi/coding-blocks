//Given an unsorted array of nonnegative integers, find a continuous subarray which adds to a given number.
/*
Input: arr[] = {1, 4, 20, 3, 10, 5}, sum = 33
Ouptut: Sum found between indexes 2 and 4
Sum of elements between indices
2 and 4 is 20 + 3 + 10 = 33


 */
package com.learning.GeeksForGeeks;

public class SubArraySum {
    public static void main(String[] args) {
        int [] arr = {1, 4, 20, 3, 10, 5};
        subArraySum(arr,33);

    }

    public static int subArraySum(int nums[],int sum) {
        int cur_sum =nums[0] , start =0,i;
        for(i =1;i<nums.length;i++) {
            while(cur_sum >sum && start <i-1) {
                cur_sum = cur_sum-nums[start];
                start++;
            }
            if(cur_sum == sum ) {
                int p = i-1;
                System.out.println("Array is found between "+start+" "+p);
                return 1;
            }
            if(i<nums.length) {
                cur_sum = cur_sum+nums[i];
            }
        }
        System.out.println("No subarray found");
        return 0;
    }
}
