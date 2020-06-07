//Take as input S, a string. Write a function that returns the character with maximum frequency. Print the value returned.


package com.learning.strings;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MaxFreqCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ip = sc.nextLine();
        Map<Character, Integer> map = new HashMap<Character,Integer>();
        for(int i =0;i<ip.length();i++) {
            if(!map.containsKey(ip.charAt(i))) {
                map.put(ip.charAt(i),1);
            }
            else {
                map.put(ip.charAt(i),map.get(ip.charAt(i))+1);
            }
        }
        int max =0;
        char res = 0;
        for(Map.Entry<Character,Integer>entry : map.entrySet()) {
            int val = entry.getValue();
            if(val >max) {
                max = val;
                res = entry.getKey();
            }
        }
        System.out.println(res);

    }
}
