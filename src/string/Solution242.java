package string;

import java.util.HashMap;

public class Solution242 {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()){
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map.put(c,map.getOrDefault(c,0) + 1);
        }
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            map.put(c,map.getOrDefault(c,0) - 1);
            if (map.get(c) < 0){
                return false;
            }
        }


        return true;
    }
}
