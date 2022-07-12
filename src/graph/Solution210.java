package graph;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Stack;

public class Solution210 {
    List<List<Integer>> edges;//放每个节点得邻接节点
    int[] visited;//三个状态 0未访问，1访问中，2已完成
    Stack<Integer> Order;
    boolean valid = true;
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        //求拓扑排序
        int[] res = new int[numCourses];
        visited = new int[numCourses];
        Order = new Stack<>();
        edges = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            edges.add(new ArrayList<>());
        }
        for (int[] info : prerequisites) {
            edges.get(info[1]).add(info[0]);
        }
        for (int i = 0; i < numCourses && valid; i++) {
            if(visited[i] == 0){
                dfs(i);
            }
        }
        if (!valid){
            int[] result={};
            return  result;
        }else {

            int index = 0;
            while (!Order.empty()){
                res[index] = Order.pop();
                index++;
            }

        }

        return res;
    }
    public void dfs(int u){
        visited[u] = 1;
        for (Integer v : edges.get(u)) {
            if(visited[v] == 0){
                dfs(v);
                if(!valid){
                    return;
                }
            }else if(visited[v] == 1){
                valid = false;
                return;
            }
        }
        visited[u] = 2;
        Order.push(u);

    }
}
