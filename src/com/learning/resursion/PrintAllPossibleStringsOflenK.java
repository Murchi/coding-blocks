package com.learning.resursion;

public class PrintAllPossibleStringsOflenK {
    public static void main(String[] args) {
        char[] arr = {'a','b','c'};
        int r = 2;
        char[] temp = new char[r];
        int index =0;
        int i =0;

        printPossibleString(arr,temp,r,index,i);
    }

    public  static void printPossibleString(char[] arr,char[] temp,int r,int index,int i) {
        if(index == r) {
            //print characters
            for(int j=0;j<r;j++) {
                System.out.print(temp[j]+" ");

            }
            System.out.println();
            return;
        }

        if(i>=arr.length)
            return;

        temp[index] = arr[i];
        printPossibleString(arr,temp,r,index+1,i+1);
        printPossibleString(arr,temp,r,index,i+1);
    }
}
