package com.learning.dynamicProgramming;

public class WaysToReachNChair {
    public static void main(String[] args) {
        int n =2;
      //  getCount(2);
        System.out.println(getCount(2));
    }

    public static int getCount(int n) {
        int[] count = new int[n+2];
        count[0] =1;
        count[1] =1;
        for(int i =3;i<=n;i++) {
            count[i] = count[i-1]+count[i-2];
        }
        return count[n];
    }

}
