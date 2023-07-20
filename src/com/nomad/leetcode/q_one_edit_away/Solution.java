package com.nomad.leetcode.q_one_edit_away;

class Solution {
    public boolean oneEditAway(String first, String second) {
        // 0 edit
        // same length
        // diff <=1 length
        int m = first.length();
        int n = second.length();
        if (Math.abs(m-n) >1) {
            return false;
        }
        int diff =0;
        if (m == n) {
            for (int i = 0; i < m; i++) {
                if (first.charAt(i) != second.charAt(i)) {
                    diff++;
                }
            }
            return diff <=1;
        }
        diff =0;
        int i = 0;
        int j =0;
        while (i < m && j < n) {
            if (first.charAt(i) == second.charAt(j)){
                i++;
                j++;
            } else {
                diff++;
                if (m > n) {
                    i++; // delete longer one
                } else {
                    j++;
                }
            }
        }
        return diff <=1;

    }
}
