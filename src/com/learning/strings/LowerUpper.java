//Print "lowercase" if user enters a character between 'a-z' ,
// Print "UPPERCASE" is character lies between 'A-Z' and print "Invalid"
// for all other characters like $,.^# etc.
package com.learning.strings;

import java.util.Scanner;

public class LowerUpper {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ip = sc.nextLine();

        if(Character.isLowerCase(ip.charAt(0))) {
            System.out.println("lowercase");
        }
        else if(Character.isUpperCase(ip.charAt(0))) {
            System.out.println("UPPERCASE");
        }
        else
            System.out.println("Invalid");
    }

}
