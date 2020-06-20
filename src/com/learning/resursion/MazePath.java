package com.learning.resursion;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MazePath {
    public static void main(String[] args) {
        System.out.println(findMazePath(0,0,2,2));

    }

    public static ArrayList<String>findMazePath(int cr,int ch , int er, int eh) {

        if(cr == er && ch == eh) {
            ArrayList<String>ar = new ArrayList<String>();
            ar.add("");
            return ar;
        }
        if(cr > er || ch > eh ) {
            ArrayList<String>ar = new ArrayList<String>();
            return ar;
        }

        ArrayList<String>mr = new ArrayList<String>();
        ArrayList<String>rrh = findMazePath(cr+1,ch,er,eh) ;
        for(String rr : rrh) {
            mr.add("H"+rr);
        }
        ArrayList<String>rrv = findMazePath(cr,ch+1,er,eh);
        for (String rv : rrv) {
            mr.add("V"+rv);
        }
        return mr;

    }
}
