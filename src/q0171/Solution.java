package q0171;

class Solution {
    public int titleToNumber(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            sum += ((int) c - 'A' + 1) * Math.pow(26, s.length() - 1 - i);
        }
        return sum;
    }
}
