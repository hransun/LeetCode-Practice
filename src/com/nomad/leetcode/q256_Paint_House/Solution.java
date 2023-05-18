package com.nomad.leetcode.q256_Paint_House;

class Solution {
    public int minCost(int[][] costs) {
        // corner
        // dp template
        // return
        if (costs == null || costs.length==0)
            return 0;
        int[] last = new int[3];
        int[] cur = new int[3];
        // induction rule
        for(int[] cost: costs) {
            for (int i = 0; i < 3; i++) {
                cur[i] = cost[i] + Math.min(last[(i+1)%3] , last[(i+2)%3]);
            }
            int[] tmp = cur;
            cur = last ;
            last = tmp;
        }
        return Math.min(last[0], Math.min(last[1],last[2]));

    }
}