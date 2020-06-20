package com.learning.resursion;

import java.util.ArrayList;

public class GetBoardPath {
    public static void main(String[] args) {
        ArrayList<String>res = getBoardPath(0,9);
        System.out.println(res);
    }

    public static ArrayList<String> getBoardPath(int cur , int end) {
        ArrayList<String>mr = new ArrayList<String>();

        if(cur == end) {
            ArrayList<String>ar = new ArrayList<String>();
            ar.add("");
            return ar;
        }

        if(cur > end) {
            ArrayList<String>ar = new ArrayList<String>();
            return ar;
        }

        for(int dice =1;dice<=6;dice++) {
            ArrayList<String>rr = getBoardPath(cur+dice,end);


                for(String r : rr)
                mr.add(dice+r);
            }

        return mr;
    }
}
