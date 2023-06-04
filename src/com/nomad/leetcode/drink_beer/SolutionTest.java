package com.nomad.leetcode.drink_beer;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void testDrink() {
        Solution solution = new Solution();

        // Test case 1: if you start with 3 beers, you should be able to drink 4 beers in total
        int result = solution.drink(3);
        Assert.assertEquals(4, result);

        // Test case 2: if you start with 7 beers, you should be able to drink 14 beers in total
        result = solution.drink(7);
        Assert.assertEquals(11, result);

//        // Test case 3: if you start with 9 beers, you should be able to drink 18 beers in total
//        result = solution.drink(9);
//        Assert.assertEquals(18, result);

        // Test case 4: if you start with 10 beers, you should be able to drink 21 beers in total
        result = solution.drink(10);
        Assert.assertEquals(17, result);

        // Test case 5: if you start with 0 beers, you should be able to drink 0 beers in total
        result = solution.drink(0);
        Assert.assertEquals(0, result);
    }
}






