package com.nomad.leetcode.q277_find_the_celebrity;

/* The knows API is defined in the parent class Relation.
      boolean knows(int a, int b); */

public class Solution extends Relation {
    public int findCelebrity(int n) {
        int candidate = 0; //0 - n-1
        // step 1 , test candidate
        for (int i = 1; i < n; i++) {
            if (knows(candidate,i)) {
                candidate = i;
            }
        }
        for (int i =0;i < n;i++) {
            if (knows(candidate,i)) {
                if (i == candidate) {
                    continue;
                }
                return -1;
            }
            if (!knows(i,candidate)) {
                return -1;
            }
        }
        return candidate;
    }
}