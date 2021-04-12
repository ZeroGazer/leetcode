package q0461;

class Solution {
    public int hammingDistance(int x, int y) {
        int i = x ^ y;
        return Integer.bitCount(i);
    }
}
