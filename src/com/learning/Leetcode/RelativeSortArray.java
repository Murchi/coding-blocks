/* Given two arrays arr1 and arr2, the elements of arr2 are distinct, and all elements in arr2 are also in arr1.

Sort the elements of arr1 such that the relative ordering of items in arr1 are the same as in arr2.
Elements that don't appear in arr2 should be placed at the end of arr1 in ascending order. */

package com.learning.Leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class RelativeSortArray {
    public static void main(String[] args) {
        int arr1[] = {2,3,1,3,2,4,6,7,9,2,19};
        int arr2[] = {2,1,4,3,9,6};
        int res[] =doRelativeSort(arr1,arr2);
        for(int  i=0;i<res.length;i++) {
            System.out.print(res[i]+" ");
        }

    }
    public static int[] doRelativeSort(int[] arr1,int[] arr2) {

        List<Integer> res = new ArrayList<Integer>();
        TreeMap<Integer,Integer> map = new TreeMap<Integer,Integer>();

        for(int i =0;i<arr1.length;i++) {
            if(!map.containsKey(arr1[i])) {
                map.put(arr1[i],1);
            }else {
                map.put(arr1[i],map.get(arr1[i])+1);
            }
        }

        for(int i =0;i<arr2.length;i++) {
            while(map.containsKey(arr2[i])) {
                if(map.get(arr2[i]) <=0) {
                    map.remove(arr2[i]);
                }
                else {
                    res.add(arr2[i]);
                    map.put(arr2[i],map.get(arr2[i])-1);
                }
            }
        }

        if(!map.isEmpty()) {
            for(Map.Entry<Integer,Integer>entry : map.entrySet()) {
                for(int i = 0; i < entry.getValue(); i++){
                    res.add(entry.getKey());
                }

            }


        }
        int arr[] = new int[res.size()];
        for(int i =0;i<arr.length;i++) {
            arr[i] = res.get(i);
        }
        return arr;
    }
}
