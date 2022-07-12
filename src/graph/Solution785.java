package graph;

import sun.dc.pr.PRError;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution785 {
    private static final int UNCOLORED=0;
    private static final int RED=1;
    private static final int GREEN=2;
    private int[] color;
    private boolean valid;
    public boolean isBipartite(int[][] graph) {
        //判断一个图是不是二分图
        int n = graph.length;//v结点数
        valid = true;
        color = new int[n];
        Arrays.fill(color,UNCOLORED);
        for (int i = 0; i < n && valid; i++) {
            if (color[i] == UNCOLORED){
                dfs(i,RED,graph);
            }
        }
        return valid;

    }
    public void dfs(int node, int c, int[][] graph){
        color[node] = c;//给当前结点染色
        int cNei = c == RED ? GREEN : RED;
        for (int neighbor : graph[node]) {//node结点的邻接结点
            if (color[neighbor] == UNCOLORED){
                dfs(neighbor,cNei,graph);
                if(!valid){
                    return;
                }
            } else if(color[neighbor] != cNei){
                valid = false;
                return;
            }

        }


    }
}
