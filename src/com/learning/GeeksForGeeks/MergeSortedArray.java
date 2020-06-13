package com.learning.GeeksForGeeks;

public class MergeSortedArray {

    public static void main(String[] args) {
            int arr1[] = {1, 3, 4, 5};
            int arr2[] = {2, 4, 6, 8};
            int[]arr3 = mergeSortedArray(arr1,arr2);
            for (int i =0;i<arr3.length;i++) {
                System.out.println(arr3[i]);
            }
    }
    public static int[] mergeSortedArray(int arr1[],int arr2[]) {
        int n1 = arr1.length;
        int n2 = arr2.length;

        int[] arr3= new int[n1+n2];

        int i =0,j=0,k=0;
        while(i<n1 && j<n2) {
            if(arr1[i]<arr2[j]) {
                arr3[k] = arr1[i];
                k++;
                i++;
            }
            else  {
                arr3[k] = arr2[j];
                k++;
                j++;
            }

        }
        while(i < n1) {
            arr3[k] = arr1[i];
            i++;
            k++;
        }
        while (j<n2) {
            arr3[k] = arr2[j];
            k++;
            j++;
        }
        return arr3;
    }
}
