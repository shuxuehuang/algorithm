package greedy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution763 {
    public List<Integer> partitionLabels(String s) {
        int[] ints = new int[26];
        //记录每一个字母最后出现的位置，即把每个字母出现的下标存下来，覆盖
        for (int i = 0; i < s.length(); i++) {
            ints[s.charAt(i) - 'a'] = i;
        }
        ArrayList<Integer> list = new ArrayList<>();
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            end = Math.max(end, ints[s.charAt(i) - 'a']);
            if (i == end){
                list.add(end - start + 1);
                start = end +1;
            }
        }
        return list;
    }
}
