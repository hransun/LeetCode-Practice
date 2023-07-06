package com.nomad.leetcode.q125_valid_palindrome;

class Solution {
    public boolean isPalindrome(String s) {
        // convert to a char array
        // loop from start and end
        // if it's number or alphabet continue
        // else compare
        char[] temp = s.toCharArray();
        int i = 0;
        int j = temp.length-1;
        while (i < j) {
            if (!isalphanum(temp[i])) {
                i++;
                continue;
            }
            if(!isalphanum(temp[j])) {
                j--;
                continue;
            }
            if (tolowercase(temp[i]) != tolowercase(temp[j]))
                return false;
            i++;
            j--;
        }
        return true;

    }

    public boolean isalphanum(char c) {
        if (c >='0' && c<='9')
            return true;
        if (c >='a' && c<='z')
            return true;
        if (c>='A' && c<='Z')
            return true;
        return false;
    }

    public char tolowercase(char c) {
        if (c>='a' && c<='z') return c;
        if (c >='0' && c<='9') return c;
        return (char)((int)c - 'A' + 'a');
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        // Test case 1: Normal case, Palindrome
        String s1 = "A man, a plan, a canal: Panama";
        boolean result1 = sol.isPalindrome(s1);
        System.out.println(result1); // Output should be true

        // Test case 2: Normal case, Not a palindrome
        String s2 = "This is not a palindrome";
        boolean result2 = sol.isPalindrome(s2);
        System.out.println(result2); // Output should be false

        // Test case 3: Empty string, should return true as an empty string can be considered a palindrome
        String s3 = "";
        boolean result3 = sol.isPalindrome(s3);
        System.out.println(result3); // Output should be true

        // Test case 4: Single character, should return true as a single character can be considered a palindrome
        String s4 = "a";
        boolean result4 = sol.isPalindrome(s4);
        System.out.println(result4); // Output should be true

        // Test case 5: String with numbers and letters, Palindrome
        String s5 = "A1b2b1A";
        boolean result5 = sol.isPalindrome(s5);
        System.out.println(result5); // Output should be true

        // Test case 6: String with special characters only
        String s6 = "!!!###@@@";
        boolean result6 = sol.isPalindrome(s6);
        System.out.println(result6); // Output should be true

        // Test case 7: String with mixed numbers, letters and special characters, Palindrome
        String s7 = "Madam, I'm Adam";
        boolean result7 = sol.isPalindrome(s7);
        System.out.println(result7); // Output should be true

        // Test case 8: Case sensitive check, Not a palindrome
        String s8 = "AbBbAa";
        boolean result8 = sol.isPalindrome(s8);
        System.out.println(result8); // Output should be false
    }
}