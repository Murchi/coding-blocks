package com.learning.strings;

public class StringComparison {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";
        String s3 = s2;
        String s4 = new String("hello");

        //compare using ==
        System.out.println(s1==s2);
        System.out.println(s2==s3);
        System.out.println(s1==s4);

        //compare using equals
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));
    }
}
