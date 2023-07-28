package com.nomad.leetcode.q_240_searchMatrix;


class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // from the top right
        // equals target , return
        // less than target move down
        // larget than target, move left
        int m = matrix.length;
        int n = matrix[0].length;
        // start from i , j
        int i = 0;
        int j = n-1;
        while (i < m && j >=0) {
            if (target == matrix[i][j])
                return true;
            if (target > matrix[i][j]) {
                i++;
            } else {
                j--;
            }
        }
        return false;

    }
}
