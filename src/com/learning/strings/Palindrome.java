//Take as input S, a string. Write a function that returns true if the string is a palindrome and false otherwise.
// Print the value returned.


package com.learning.strings;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s  = sc.nextLine();

        StringBuilder sb = new StringBuilder(s);
        StringBuilder sb1 = sb.reverse();
        if(sb.equals(sb1)) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}
