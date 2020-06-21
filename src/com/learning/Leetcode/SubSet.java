package com.learning.Leetcode;

import java.util.ArrayList;
import java.util.List;

public class SubSet {
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        List<List<Integer>>res = new ArrayList<>();
       // List<Integer>subset = new ArrayList<>();
        int count =0;
         getSubset(count, arr,res,new ArrayList<>());
         System.out.println(res);
    }

    public static void getSubset(int count , int[] arr , List<List<Integer>>res,List<Integer>sub) {
        if(count == arr.length) {
            res.add(new ArrayList<>(sub));
            return ;
        }
        sub.add(arr[count]);
        getSubset(count+1,arr,res,sub);
        sub.remove(sub.size()-1);
      //  sub.add(count,arr[count]);
        getSubset(count+1,arr,res,sub);

    }
}
