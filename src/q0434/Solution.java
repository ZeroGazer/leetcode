package q0434;

class Solution {
    public int countSegments(String s) {
        s = s.trim();

        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if ((i == 0 || s.charAt(i - 1) == ' ') && s.charAt(i) != ' ') {
                sum++;
            }
        }

        return sum;
    }
}
