package Graph.Questions;

import java.util.LinkedList;

public class ConnectedComponents {
    private int V;
    int count = 0;
    private int E;
    private LinkedList<Integer>[] adj;

    public ConnectedComponents(int nodes) {
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
        int[] compId = new int[V];
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                dfs(i, visited, compId, count);
                count++;
            }
        }
    }

    public void dfs(int i, boolean[] visited, int[] compId, int count) {
        visited[i] = true;
        compId[i] = count;
        for (int j : adj[i]) {
            if (!visited[j]) {
                dfs(j, visited, compId, count);
            }
        }
    }

    public int getCount() {
        return count;
    }

    public static void main(String[] args) {
        ConnectedComponents c = new ConnectedComponents(7);
        c.addEdge(0, 3);
        c.addEdge(1, 0);
        c.addEdge(2, 4);
        c.addEdge(5, 6);
        c.dfs();
        System.out.println(c.getCount());
    }
}
