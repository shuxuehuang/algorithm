package greedy;

import java.util.Arrays;
import java.util.Comparator;

public class Solution406 {
    public static void main(String[] args) {
        int[][] people = {{7,0},{4,4},{7,1},{5,0},{6,1},{5,2}};
        reconstructQueue(people);
    }
    public static int[][] reconstructQueue(int[][] people) {
        int length = people.length;
        int[] temp = new int[2];
        Arrays.sort(people, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o2[0] - o1[0];
            }
        });
        for (int i = 0; i < length; i++) {
            int flag = people[i][1];
            if (i > flag){
                temp = people[i];
                for (int j = i-1; j >= flag; j--) {
                    people[j + 1] = people[j];//后移
                }
                people[flag] = temp;
            }else if (i < flag){
                temp = people[i];
                for (int j = flag; j > i ; j--) {
                    people[j-1] = people[j];//前移
                }
            }
        }
    return people;
    }
}
