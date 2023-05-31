package com.nomad.leetcode.q1108_Defanging_an_IP_Address;

/**
 *
 * Input:
 * address : string of ip address.
 *
 * Output:
 * string of defanging address
 *
 * Constraints:
 *A defanged IP address replaces every period "." with "[.]".
 *
 * Approach:
 * Brute Force:
 * create a new string , replace . with [.] , loop the original string
 *
 * Optimized:
 *
 * Goal:
 * Find the ip address is valid or not,aka true or false.
 *  test cases
 */
class Solution {
    public String defangIPaddr(String address) {
        char[] input = address.toCharArray();
        int dotCount=0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] =='.')
                dotCount++;
        }
        char[] result = new char[address.length() + dotCount*2];
        int k =0;
        for (int i = 0; i < input.length; i++) {
            if (input[i]!= '.') {
                result[k++] = input[i];
            } else {
                result[k++] = '[';
                result[k++] ='.';
                result[k++] = ']';
            }
        }
        return new String(result);

    }
}

class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test case 1: IP address with one period
        String address1 = "192.168.0.1";
        String expected1 = "192[.]168[.]0[.]1";
        String result1 = solution.defangIPaddr(address1);
        System.out.println(result1.equals(expected1) ? "Test case 1 passed" : "Test case 1 failed");

        // Test case 2: IP address with no periods
        String address2 = "127001";
        String expected2 = "127001";
        String result2 = solution.defangIPaddr(address2);
        System.out.println(result2.equals(expected2) ? "Test case 2 passed" : "Test case 2 failed");

        // Test case 3: IP address with multiple periods
        String address3 = "10.0.123.45";
        String expected3 = "10[.]0[.]123[.]45";
        String result3 = solution.defangIPaddr(address3);
        System.out.println(result3.equals(expected3) ? "Test case 3 passed" : "Test case 3 failed");
    }
}

