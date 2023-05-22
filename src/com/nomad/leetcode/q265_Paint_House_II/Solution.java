package com.nomad.leetcode.q265_Paint_House_II;

class Solution {
    public int minCostII(int[][] costs) {
        // corner case
        // dp
        // return
        if (costs == null || costs.length ==0)
            return 0;
        int col = costs[0].length; // k corlor
        int[] last  = new int[col];
        int[] cur = new int[col];
        for (int[] cost : costs) {
            for (int i = 0; i < col; i++) {
                cur[i] = cost[i] + findMin(last,i);
            }
            int[] tmp = cur;
            cur = last;
            last = tmp;
        }
        return findMin(last,col);
    }

    private int findMin(int[] arr, int except) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (i != except) {
                min = Math.min(min,arr[i]);
            }
        }
        return min ==Integer.MAX_VALUE?0: min;
    }
}