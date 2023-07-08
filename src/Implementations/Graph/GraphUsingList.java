package Implementations.Graph;

import java.util.LinkedList;

public class GraphUsingList {
    private LinkedList<Integer>[] adj;
    private int V; //No. of vertices
    private int E; //No. of Edgesb.addEdge(2, 4);

    public GraphUsingList(int nodes) {
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

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Vertices " + V + " Edges " + E + "\n");

        for (int i = 0; i < V; i++) {
            sb.append(i + ":");
            for (int j : adj[i]) {
                sb.append(j + " ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        GraphUsingList g = new GraphUsingList(5);
        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(2, 3);
        g.addEdge(3, 0);
        g.addEdge(2,4);

        System.out.println(g);
    }
}
