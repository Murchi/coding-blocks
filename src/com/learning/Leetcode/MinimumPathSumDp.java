/*
Given a m x n grid filled with non-negative numbers, find a path from top left to bottom right which minimizes the sum of all numbers along its path.

Note: You can only move either down or right at any point in time.

https://leetcode.com/problems/minimum-path-sum/
 */
package com.learning.Leetcode;

public class MinimumPathSumDp {
    public static void main(String[] args) {
        int[][]grid ={{1,3,1},{1,5,1},{4,2,1}};
        System.out.println(findMinpathDp(grid));
    }

    public static int findMinpathDp(int[][]grid) {
        int m = grid.length;
        int n = grid[0].length;
        for(int i=1;i<m;i++)
            grid[i][0] +=grid[i-1][0];
        for(int j=1;j<n;j++)
            grid[0][j] +=grid[0][j-1];

        for(int i=1;i<m;i++) {
            for(int j=1;j<n;j++) {
                grid[i][j] = Math.min(grid[i-1][j],grid[i][j-1])+grid[i][j];
            }
        }
        return grid[m-1][n-1];
    }
}
