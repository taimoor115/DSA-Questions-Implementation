package Implementations.Graph;

import java.util.LinkedList;
import java.util.Stack;

public class DFS {
    private LinkedList<Integer>[] adj;
    private int V;
    private int E;

    public DFS(int nodes) {
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

    public void dfs(int startPoint) {
        boolean[] visited = new boolean[V];
        Stack<Integer> stack = new Stack<>();
        stack.push(startPoint);

        while (!stack.isEmpty()) {
            int temp = stack.pop();
            if (!visited[temp]) {
                visited[temp] = true;
                System.out.print(temp + " ");

                for (int i : adj[temp]) {
                    if (!visited[i]) {
                        stack.push(i);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        DFS d = new DFS(5);
        d.addEdge(0, 1);
        d.addEdge(1, 2);
        d.addEdge(2, 3);
        d.addEdge(3, 0);
        d.addEdge(2, 4);
        d.dfs(0);
    }
}
