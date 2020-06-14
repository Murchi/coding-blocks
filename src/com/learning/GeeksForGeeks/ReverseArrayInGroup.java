//Reverse array in groups
package com.learning.GeeksForGeeks;

public class ReverseArrayInGroup {
    public static void main(String[] args) {
        int arr[] = {1,2,3,9,5};
        reverseArray(arr , 3);
        for(int i =0;i<arr.length;i++) {
            System.out.println(arr[i]);
        }

    }
    public static void reverseArray(int arr[] , int k) {
        if(k == 0) {
            System.out.println("wrong value for k");
            return;
        }
        for(int i =0;i<arr.length;i++) {
            //System.out.println("Value of i  first"+i);

            reverseHelper(arr , i , i+k-1);
            i=i+k-1;
            //System.out.println("Value of i "+i);
        }
    }

    public static void reverseHelper(int arr[] , int low , int high) {
        if(high >= arr.length) {
            high = arr.length-1;
        }

       // System.out.println("LOW** "+low);
        //System.out.println("HIGH** "+high);
        while(low <= high) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }

}