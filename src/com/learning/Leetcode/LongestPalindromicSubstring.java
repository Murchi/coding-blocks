/*
Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.
ref : https://leetcode.com/problems/longest-palindromic-substring/
 */


package com.learning.Leetcode;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
            String str = "abacabacabb";
        System.out.println(longestPalindrome(str));
    }

    public static String longestPalindrome(String str) {
        int low;
        int high;

        int start = 0;
        int len = str.length();
        int maxLength=1;
        if(len ==1 || len ==0)
            return str;

        if(len%2 ==0){
            for(int i =1;i<str.length();i++) {
                low = i-1;
                high = i;

                while (low>=0 && high <len && str.charAt(low) == str.charAt(high)) {
                    if(high-low+1 > maxLength) {
                        start = low;
                        maxLength = high-low+1;

                    }
                    low--;
                    high++;
                }
            }
        }

        else {
            for(int i =1;i<str.length();i++) {
                low = i-1;
                high = i+1;

                while (low>=0 && high <len && str.charAt(low) == str.charAt(high)) {
                    if(high-low+1 > maxLength) {
                        start = low;
                        maxLength = high-low+1;

                    }
                    low--;
                    high++;
                }
            }
        }

        return str.substring(start,start+maxLength);
    }
}
