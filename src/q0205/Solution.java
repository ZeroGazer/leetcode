package q0205;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> mapst = new HashMap<>();
        Map<Character, Character> mapts = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char cs = s.charAt(i);
            char ct = t.charAt(i);

            if (!mapst.containsKey(cs) && !mapts.containsKey(ct)) {
                mapst.put(cs, ct);
                mapts.put(ct, cs);
            } else if (mapst.containsKey(cs) && mapts.containsKey(ct)) {
                if (mapst.get(cs) != ct || mapts.get(ct) != cs) {
                    return false;
                }
            } else {
                return false;
            }
        }

        return true;
    }
}
