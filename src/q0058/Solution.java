package q0058;

class Solution {
    public int lengthOfLastWord(String s) {
        boolean isLastNonSpaceCharFound = false;
        int lastNonSpaceCharIndex = s.length() - 1;
        for (int i = s.length() - 1; i > -1; i--) {
            if (s.charAt(i) != ' ') {
                lastNonSpaceCharIndex = i;
                isLastNonSpaceCharFound = true;
                break;
            }
        }

        if (!isLastNonSpaceCharFound) {
            return 0;
        }

        for (int i = lastNonSpaceCharIndex - 1; i > -1; i--) {
            if (s.charAt(i) == ' ') {
                return lastNonSpaceCharIndex - i;
            }
        }
        return lastNonSpaceCharIndex + 1;
    }
}
