/*
Print all increasing sequences of length k from first n natural numbers
ref : https://www.geeksforgeeks.org/print-increasing-sequences-length-k-first-n-natural-numbers/
 */
package com.learning.resursion;

public class IncreasingSeqOfLenk {
    public static void main(String[] args) {
        int n = 3;
        int r =2;
        int arr[] = new int[n];
        for(int i=1;i<=n;i++) {
            arr[i-1] = i;
        }
        int temp[] = new int[r];
        int index =0;
        int i=0;
        printSeq(arr,temp,r,index,i);
    }

    public static void printSeq(int[] arr, int[] temp, int r, int index, int i) {
        if(index == r) {
            for(int j=0;j<r;j++)
                System.out.print(temp[j]+" ");
            System.out.println();
            return;
        }

        if(i>=arr.length)
            return;

        temp[index] = arr[i];
        printSeq(arr,temp,r,index+1,i+1);
        printSeq(arr,temp,r,index,i+1);
    }
}
