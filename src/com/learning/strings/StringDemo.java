package com.learning.strings;

public class StringDemo {
    public static void main(String args[]) {
        String str = "hello";
        System.out.println(str);

        System.out.println(str.charAt(1)); //example for charAt
        System.out.println(str.substring(0,3)); //example of substring
        System.out.println(str.substring(3,3)); //example of substring
        System.out.println(str.substring(1)); //takes string begining from starting index till end

        //string concatenation
        String s = "hello";
        String s1 = "bye";
        String s3 = s+s1;
        System.out.println(s3); //concate using + sign
        String s4 = s.concat(s1);
        System.out.println(s4); //concat using concat method



    }
}
