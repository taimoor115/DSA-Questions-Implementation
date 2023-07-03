package Implementations;

public class Graphs {

    //    Undirected Graph
//    0 <---> 1 <---> 2 <---> 3 <--> 0
//    (0,1) (1,0) edge
//    (1,2) (2,1) edge
//    (2,3) (3,2) edge
//    (0,3) (3,0) edge
//    Edge represented by 1
//[
//    [0,1,0,1]
//    [1,0,1,0]
//    [0,1,0,1]
//    [1,0,1,0]
//]

    private int V; //Vertex
    private int E; //Edges
    int[][] adjMatrix;

    public Graphs(int nodes) {
        this.V = nodes;
        this.E = 0;
        this.adjMatrix = new int[nodes][nodes];
    }

    public void addEdge(int u, int v) {
        this.adjMatrix[u][v] = 1;
        this.adjMatrix[v][u] = 1;
        E++;
    }

    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append(V + " Vertices " + E + " Edges" + "\n");
        for (int i = 0; i < V; i++) {
            s.append(i + ":");

            for (int j : adjMatrix[i]) {
                s.append(j + " ");
            }
            s.append("\n");
        }
        return s.toString();
    }


    public static void main(String[] args) {
        Graphs g = new Graphs(4);
        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(2, 3);
        g.addEdge(3, 0);
        System.out.println(g);
    }
}
