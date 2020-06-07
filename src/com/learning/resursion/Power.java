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
        int pow = x * findPower(x,n-1);
        return pow;
    }
}
