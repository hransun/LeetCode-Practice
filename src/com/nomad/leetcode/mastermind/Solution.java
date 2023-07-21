package com.nomad.leetcode.mastermind;

class Solution {
    public int[] masterMind(String solution, String guess) {
        // first cal truely correct
        // second cal hype correct
        int hitcount =0;
        int fake = 0;
        boolean[] used = new boolean[4]; // solution already used
        for (int i = 0; i < 4; i++) {
            if (solution.charAt(i) == guess.charAt(i)) {
                hitcount++;
                used[i] = true;
            }
        }
        for (int i = 0; i < 4; i++) { //loop guess
            if (solution.charAt(i)== guess.charAt(i)) continue;
            for (int j = 0; j < 4; j++) { // loop solution
                if (solution.charAt(j) == guess.charAt(i) && !used[j]) {
                    fake++;
                    used[j]=true;
                    break;
                }
            }
        }
        return new int[] {hitcount,fake};

    }
}