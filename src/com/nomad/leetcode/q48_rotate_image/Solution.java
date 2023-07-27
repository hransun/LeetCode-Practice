package com.nomad.leetcode.q48_rotate_image;

import java.awt.*;
import java.util.concurrent.ForkJoinPool;

class Solution {
    public void rotate(int[][] matrix) {
        // use flip
        // top and bottom flip
        // diagonal flip , left to right
        int n = matrix.length;
        for (int i = 0; i < n/2; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                swap(matrix,i, j,n-i-1,j);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                swap(matrix,i,j,j,i);
            }
        }

    }
    private void swap(int[][] matrix,int i , int j, int p , int q) {
        int  temp = matrix[i][j];
        matrix[i][j] = matrix[p][q];
        matrix[p][q] = temp;
    }

    private void swap4(int[][] matrix,int i1,int j1, int i2, int j2, int i3,int j3, int i4,int j4 ) {
        // 1 ->2
        // 2 -> 3
        // 3 - > 4
        // 4-> 1
        // backwards , from 4 -> 3 > 2 -> 1
        int tmp = matrix[i1][j1];
        matrix[i1][j1] = matrix[i4][j4];
        matrix[i4][j4] = matrix[i3][j3];
        matrix[i3][j3] = matrix[i2][j2];
        matrix[i2][j2] = tmp;
    }
    public void rotate2(int[][] matrix) {
        // peel onion
        // top , right , bottom , left
        // m - 2,  n- 2,  top left ++
        int n = matrix.length;
        int s1_i = 0;
        int s1_j =0;
        while (n > 1) {
            // define other 3 points from s1 , border
            // right
            int s2_i = s1_i;
            int s2_j = s1_j + n-1;
            // bottom right
            int s3_i = s1_i + n-1;
            int s3_j = s1_j + n-1;
            // bottom left
            int s4_i= s1_i + n-1;
            int s4_j = s1_j;
            for (int move = 0; move <=n-2; move++) {
                // p is next point
                int p1_i=s1_i +0;
                int p1_j=s1_j + move;
                int p2_i= s2_i + move;
                int p2_j = s2_j +0;
                int p3_i = s3_i;
                int p3_j = s3_j -move;
                int p4_i = s4_i - move;
                int p4_j = s4_j;
                swap4(matrix,p1_i,p1_j,p2_i,p2_j,p3_i,p3_j,p4_i,p4_j);
            }
            s1_i++;
            s1_j++;
            n-=2;

        }
    }
}