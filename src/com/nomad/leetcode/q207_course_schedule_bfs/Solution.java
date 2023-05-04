package com.nomad.leetcode.q207_course_schedule_bfs;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        if (prerequisites == null || prerequisites.length ==0
                || prerequisites[0] == null || prerequisites[0].length!=2)
            return true;
        // rebuild graph
        List<List<Integer>> neighborList = new ArrayList<>();
        // indegree count
        int[] inCount = new int[numCourses];
        initListsAndInCount(prerequisites,neighborList,numCourses,inCount);
        int[] finished = {0};
        Deque<Integer> queue = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (inCount[i] ==0) {
                queue.offerLast(i);
            }
        }
        bfsHelper(neighborList,inCount,queue,finished);
        return finished[0] == numCourses;
    }

    private void bfsHelper(List<List<Integer>> neighborList,
                           int[] inCount,
                           Deque<Integer> queue,
                           int[] finished) {
        while (!queue.isEmpty()) {
            int cur = queue.pollFirst();
            finished[0]++;
            for (int next:neighborList.get(cur)) {
                if (--inCount[next]==0) {
                    queue.offerLast(next);
                }
            }
        }
    }

    private void initListsAndInCount(int[][] prerequisites,
                                     List<List<Integer>> neighborList,
                                     int numCourses,
                                     int[] inCount) {
        // create adj  lists
        for (int i = 0; i < numCourses; i++) {
            List<Integer> neighbor = new ArrayList<>();
            neighborList.add(neighbor);
        }
        // add data
        for(int[] vector:prerequisites) {
            inCount[vector[0]]++;
            neighborList.get(vector[1]).add(vector[0]);
        }
    }
}