package q0392;

class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.length() == 0) {
            return true;
        }

        if (s.length() > t.length()) {
            return false;
        }

        int sPointer = 0;
        for (int i = 0; i < t.length(); i++) {
            if (s.charAt(sPointer) == t.charAt(i)) {
                sPointer++;
                if (sPointer == s.length()) {
                    return true;
                }
            }
        }
        return false;
    }
}
