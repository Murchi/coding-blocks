package com.learning.resursion;

public class Factorial {
    public static void main(String[] args) {
            int res = factorial(4) ;
        System.out.println(res);
    }
    public  static int factorial(int n) {
        int  fact =n;
        if(n == 0 || n==1)
           return 1;
        fact = fact * factorial(n-1);
        return fact;

    }
}
