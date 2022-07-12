import java.util.*;

public class Test {
    public static void main(String[] args) {

    }
    public static String[] words(String src){
        String[] split = src.split(" ");
        //存储结果
        String[] strings = new String[100];
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < split.length; i++) {
            map.put(split[i], map.getOrDefault(split[i],0)+1);
        }
        ArrayList<Map.Entry<String, Integer>> entries = new ArrayList<>(map.entrySet());
        Collections.sort(entries, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getValue() - o2.getValue();
            }
        });

        for (int i = 0; i < 100; i++) {
            strings[i] = entries.get(i).getKey();
        }
        return strings;
    }
}
