package q0345;

import java.util.Set;

class Solution {
    public String reverseVowels(String s) {
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u','A','E','I','O','U');

        char[] cs = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            cs[i] = s.charAt(i);
        }

        int l = 0, r = cs.length - 1;
        while (l < r) {
            if (vowels.contains(cs[l]) && vowels.contains(cs[r])) {
                char temp = cs[l];
                cs[l] = cs[r];
                cs[r] = temp;
                l++;
                r--;
            } else {
                if (!vowels.contains(cs[l])) {
                    l++;
                }
                if (!vowels.contains(cs[r])) {
                    r--;
                }
            }
        }

        return new String(cs);
    }
}
