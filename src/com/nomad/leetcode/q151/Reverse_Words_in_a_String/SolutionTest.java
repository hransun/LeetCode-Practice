package com.nomad.leetcode.q151.Reverse_Words_in_a_String;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    public void testReverseWords() {
        Solution solution = new Solution();

        // Test 1
        String input1 = "the sky is blue";
        String expectedOutput1 = "blue is sky the";
        Assertions.assertEquals(expectedOutput1, solution.reverseWords(input1));

        // Test 2
        String input2 = "  hello world!  ";
        String expectedOutput2 = "world! hello";
        Assertions.assertEquals(expectedOutput2, solution.reverseWords(input2));

        // Test 3
        String input3 = "a good   example";
        String expectedOutput3 = "example good a";
        Assertions.assertEquals(expectedOutput3, solution.reverseWords(input3));

        // Test 4
        String input4 = "  Bob    Loves  Alice   ";
        String expectedOutput4 = "Alice Loves Bob";
        Assertions.assertEquals(expectedOutput4, solution.reverseWords(input4));

        // Test 5
        String input5 = "Alice does not even like bob";
        String expectedOutput5 = "bob like even not does Alice";
        Assertions.assertEquals(expectedOutput5, solution.reverseWords(input5));
    }

    @Test
    public void testTrim() {
        Solution solution = new Solution();

        // Test 1
        String input1 = "   hello  world  ";
        char[] str1 = input1.toCharArray();
        int length1 = solution.trim(str1);
        Assertions.assertEquals("hello world", new String(str1, 0, length1));

        // Test 2
        String input2 = "no spaces";
        char[] str2 = input2.toCharArray();
        int length2 = solution.trim(str2);
        Assertions.assertEquals("no spaces", new String(str2, 0, length2));

        // Test 3
        String input3 = "   lots     of   spaces     ";
        char[] str3 = input3.toCharArray();
        int length3 = solution.trim(str3);
        Assertions.assertEquals("lots of spaces", new String(str3, 0, length3));
    }

    @Test
    public void testReverse() {
        Solution solution = new Solution();

        // Test 1
        char[] str1 = "hello".toCharArray();
        solution.reverse(str1, 0, str1.length - 1);
        Assertions.assertEquals("olleh", new String(str1));

        // Test 2
        char[] str2 = "world".toCharArray();
        solution.reverse(str2, 0, str2.length - 1);
        Assertions.assertEquals("dlrow", new String(str2));

        // Test 3
        char[] str3 = "java".toCharArray();
        solution.reverse(str3, 0, str3.length - 1);
        Assertions.assertEquals("avaj", new String(str3));
    }
}


