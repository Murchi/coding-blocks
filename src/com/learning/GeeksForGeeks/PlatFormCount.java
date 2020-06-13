//Minimum Number of Platforms Required for a Railway/Bus Station
package com.learning.GeeksForGeeks;

import java.util.Arrays;

public class PlatFormCount {
    public static void main(String[] args) {
        int arr[] = {900, 940, 950, 1100, 1500, 1800};
        int dep[] = {910, 1200, 1120, 1130, 1900, 2000};
        int res = minPlatForm(arr,dep);
        System.out.println(res);
    }
    public static int minPlatForm (int arr[] , int[] dep) {
        Arrays.sort(arr);
        Arrays.sort(dep);

        int i =1 ,j=0;
        int platform_count =1 , maxCount =1;
        while(i < arr.length && j <dep.length) {
            if(arr[i] <= dep[j]) {
                platform_count ++;
                i++;
            }
            else if(arr[i]>dep[j]){
                platform_count --;
                j++;
            }
            if(platform_count > maxCount) {
                maxCount = platform_count;
            }
        }
        return  maxCount;
    }
}
