package com.nomad.leetcode.q53_Maximum_Subarray;

class Solution {
    public int maxSubArray(int[] nums) {
        // corner case
        // return value
        // dp template
        if (nums == null || nums.length==0)
            return Integer.MIN_VALUE;
        int cur=0;
        int  result = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length ; i++) {
            cur += nums[i];
            if (cur < nums[i]) {
                cur = nums[i];
            }
            result = Math.max(result,cur);
        }
        return result;
    }
}
