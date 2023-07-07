package com.nomad.leetcode.offer58_reverse_left_words;


class Solution {
    public String reverseLeftWords(String s, int n) {
        // save left k word
        // move k+1 to the left
        // move k word to the end
        char[] newString = s.toCharArray();
        char[] keep = new char[n];
        for (int i = 0; i < n; i++) {
            keep[i] = newString[i];
        }
        int j =0;
        for (int i = n; i <s.length() ; i++) {
            newString[j++] = newString[i];
        }
        for (int i = 0; i < n; i++) {
            newString[j++] =keep[i];
        }
        return new String(newString);

    }
}

