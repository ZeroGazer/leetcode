package q0482;

import java.util.Locale;

class Solution {
    public String licenseKeyFormatting(String s, int k) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '-') {
                count++;
            }
        }

        int prefixSize = count % k;
        int pointer = 0;
        StringBuilder sb = new StringBuilder();
        while (pointer < s.length() && prefixSize > 0) {
            if (s.charAt(pointer) != '-') {
                sb.append(s.charAt(pointer));
                prefixSize--;
            }
            pointer++;
        }
        if (sb.length() != 0 && pointer < s.length()) {
            sb.append("-");
        }
        int delimiterCount = k;
        while (pointer < s.length()) {
            if (s.charAt(pointer) != '-') {
                if (delimiterCount == 0) {
                    sb.append("-");
                    delimiterCount = k;
                }
                sb.append(s.charAt(pointer));
                delimiterCount--;
            }
            pointer++;
        }
        return sb.toString().toUpperCase();
    }
}
