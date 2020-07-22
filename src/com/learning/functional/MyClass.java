package com.learning.functional;

public class MyClass {

    static MyInterface impl1 = (a,b) -> b + a.toString();
    static MyInterface impl2 = (t,v) -> t.toString() + v;

    public static void main(String[] args) {
        System.out.println(impl1.printout( 1, "Hello"));
        System.out.println(impl2.printout(2, "Hello"));
    }
}
