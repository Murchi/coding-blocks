package com.learning.resursion;

public class CountWaysToReachNChair {
    public static void main(String[] args) {
        int n = 2;
        System.out.println(findWays(3));
    }

    public static int findWays(int n) {
        if(n==1 || n==0)
            return 1;
        if(n<0)
            return 0;
        return findWays(n-1)+findWays(n-2)+findWays(n-3);
    }
}
