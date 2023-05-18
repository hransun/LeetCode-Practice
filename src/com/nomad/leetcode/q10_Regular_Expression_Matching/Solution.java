package com.nomad.leetcode.q10_Regular_Expression_Matching;

class Solution {
    public boolean isMatch(String s, String p) {
        // corner case
        // helper func and set up cache [][]
        // return value
        if (s == null || p == null)
            return false;
        int[][] match = new int[s.length()+1][p.length()+1];
        helper(s,p,0,0,match);
        return match[s.length()][p.length()] ==1;

    }

    private boolean helper(String s, String p, int i, int j, int[][] match) {
        // base case
        // recursion rule
        // match [i][j] i in s ,  j in p, 1, -1 , 0
        // 1 -> match , -1 -> not match , 0 -> not visited
        if (j == p.length()) {
            match[i][j] = ( i == s.length())?1:-1;
            return match[i][j] == 1;
        }
        if (match[i][j]!=0) {
            return match[i][j] ==1;
        }
        // case 1 : *
        if (j < p.length()-1 && p.charAt(j+1) == '*') {
            // i+1, j -> s go to next,  p not change, as j+1 is *
            // i,  j+2 -> s not change, p  change, jump to next to *
            match[i][j] = (i < s.length() && (s.charAt(i) == p.charAt(j) || p.charAt(j) == '.')
             && helper(s,p,i+1,j,match) || helper(s,p,i,j+2,match)) ? 1:-1;
        } else { // not *
            match[i][j] = (i < s.length() && (s.charAt(i)==p.charAt(j) ||
                    p.charAt(j)=='.') && helper(s,p,i+1,j+1,match)) ? 1:-1;
        }
        return match[i][j]==1;

    }
}
