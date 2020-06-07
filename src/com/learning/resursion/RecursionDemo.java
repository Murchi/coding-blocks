
package com.learning.resursion;

public class RecursionDemo {
    public static void main(String[] args) {
        System.out.println("Print Increasing");
            PD(5);
        System.out.println("Print Decreasing");
            printIncreasing(5);
        System.out.println("Print Increasing Decreasing");
        printID(5);
    }
    public static void PD(int n) { //doing work when stack is building
        if(n==0){
            return;
        }
        System.out.println(n);
        PD(n-1);
    }
    public static void printIncreasing(int n) {  //doing work when stack is falling
        if(n == 0){
            return ;
        }
        printIncreasing(n-1);
        System.out.println(n);
    }
    public static void printID(int n) {
        if(n == 0)
            return;
        System.out.println(n);
        printID(n-1);
        System.out.println(n);
    }
}
