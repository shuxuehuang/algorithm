package sort;

import javafx.scene.web.WebHistory;

import java.util.*;

public class Solution347 {
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,3};
        int[] ints = topKFrequent(arr, 2);
        System.out.println(ints[0]);
    }
    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();//<数字，频率>
        int[] res = new int[k];
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i],0) + 1);
        }
        ArrayList<Map.Entry<Integer, Integer>> entryArrayList = new ArrayList<>(map.entrySet());
        Collections.sort(entryArrayList, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });
        int i = 0;
        for (Map.Entry<Integer, Integer> entry : entryArrayList) {
            if (i < k){
                res[i] = entry.getKey();
                i++;
            }else {
                break;
            }

        }
        return res;


    }
}
