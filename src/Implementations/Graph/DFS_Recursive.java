package Implementations.Graph;

import java.util.LinkedList;

public class DFS_Recursive {
    private int V;
    private int E;
    private LinkedList<Integer>[] adj;

    public DFS_Recursive(int nodes) {
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

    public void dfs() {
        boolean[] visited = new boolean[V];
        for (int v = 0; v < V; v++) {
            if (!visited[v]) {
                dfs(v, visited);
            }
        }
    }

    public void dfs(int v, boolean[] visited) {
        visited[v] = true;
        System.out.print(v + " ");
        for (int w : adj[v]) {
            if (!visited[w]) {
                dfs(w, visited);
            }
        }
    }

    public static void main(String[] args) {
        DFS_Recursive r = new DFS_Recursive(5);
        r.addEdge(0, 1);
        r.addEdge(1, 2);
        r.addEdge(2, 3);
        r.addEdge(3, 0);
        r.addEdge(2, 4);

        r.dfs();
    }
}
