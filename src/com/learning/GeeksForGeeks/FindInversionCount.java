//naive approach O(n2)
package com.learning.GeeksForGeeks;

public class FindInversionCount {

    public static void main(String[] args) {
        int arr [] = {2 ,4 ,1, 3 ,5};
        int res = inversionCount(arr);
        System.out.println(res);
    }
    public static int inversionCount(int arr[]) {
        int inversionCount =0;
        for(int i =0;i<arr.length-1;i++) {
            for (int j = i+1;j<arr.length;j++) {
                if(arr[i] > arr[j])
                    inversionCount = inversionCount+1;
            }
        }
        return inversionCount;
    }

}
