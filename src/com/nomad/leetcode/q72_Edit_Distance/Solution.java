package com.nomad.leetcode.q72_Edit_Distance;

class Solution {
    public int minDistance(String word1, String word2) {
        // DP solution steps template.
        // insert
        // on current location , index , insert a letter
        // delete
        // replace
        // corner case
        // set up cache
        // base case
        // recursion rule
        if (word1==null || word2 == null) // null point
            return 0;
        if (word1.length() ==0 || word2.length() == 0) // 0 length
            return word1.length() ==0? word2.length(): word1.length(); // insert can meet  requirement

        int row = word1.length();
        int col = word2.length();
        int[][] match = new int[row+1][col+1];

        for (int i = 0; i <= word1.length(); i++) {
            match[i][0] = i;
        }

        for (int j = 0; j <= col; j++) { // ==
            match[0][j] = j;
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (word1.charAt(i) == word2.charAt(j)) {
                    // next match represents previous index match
                    match[i+1][j+1] = match[i][j] ;
                } else {
                    // [i][j+1] insert because insert before i ,  i just compare to next j+1
                    // [i][j] after replace = previous match i , j
                    // [i+1][j] delete
                    // dont forgot +1
                    match[i+1][j+1] = Math.min(Math.min(
                            match[i][j+1],match[i+1][j]
                    ),match[i][j])+1;
                }
            }
        }
        return match[row][col];

    }
}