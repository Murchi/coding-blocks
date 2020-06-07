package com.learning.strings;

import java.util.Scanner;

public class SubsString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        printSubstring(s);
    }

    public static void printSubstring(String s) {
        for(int i =0;i<=s.length()-1;i++) {
            for(int j = i+1;j<=s.length();j++) {
                System.out.println(s.substring(i,j));
            }
        }
    }
}
