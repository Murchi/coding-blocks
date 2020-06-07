package com.learning.strings;

import java.util.Scanner;

public class UltraFastMathematics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        StringBuilder sb = new StringBuilder(s1);
        StringBuilder sb1 = new StringBuilder(s2);

        String s3 = "";
        StringBuilder sb2 = new StringBuilder(s3);

        int i =0,j=0;
        for(int k =0;k<s1.length();k++) {
            if(sb.charAt(i) == sb1.charAt(j)) {
                sb2.append(0);
                i++;
                j++;
            }
            else {
                sb2.append(1);
                i++;
                j++;
            }
        }
        System.out.println(sb2);
    }
}
