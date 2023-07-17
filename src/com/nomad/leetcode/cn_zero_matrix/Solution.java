package com.nomad.leetcode.cn_zero_matrix;

class Solution {
    public void setZeroes(int[][] matrix) {
        // loop the matrix , find # row, col is 0 , use two array to mark it
        // re loop the matrix set the row and col 0 if it's marked
        int m = matrix.length;
        int n = matrix[0].length;
        int[] rows = new int[m];
        int[] cols = new int[n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j]==0) {
                    // default is 0 so we set it as 1
                    rows[i] =1;
                    cols[j] =1;

                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (cols[j]==1 || rows[i]==1) {
                    matrix[i][j] =0;
                }
            }
        }

    }
}