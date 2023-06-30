package com.nomad.leetcode.q151.Reverse_Words_in_a_String;

class Solution {
    public String reverseWords(String s) {
        // convert to char arry
        char[] str = s.toCharArray();
        int n = trim(str); // n is length of whole string

        // trim
        // reverse twice string
        reverse(str,0,n-1);
        int i = 0;
        while (i < n) {
            // second reverse
            int r = i;
            // find word right bound
            while (r < n && str[r]!=' ') {
                r++;
            }
            reverse(str,i,r-1);
            i  = r+1;
        }
        // return result
        char[] result = new char[n];
        for (int j = 0; j < n; j++) {
            result[j] = str[j];
        }
        return new String(result);

    }

    // return str length after trim
    public int trim(char[] str) {
        // remove start space
        // remove space between and only keep one space
        // if not space just add to the array
        int k =0; // result
        int n = str.length;
        int i =0; // index
        while (i < n && str[i] ==' ') {
            i++;
        }
        // process space in the middle and end
        while (i < n) {
            if (str[i]==' ') {
                if ( i+1 < n && str[i+1]!=' ') {
                    // insert space between word
                    str[k++] = ' ';
                }
            } else  {
                str[k] = str[i];
                k++;
            }
            i++;
        }


        return k;

    }
    public void reverse(char[] str,int start,int end) {
        // find mid point
        // left , right switch
        // 0, 1, 2 ,3, left <= mid then need to switch
        // 0 , 1, 2 , left < right ok , left <=right also ok , 1 switch with itself.
        int mid = (start + end )/2;
        for (int i = start; i <= mid; i++) {
            char temp = str[i];
            str[i] = str[end-(i-start)];
            str[end-(i-start)] = temp;
        }

    }
}


