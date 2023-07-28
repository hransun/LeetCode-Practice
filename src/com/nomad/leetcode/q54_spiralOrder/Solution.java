package com.nomad.leetcode.q54_spiralOrder;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        // top , bottom , left , right
        // add elements to the list
        // top +1
        // bottom -1
        // right -1
        // left +1
        List<Integer> result = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        int top = 0;
        int bottom = m - 1;
        int left = 0;
        int right = n - 1;
        while (top <= bottom && left <= right) {
            // add top row
            for (int i = left; i <= right; i++) {
                result.add(matrix[top][i]);
            }
            // add right col
            for (int i = top + 1; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }
            // add bottom row
            if (top != bottom) {
                for (int i = right - 1; i >= left; i--) {
                    result.add(matrix[bottom][i]);
                }

            }

            // add left col
            if (left != right) {
                for (int i = bottom - 1; i > top; i--) {
                    result.add(matrix[i][left]);
                }
            }
            top++;
            bottom--;
            left++;
            right--;

        }
        return result;

    }
}