package com.nomad.leetcode.q9_palindrome_number;

class Solution {
    public boolean isPalindrome(int x) {
        // x transfer to array
        //  compare array is palindrome
        if (x < 0) { // x is negative
            return false;
        }
        int[] array = new int[10]; // max integer wont greater than 10 digits
        int i =0;
        while ( x >0) {
            array[i++] = x%10;
            x  = x/10;
        }
        int j =0;
        while ( j < i-1) { // i is array.length
            if (array[i-1]!=array[j])
                return false;
            j++;
            i--;
        }
        return true;

    }
}