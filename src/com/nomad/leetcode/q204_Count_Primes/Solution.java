package com.nomad.leetcode.q204_Count_Primes;

class Solution {
    public int countPrimes(int n) {
        // primes less than n
        if (n<=2)
            return 0;
        boolean[] notPrime = new boolean[n];
        int bound = (int) Math.sqrt(n);
        int  count =0;
        for (int i = 2; i < n; i++) {
            // check cache
            if (!notPrime[i]) {
                count++;
                if (i <= bound) {
                    for (int j = i*i;j < n;j = j+ i) { // from i * i to n j = j+ i -> j = i*(i+1)
                        if (!notPrime[j])
                            notPrime[j] = true;
                    }
                }
            }
        }
        return count;


    }
}
