package com.learning.resursion;

public class Power {
    public static void main(String[] args) {
        int res =findPower(2,10);
        System.out.println(res);
    }

    public static int findPower(int x ,int n) {
        if(n == 0 ){
            return 1;
        }
        if(n%2 == 0) {
            int y = findPower(x,n/2);
            return y*y;
        }
        else {
            return x*findPower(x,n-1);
        }

    }
}

