package com.nomad.leetcode.drink_beer;

/**
 * 三个瓶子换一瓶啤酒， 七个瓶盖也可以换一瓶啤酒
 * 开始有x 啤酒， 问最后可以喝多少瓶啤酒
 */
public class Solution {
    public static void main(String[] args) {
        int x = new Solution().drink(9);
        System.out.println(x);
    }
    public int drink(int x ) {
        // calc bottle first ,  and then calc lid\
        int result =x;
        int bottle = x;
        int lid = x;
        while (bottle >=3 || lid >=7) {
            while (bottle >=3) {
                int change = bottle/3;
                result +=change;
                bottle %= 3;
                bottle += change;
                lid += change;
            }
            while (lid >=7) {
                int change = lid /7;
                bottle += change;
                result +=change;
                lid %= 7;
                lid += change;
            }

        }


        return result;

    }
}


