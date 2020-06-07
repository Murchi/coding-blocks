//Print words present in the string, in the order in which it appears in the string.
package com.learning.strings;

import java.util.List;
import java.util.Scanner;

public class ReadWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for (int i =0;i<s.length();i++) {
            int j=0;
            String s1=null;
            if(Character.isUpperCase(s.charAt(i))) {
                j =i+1;
                s1 = Character.toString(s.charAt(i));
                while(!Character.isUpperCase(s.charAt(j))) {
                      s1=s1+s.substring(i+1,j+1);
                    j++;
                }
                System.out.println(s1);

            }
            i=j+1;
        }
    }
}
