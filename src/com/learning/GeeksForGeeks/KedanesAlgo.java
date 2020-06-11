//Largest Sum Contiguous Subarray
package com.learning.GeeksForGeeks;

public class KedanesAlgo {
    public static void main(String[] args) {
        int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        int res = kadanas(arr);
        System.out.println(res);
    }
    public static  int kadanas(int arr[]) {
        int max_so_far =0;
        int max_ending_here =0;

        for(int i =0;i<arr.length;i++) {
            max_ending_here = max_ending_here+arr[i];

            if(max_ending_here < 0)
                max_ending_here =0;

            if(max_ending_here > max_so_far)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }
}
