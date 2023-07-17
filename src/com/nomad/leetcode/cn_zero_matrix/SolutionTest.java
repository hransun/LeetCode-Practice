package com.nomad.leetcode.cn_zero_matrix;
import org.junit.Test;
import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void testSetZeroes1() {
        Solution solution = new Solution();
        int[][] matrix = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        solution.setZeroes(matrix);
        int[][] expected = {{1, 0, 1}, {0, 0, 0}, {1, 0, 1}};
        assertArrayEquals(expected, matrix);
    }

    @Test
    public void testSetZeroes2() {
        Solution solution = new Solution();
        int[][] matrix = {{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};
        solution.setZeroes(matrix);
        int[][] expected = {{0, 0, 0, 0}, {0, 4, 5, 0}, {0, 3, 1, 0}};
        assertArrayEquals(expected, matrix);
    }

    @Test
    public void testSetZeroes3() {
        Solution solution = new Solution();
        int[][] matrix = {{1, 2, 3, 4}, {5, 0, 7, 8}, {0, 10, 11, 12}, {13, 14, 15, 16}};
        solution.setZeroes(matrix);
        int[][] expected = {{0, 0, 3, 4}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 15, 16}};
        assertArrayEquals(expected, matrix);
    }

    @Test
    public void testSetZeroes4() {
        Solution solution = new Solution();
        int[][] matrix = {{1}};
        solution.setZeroes(matrix);
        int[][] expected = {{1}};
        assertArrayEquals(expected, matrix);
    }
}
