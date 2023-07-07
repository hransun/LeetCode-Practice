package com.nomad.leetcode.q58_length_of_last_word;

class Solution {
    public int lengthOfLastWord(String s) {
        // from back to front scan
        // remove suffix space
        // find last word
        // return len
        int n = s.length();
        int i = n-1;
        while (i >=0 && s.charAt(i)==' ') {
           i--;
        }
        int len=0;
        while (i >=0 && s.charAt(i)!=' ') {
            len++;
            i--;
        }
        return len;

    }
}
