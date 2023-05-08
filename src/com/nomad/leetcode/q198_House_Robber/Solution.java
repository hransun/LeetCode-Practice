package com.nomad.leetcode.q198_House_Robber;

class Solution {
    public int rob(int[] nums) {
        // corner case
        // dp
        // return value
        // base case
        // cache
        // recursive rule , loop
        if (nums == null || nums.length==0)
            return 0;
        int[] dp = new int[nums.length+1];
        dp[0] = 0;
        dp[1] = nums[0]; // forgot this
        int n = nums.length;

        for (int i = 2; i <=n ; i++) {
            dp[i] = Math.max(dp[i-1],dp[i-2]+nums[i-1]); // if we calc i , then it from i -1 , i-2
        }
        return dp[n];
    }
}
