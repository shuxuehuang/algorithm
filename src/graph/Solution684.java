package graph;

public class Solution684 {
    public int[] findRedundantConnection(int[][] edges) {
        //并查集判断找出途中构成回路的边
        int n = edges.length;
        int[] parent = new int[n+1];
        //init
        for (int i = 1; i < n; i++) {
            parent[i] = i;
        }
        for (int i = 0; i < n; i++) {
            int[] edge = edges[i];
            int node1 = edge[0], node2 = edge[1];
            if (find(parent,node1) != find(parent,node2)){
                union(parent,node1,node2);
            } else {
                return edge;
            }
        }
        return new int[0];

    }
    public void union(int[] parent,int index1,int index2){
        parent[find(parent,index1)] = find(parent,index2);
    }
    public int find(int[] parent,int index){
        if (parent[index] != index){
            parent[index] = find(parent,parent[index]);
        }
        return parent[index];
    }
}
