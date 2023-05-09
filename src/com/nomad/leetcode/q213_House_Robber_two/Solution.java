package com.nomad.leetcode.q213_House_Robber_two;

class Solution {
    public int rob(int[] nums) {
        // corner case
        // case 1, rob 1, index 0
        // case 2 , not rob 1,  index 0
        // get max
        if (nums==null || nums.length==0)
            return 0;
        if (nums.length==1)
            return nums[0];
        int case1 = robHelper(nums,0,nums.length-2);
        int case2 = robHelper(nums,1,nums.length-1);
        return Math.max(case1,case2);

    }

    private int robHelper(int[] nums, int start, int end) {
        int[] dp = new int[end - start + 2];
        dp[0] = 0;
        dp[1] = nums[start];
        for (int i = 2; i <= end - start + 1; i++) {
            // rob i-1 -> dp[i-2] + nums[start+ i-1]
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[start + i - 1]);
        }
        return dp[end - start + 1];
    }
}