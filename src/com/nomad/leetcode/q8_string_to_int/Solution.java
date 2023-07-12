package com.nomad.leetcode.q8_string_to_int;

class Solution {
    public int myAtoi(String s) {
        // convert to char array
        // one pointer loop the char array
        // remove blank space from beginning
        // handle sign bit
        // add to the value
        // handle overflow
        // 整数范围-2147483648~2147483647
        char[] chars = s.toCharArray();
        int n = chars.length;
        int i =0;
        while (i < n && chars[i]==' ') {
            i++;
        }
        if (i==n) return 0;
        int sign = 1;
        if (chars[i] == '+') {
            i++;
        } else if (chars[i] =='-'){
            sign=-1;
            i++;
        }
        int intAbsHigh = 214748364;
        int result =0;
        while (i < n && chars[i] >='0' && chars[i]<='9') {
            int d = chars[i] -'0';
            if (result > intAbsHigh) {
                if (sign==1) {
                    return Integer.MAX_VALUE;
                } else {
                    return Integer.MIN_VALUE;
                }
            } if (result == intAbsHigh) {
                if ((sign==1) && (d >7) ) {
                    return Integer.MAX_VALUE;
                }
                if ((sign==-1) && (d >= 8)) {
                    return Integer.MIN_VALUE;
                }
            }

            result = result * 10 + d;
            i++;


        }
        return result* sign;

    }
}