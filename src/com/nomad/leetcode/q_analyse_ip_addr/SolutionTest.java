package com.nomad.leetcode.q_analyse_ip_addr;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void testCheck() {
        Solution solution = new Solution();

        assertTrue(solution.check("123.9.2.0"));
        assertTrue(solution.check(" 223. 33. 13 . 33 "));
        assertFalse(solution.check(" 222. 319. 2. 4"));
        assertFalse(solution.check("2ba. 23. 34.11"));
        assertFalse(solution.check("232.232.11"));
        assertFalse(solution.check("233. .33 .2"));
        assertFalse(solution.check(" "));
        assertFalse(solution.check(null));
    }
}
