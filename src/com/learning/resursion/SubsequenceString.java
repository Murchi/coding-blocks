package com.learning.resursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SubsequenceString {
    static List<List<Character>>res = new ArrayList<>();
    public static void main(String[] args) {
        String s = "ab";
        int count =0;
        char temp[] = new char[s.length()];
        findSubsSeq(count, s,temp);
      
        System.out.println(res);
    }

    public static void findSubsSeq(int count , String s, char[]temp) {
        if(count == s.length()) {
            printString(temp);
            return;
        }

        temp[count] = '0';
        findSubsSeq(count+1,s,temp);
        temp[count] = s.charAt(count);
        findSubsSeq(count+1,s,temp);
    }

    public static void printString(char[] temp) {
        List<Character>tem =new ArrayList<>();
        for(int i =0;i<temp.length;i++) {
            if(temp[i]!='0')
            tem.add(temp[i]);
        }
        res.add(tem);
        /*for (int i =0;i<temp.length;i++) {
            if(temp[i] !='0') {
                System.out.print(temp[i]);
            }
        }*/
        //System.out.println();
    }
}
