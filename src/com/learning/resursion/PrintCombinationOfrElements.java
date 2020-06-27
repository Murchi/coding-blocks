/*
Print all possible combinations of r elements in a given array of size n
 */
package com.learning.resursion;

public class PrintCombinationOfrElements {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        int r =3;
        int temp [] = new int[r];
        int index =0;
        int i=0;
        printCombination(arr,temp,r,index,i);
    }
    public static void printCombination(int[]arr,int[]temp,int r, int index, int i) {
        if(index == r) {
            //call print
            for(int j=0;j<r;j++) {
                System.out.print(temp[j]+" ");

            }
            System.out.println();
            return;
        }

        if(i>=arr.length)
            return;

        temp[index] = arr[i];
        printCombination(arr,temp,r,index+1,i+1);
        printCombination(arr,temp,r,index,i+1);
    }
}
