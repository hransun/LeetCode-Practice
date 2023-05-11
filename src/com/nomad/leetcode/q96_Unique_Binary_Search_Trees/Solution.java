package com.nomad.leetcode.q96_Unique_Binary_Search_Trees;

class Solution {
    public int numTrees(int n) {
        // corner case
        // return value
        // dep template
        if (n<=0)
            return 0;
        int[] dp = new int[n+1];
        dp[0] = 1;
        for (int i = 1; i <=n; i++) {
            for (int j = 0; j <i ; j++) {
                // left is less than , right is larget than , root is i
                dp[i] += dp[j] * dp[i-j-1];
            }

        }
        return dp[n];

    }
}
