package com.learning.resursion;

public class Fibonacci {
    public static void main(String[] args) {
        int res = findNthTermofFibonacci(7);
        System.out.println(res);
    }

    public static int findNthTermofFibonacci(int n) {
        if(n == 0)
            return 0;
        if(n ==1)
            return 1;
        int fib = findNthTermofFibonacci(n-1)+findNthTermofFibonacci(n-2);
        return fib;
    }
}
