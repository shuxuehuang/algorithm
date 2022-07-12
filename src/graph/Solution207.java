package graph;

import sun.rmi.server.InactiveGroupException;

import java.util.ArrayList;
import java.util.List;

public class Solution207 {
    //dfs判断图有没有拓扑排序即判断图中有无环
    List<List<Integer>> edges;
    int[] visited;//每个节点三种状态，未搜索0，搜索中1，已完成2
    boolean valid = true;
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        visited = new int[numCourses];
        edges = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            edges.add(new ArrayList<Integer>());
        }
        //每个节点的邻接节点
        for (int[] info : prerequisites) {
            edges.get(info[1]).add(info[0]);
        }
        for (int i = 0; i < numCourses && valid; i++) {
            if(visited[i] == 0){
                dfs(i);
            }
        }
        return valid;
    }
    public void dfs(int u){
        visited[u] = 1;
        for (int v : edges.get(u)) {
            if (visited[v] == 0){
                dfs(v);
                if (!valid){
                    return;
                }
            }
            if (visited[v] == 1){
                valid = false;
                return;
            }
        }
        visited[u] = 2;

    }
}
