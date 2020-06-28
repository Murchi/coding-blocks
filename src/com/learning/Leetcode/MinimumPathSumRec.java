/*
Given a m x n grid filled with non-negative numbers, find a path from top left to bottom right which minimizes the sum of all numbers along its path.

Note: You can only move either down or right at any point in time.

https://leetcode.com/problems/minimum-path-sum/
 */
package com.learning.Leetcode;

public class MinimumPathSumRec {
    public static void main(String[] args) {
        int[][]grid ={{1,3,1},{1,5,1},{4,2,1}};
        int lStart =0;
        int hStart=0;
        int lEnd = grid.length;
        int hEnd = grid[0].length;
        System.out.println(findMinPathRec(grid,lStart,hStart,lEnd-1,hEnd-1));
    }

    public static int findMinPathRec(int[][]grid, int lStart,int hStart,int lEnd,int hEnd) {
        if(lStart == lEnd && hStart==hEnd )
            return grid[lEnd][hEnd];

        int ans=0;
        int right = (int)1e8;
        int left = (int)1e8;
        if(lStart+1<=lEnd)
        right = findMinPathRec(grid,lStart+1,hStart,lEnd,hEnd);

        if(hStart+1<=hEnd)
            left = findMinPathRec(grid,lStart,hStart+1,lEnd,hEnd);

        ans = Math.min(left,right)+grid[lStart][hStart];
        return ans;
    }

}
