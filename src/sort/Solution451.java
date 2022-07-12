package sort;

import java.util.*;

public class Solution451 {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();//<字符，出现次数>
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0) + 1);
        }
        LinkedList<Map.Entry<Character, Integer>> entries = new LinkedList<>(map.entrySet());
        Collections.sort(entries, new Comparator<Map.Entry<Character, Integer>>() {
            @Override
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                return o2.getValue() - o1.getValue();
            }
        });
        for (Map.Entry<Character, Integer> entry : entries) {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == entry.getKey()){
                    res += entry.getKey();
                }

            }

        }
        return res;

    }
}
