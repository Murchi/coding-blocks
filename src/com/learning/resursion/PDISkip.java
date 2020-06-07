package com.learning.resursion;

public class PDISkip {
    public static void main(String[] args) {
        pdiSkip(5);
    }
    public static void pdiSkip(int n){
        if(n ==0)
            return;

        if(n %2 != 0){
            System.out.println(n);
        }
        pdiSkip(n-1);

        if(n%2 ==0) {
            System.out.println(n);
        }
    }
}
