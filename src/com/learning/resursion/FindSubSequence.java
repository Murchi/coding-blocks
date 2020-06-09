package com.learning.resursion;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class FindSubSequence {

    public static void main(String[] args) {
       ArrayList<String>res =  getSubstring("abc");
       for(int i =0;i<res.size();i++){
           System.out.println(res.get(i));
       }
    }

    public static ArrayList<String>getSubstring(String str) {
        if(str.length() == 0) {
            ArrayList<String>myArrayList = new ArrayList<String>();
            myArrayList.add("");
            return myArrayList;
        }
        char c = str.charAt(0);
        String ros = str.substring(1);
        ArrayList<String>myArrayList = new ArrayList<String>();
        ArrayList<String>recArrayList = getSubstring(ros);
        for(int i =0; i<recArrayList.size();i++) {
            myArrayList.add(recArrayList.get(i));
            myArrayList.add(c+recArrayList.get(i));
        }
        return myArrayList;

    }
}
