package com.learning.strings;

public class FreqOfSubstring {
    public static void main(String[] args) {
        String txt = "ana";
        String pat = "muranachanaana";
        System.out.println(findFreq(txt,pat));
    }
    public static int findFreq(String txt, String pat) {
        int M = txt.length();
        int N = pat.length();
        int res =0;

        for(int i =0;i<=N-M;i++) {
            int j;
            for(j =0;j<M;j++) {
                if(txt.charAt(j) != pat.charAt(i+j))
                    break;
            }
            if(j == M){
                res = res+1;
               // j=0;
            }
        }
        return  res;
    }
}
