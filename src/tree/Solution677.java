package tree;

import java.util.HashMap;
import java.util.Map;

class MapSum {
    Map<String,Integer> map;
    public MapSum() {
        map = new HashMap<>();
    }

    public void insert(String key, int val) {
        map.put(key,val);
    }

    public int sum(String prefix) {
        int sum = 0;
        for (String s : map.keySet()) {
            if (s.startsWith(prefix)){
                sum += map.get(s);
            }
        }
        return sum;
    }
}
