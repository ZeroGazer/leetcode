package q0014;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }

        if (strs.length == 1) {
            return strs[0];
        }

        int length = strs[0].length();

        for (int i = 1; i < strs.length; i++) {
            int j = 0;
            while (j < strs[i - 1].length() && j < strs[i].length()) {
                if (strs[i - 1].charAt(j) != strs[i].charAt(j)) {
                    break;
                }
                j++;
            }
            length = Math.min(length, j);
        }

        return strs[0].substring(0, length);
    }
}
