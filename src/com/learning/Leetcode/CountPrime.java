package com.learning.Leetcode;

public class CountPrime {
    public static void main(String[] args) {
            int n = 10;
        System.out.println(count(n));
    }

    public static int count(int n) {
        boolean[] prime = new boolean[n];
        int count =0;

        for(int i =0;i<n;i++) {
            prime[i] = true;
        }

        for(int i =2;i*i<prime.length;i++) {
            if(prime[i]) {
                for(int j =i;i*j<prime.length;j++) {
                    prime[i*j] = false;
                }
            }
        }

        for(int i =2;i<prime.length;i++) {
            if(prime[i])
                count++;
        }
        return count;
    }
}
