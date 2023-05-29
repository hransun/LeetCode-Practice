package com.nomad.leetcode.q_analyse_ip_addr;

/**
 * Problem: analyse  ip address
 * Input:
 * ip: string of ip address.
 * Output:
 * boolean true if it's valid ip v4. false otherwise
 * Constraints:
 * only includes  space and numbers
 * includes 4 numbers , delimit by . , number between 0 and 255
 * before and after number can have space but not between digit of number
 * Approach:
 * Brute Force:
 * create function to check each part split by dot.
 * Optimized:
 *
 * Goal:
 * Find the ip address is valid or not,aka true or false.
 *  test cases
 *  "123.9.2.0"
 *  " 223. 33. 13 . 33 "
 *  " 222. 319. 2. 4"
 *  "2ba. 23. 34.11"
 *  "232.232.11"
 *  "233. .33 .2"
 *  " " or null
 */
public class Solution {
    public boolean check(String ip) {
        if (ip == null || ip.length()==0)
            return false;
        String[] ipSegments = ip.split("\\.");
        if (ipSegments.length != 4) {
            return  false;
        }
        for (int i = 0; i < 4; i++) {
            boolean valid = checkSegment(ipSegments[i]);
            if (!valid) return false;
        }
        return true;
    }
  // "123" , " 123 ", "  12 3", "268"  , "2db" , "  "
    private boolean  checkSegment(String ipSegment) {
        int n = ipSegment.length();
        // i to loop the string part
        int i = 0;
        // ignore prefix space, charAt to get i position char
        if (i < n && ipSegment.charAt(i)==' ')
            i++;
        // all is spaces, jump of the loop
        if (i==n)
            return false;
        // calc part number
        int digit =0;
        while (i < n && ipSegment.charAt(i)!= ' ') {
            char c = ipSegment.charAt(i);
            if (c <'0' || c >'9')
                return false;
            digit = 10*digit + (c-'0');
            if (digit > 255)
                return false;
            i++;
        }
        // deal with suffix spaces
        while (i < n) {
            char c = ipSegment.charAt(i);
            if (c!= ' ')
                return false;
            i++;
        }
        return true;
    }
}
