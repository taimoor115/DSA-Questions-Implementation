package Implementations.Graph;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    private LinkedList<Integer>[] adj;
    private int V; //Vertices
    private int E; //Edges

    public BFS(int nodes) {
        this.V = nodes;
        this.E = 0;
        this.adj = new LinkedList[nodes];

        for (int i = 0; i < V; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    public void addEdge(int u, int v) {
        adj[u].add(v);
        adj[v].add(u);
        E++;
    }
//0:    1 3
//1:    0 2
//2:    1 3
//3:    2 0

    //  1.[F,F,F,F] queue:{}
//      2.[T,F,F,F] queue:{0}
//      4.[T,T,F,F] queue:{1} print 0
//      5.[T,F,F,T] queue:{1,3} print 0
//      6.[T,T,F,T] queue:{3} print 0 1
//      7.[T,T,F,T] queue:{} print 0 1 3
//      8.[T,T,T,T] queue:{2} print 0 1 3
//      9.[T,T,T,T] queue:{} print 0 1 3 2
    public void bfs(int s) {
        boolean[] visited = new boolean[V];
        Queue<Integer> q = new LinkedList<>();
        visited[s] = true;
        q.offer(s);

        while (!q.isEmpty()) {
            int temp = q.poll();
            System.out.print(temp + " ");

            for (int v : adj[temp]) {
                if (!visited[v]) {
                    visited[v] = true;
                    q.offer(v);
                }
            }
        }
    }

    public static void main(String[] args) {
        BFS b = new BFS(5);
        b.addEdge(0, 1);
        b.addEdge(1, 2);
        b.addEdge(2, 3);
        b.addEdge(3, 0);
        b.addEdge(2, 4);
        b.bfs(0);
    }
}
