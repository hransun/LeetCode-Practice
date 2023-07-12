package com.nomad.leetcode.q26_remove_dup;

class Solution {
    public int removeDuplicates(int[] nums) {
        // double pointer,
        // one is loop the array
        // the other one is mark the last index of non-repeat char
        // return index+1 = length
        int k = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[k]) {
                nums[++k] = nums[i];
            }
        }
        return k+1;

    }
}
