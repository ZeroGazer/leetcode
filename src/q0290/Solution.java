package q0290;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split("\\s");

        if (words.length != pattern.length()) {
            return false;
        }

        Map<Character, String> map1 = new HashMap<>();
        Map<String, Character> map2 = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String word = words[i];
            if (map1.containsKey(c) && map2.containsKey(word)) {
                if (!map1.get(c).equals(word) || !map2.get(word).equals(c)) {
                    return false;
                }
            } else if (!map1.containsKey(c) && !map2.containsKey(word)) {
                map1.put(c, word);
                map2.put(word, c);
            } else {
                return false;
            }
        }

        return true;
    }
}
