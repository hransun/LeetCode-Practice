package com.nomad.leetcode.q45_Jump_Game_II;

import java.util.Arrays;

class Solution {
    public int jump(int[] nums) {
        // dp time n**2
        int[] dp = new int[nums.length];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0] =0;
        for (int i = 1; i <nums.length ; i++) {
            for (int j = 0; j < i; j++) {
                if (j + nums[j] >=i) {
                    dp[i] = Math.min(dp[i],dp[j]+1);
                }
            }
        }
        return dp[nums.length-1];

    }

    public int jump2(int[] nums) {
        // gready, time n
        int[] dp = new int[nums.length];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0] =0;
        int curIndex =0;
        for (int i = 1; i < nums.length; i++) {
            for (int j = curIndex; j < i ; j++) {
                if (j + nums[j] >=i) {
                    curIndex = j;
                    dp[i] = dp[j] +1;
                    break;
                }

            }
        }
        return dp[nums.length-1];

    }
}