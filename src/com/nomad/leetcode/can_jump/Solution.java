package com.nomad.leetcode.can_jump;

class Solution {
    public boolean canJump(int[] nums) {
        //steps
        // use a arr to track each position can be reached or not
        // key points
        // diagram
        int n = nums.length;
        int reached_max =0;
        for (int i = 0; i < nums.length; i++) {
            // key point , if cur point is not reachable then false
            if (i > reached_max) return false;
            if (i + nums[i] > reached_max)
                reached_max = i + nums[i];
            if (reached_max >=n-1) return true;
        }
        return false;

    }
}

