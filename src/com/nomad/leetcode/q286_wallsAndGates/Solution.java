package com.nomad.leetcode.q286_wallsAndGates;

import java.util.Deque;
import java.util.LinkedList;

class Solution {
    public void wallsAndGates(int[][] rooms) {
        if (rooms == null || rooms.length ==0 
        || rooms[0] == null
        || rooms[0].length==0)
            return;
        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms[0].length; j++) {
                if (rooms[i][j] ==0) { // start from gate
                    bfsHelper(rooms,i,j);
            }
        }

    }
}

    private void bfsHelper(int[][] rooms, int i, int j) {
        int row = rooms.length;
        int col = rooms[0].length;
        Deque<int[]> queue = new LinkedList<>();
        queue.offerLast(new int[] {i,j}); // start from gate
        while (!queue.isEmpty()) {
            int[]  cur = queue.pollFirst();
            int x = cur[0];
            int y = cur[1];
            // new point is valid and also new point value less than original value +1
            if (isValid(x+1,y,row,col) && rooms[x+1][y] > rooms[x][y]+1) {
                // down
                rooms[x+1][y] = rooms[x][y] +1;
                queue.offerLast(new int[] {x+1,y});
            }
            if (isValid(x,y+1,row,col) && rooms[x][y+1] > rooms[x][y]+1) {
                // right
                rooms[x][y+1] = rooms[x][y] +1;
                queue.offerLast(new int[] {x,y+1});
            }
            if (isValid(x-1,y,row,col) && rooms[x-1][y] > rooms[x][y]+1) {
                // up
                rooms[x-1][y] = rooms[x][y] +1;
                queue.offerLast(new int[] {x-1,y});
            }
            if (isValid(x,y-1,row,col) && rooms[x][y-1] > rooms[x][y]+1) {
                //left
                rooms[x][y-1] = rooms[x][y] +1;
                queue.offerLast(new int[] {x,y-1});
            }
        }
    }

    private boolean isValid(int x ,int y, int row, int col) {
    return x >=0 && y >=0 && x < row && y <col;
    }
}
