//Write a program that inserts between each pair of characters the difference between their ascii codes and print the ans.
package com.learning.strings;

import java.util.Scanner;

public class StringDiffInAscii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String res = "";
        StringBuilder sb = new StringBuilder(s);
        StringBuilder sb1 = new StringBuilder(res);
        for (int i =0;i<s.length()-1;i++) {
            int asci1 = (int)sb.charAt(i);
            int asci2 = (int)sb.charAt(i+1);
            int diff = (asci2 - asci1);
            sb1.append(sb.charAt(i));
            sb1.append(diff);
            //sb1.append(sb.charAt(i+1));
        }
        sb1.append(sb.charAt(s.length()-1));
        System.out.println(sb1);
    }
}
