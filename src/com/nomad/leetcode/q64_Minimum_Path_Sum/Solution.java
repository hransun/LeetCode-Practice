package com.nomad.leetcode.q64_Minimum_Path_Sum;

class Solution {
    public int minPathSum(int[][] grid) {
        // corner case
        if (grid== null || grid.length==0)
            return 0;
        // dp template,
        int row = grid.length;
        int col = grid[0].length;
        int[][] dp = new int[row][col];// until i , j include minsum
        dp[0][0] = grid[0][0];

        // init  0 row, 0 col
        for (int i = 1; i <col; i++) {
            dp[0][i] = dp[0][i-1] + grid[0][i];
        }
        for (int i = 1; i <row; i++) {
            dp[i][0] = dp[i-1][0] + grid[i][0];
        }
        for (int i = 1; i <row ; i++) {
            for (int j = 1; j <col; j++) {
                dp[i][j] = grid[i][j] + Math.min(dp[i-1][j],dp[i][j-1]);
            }
        }
        // return result
        return dp[row-1][col-1];

    }

    public int minPathSum2(int[][] grid) {
        // corner case
        if (grid== null || grid.length==0)
            return 0;
        // dp template,
        int row = grid.length;
        int col = grid[0].length;
//        int[][] dp = new int[row][col];// until i , j include minsum
//        dp[0][0] = grid[0][0];
        int[] dp = new int[col];
        dp[0] = grid[0][0];

        // init  0 row, 0 col
//        for (int i = 1; i <col; i++) {
//            dp[0][i] = dp[0][i-1] + grid[0][i];
//        }
//        for (int i = 1; i <row; i++) {
//            dp[i][0] = dp[i-1][0] + grid[i][0];
//        }

        // init first row
                for (int i = 1; i <col; i++) {
            dp[i] = dp[i-1] + grid[0][i];
        }

        for (int i = 1; i <row ; i++) {
           dp[0] +=grid[i][0]; // update first col of each row
            for (int j = 1; j < col; j++) {
                dp[j] = grid[i][j] + Math.min(dp[j],dp[j-1]);
            }
        }
        // return result
        return dp[col-1];

    }
}
