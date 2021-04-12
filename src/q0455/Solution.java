package q0455;

import java.util.Arrays;

class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int count = 0;
        int gPointer = 0;
        int sPointer = 0;

        while (gPointer < g.length && sPointer < s.length) {
            if (g[gPointer] <= s[sPointer]) {
                count++;
                gPointer++;
            }
            sPointer++;
        }

        return count;
    }
}
