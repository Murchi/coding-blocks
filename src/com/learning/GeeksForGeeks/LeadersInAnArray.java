//Write a program to print all the LEADERS in the array.
// An element is leader if it is greater than all the elements to its right side.
// And the rightmost element is always a leader.
// For example int the array {16, 17, 4, 3, 5, 2}, leaders are 17, 5 and 2.
package com.learning.GeeksForGeeks;

public class LeadersInAnArray {
    public static void main(String[] args) {
        int [] arr = {16, 17, 4, 3, 5, 2};
        findLeaders(arr);

    }
    public static void findLeaders(int arr[]) {
        int max =arr[arr.length -1];
        System.out.println(max);

        for(int i =arr.length -2 ;i >=0;i--) {
            if(arr[i] > max) {
                max = arr[i];
                System.out.println(max);
            }
        }
    }
}
