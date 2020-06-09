package com.learning.resursion;

import java.util.ArrayList;

public class FindPermutation {
    public static void main(String[] args) {
        ArrayList<String>res = getPermutation("abc");
        for(int  i =0;i<res.size();i++) {
            System.out.println(res.get(i));
        }

    }
    public static ArrayList<String>getPermutation(String str) {
        if(str.length() == 0){
            ArrayList<String>list = new ArrayList<String>();
            list.add("");
            return list;
        }
        char c = str.charAt(0);
        String ros = str.substring(1);
        ArrayList<String>resArray = new ArrayList<String>();
        ArrayList<String>recArray = getPermutation(ros);
        for(String rrs : recArray) {
            for(int i = 0 ;i<=rrs.length();i++) {
                String res  = rrs.substring(0,i)+c+rrs.substring(i);
                resArray.add(res);
            }
        }
        return resArray;
    }
}
