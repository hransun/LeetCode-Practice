package com.nomad.leetcode.q151_reverse_words;

class Solution {
    public String reverseWords(String s) {
        char[] chars = s.toCharArray();
        int n = trim(chars); // n is the length of the trimed string
        // trim space
        // reverse all
        reverse(chars,0,n-1);
        // reverse each word
        int i =0; //left
        int j =0; // right
        while (i < n && j < n) {
            if (chars[j]==' '){ // if space then start reverse
                reverse(chars,i,j-1);// j already space
                i = j+1; //next to space , start of new word
            } else if (j==n-1) { // if last word
                reverse(chars,i,j);
            }
            j++;
        }
        // return result

        return new String(chars,0,n); // return length of valid char array

    }
    private int trim(char[] chars) { // return n = len of trimed char array
        // trim start
        int i = 0;
        while (i < chars.length) {
            if (chars[i]==' ') {
                i++;
            } else {
                break;
            }
        }
        // trim end
        int j =chars.length -1;
        while (j >0) {
            if (chars[j]==' '){
                j--;
            } else {
                break;
            }
        }
        // trim between
        int k =0; // len of trimed string
        while (i <=j) { // i , j included
            if (chars[i] != ' ') {
                chars[k++] = chars[i];
            } else if (chars[i+1]!=' '){// next new word
                chars[k++]=' ';
            }
            i++;
        }
        return k;

    }
    private void reverse(char[] chars,int start, int end) {
        while (start < end) {// start and end included
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;
        }

    }
}
