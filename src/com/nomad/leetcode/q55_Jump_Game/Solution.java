package com.nomad.leetcode.q55_Jump_Game;

class Solution {
    public boolean canJump(int[] nums) {
        // understand problem
        // identify the input and output
        // examples
        // brute force solution
        // optimize
        // from the back to  front,
        // if from the pos can reach the end , last pos = i
        int lastPos = nums.length-1;
        for (int i = nums.length-1; i >=0 ; i--) {
            if (i + nums[i] >= lastPos) {
                lastPos = i;
            }
        }
        return lastPos == 0;

    }
}