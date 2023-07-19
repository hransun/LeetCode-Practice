package com.nomad.leetcode.diving_board;

class Solution {
    public int[] divingBoard(int shorter, int longer, int k) {
        if (k==0) return new int[]{};
        if (shorter==longer) return new int[]{longer*k};
        int[] result =new int[k+1];
        for (int i = 0; i < k+1; i++) {
            result[i] = i*longer + (k-i) * shorter;
        }
        return result;

    }
}
