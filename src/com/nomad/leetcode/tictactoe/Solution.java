package com.nomad.leetcode.tictactoe;
//https://leetcode.cn/problems/tic-tac-toe-lcci/

import java.util.concurrent.ForkJoinPool;

class Solution {
    public String tictactoe(String[] board) {
        // convert to char array
        int n = board.length;
        char[][] boards = new char[n][n];
        for (int i = 0; i < n; i++) {
            boards[i] = board[i].toCharArray();
        }
        // win
       boolean win = false;
        // row
        for (int i = 0; i < n; i++) {
            if (boards[i][0]==' ') continue;
            win = true;
            for (int j = 1; j < n; j++) {
                if (boards[i][j] != boards[i][0]) {
                    win = false;
                    break;
                }
            }
            if (win) return ""+ boards[i][0];
        }


        // col
        for (int j =0;j < n;j++) { // loop col
            if (boards[0][j]==' ') continue;
            win = true;
            for (int i = 1; i <n ; i++) { // loop row
                if (boards[i][j]!=boards[0][j]) {
                    win = false;
                    break;
                }
            }
            if (win) return ""+ boards[0][j];
        }
        // diagonal
        // top left -> bottom right
        if (boards[0][0]!=' ') {
            int i =1;
            int j =1;
            win = true;
            while (i < n && j < n) {
                if (boards[i][j] != boards[0][0] ) {
                    win = false;
                    break;
                }
                i++;
                j++;
            }
            if (win) return ""+ boards[0][0];
        }
        // bottom left -> top right
        if (boards[n-1][0]!= ' '){
            win = true;
            int i = n-2;
            int j = 1;
            while ( i >=0 && j < n) {
                if (boards[n-1][0]!= boards[i][j]) {
                    win = false;
                    break;
                }
                i--;
                j++;
            }
            if  (win) return ""+ boards[n-1][0];
        }
        // pending
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (boards[i][j]==' '){
                    return "Pending";
                }
            }
        }
        // draw ?
        return "Draw";

    }
}