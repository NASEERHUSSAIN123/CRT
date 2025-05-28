// Cycle Detection in Graph

public class Cycle {
    private int vertices;
    private int[][] adjacencyMatrix;

    // Constructor
    public Cycle(int vertices) {
        this.vertices = vertices;
        adjacencyMatrix = new int[vertices][vertices];
    }

    // Add Edge
    public void addEdge(int src, int dest) {
        adjacencyMatrix[src][dest] = 1;
        adjacencyMatrix[dest][src] = 1;
    }

    // Print Graph
    public void PrintGraph() {
        System.out.println("Adjaceny Matrix");
        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                System.out.print(adjacencyMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private boolean dfsCycle(int vertex, boolean[] visited, int parent) {
        visited[vertex] = true;
        for (int i = 0; i < vertices; i++) {
            if (adjacencyMatrix[vertex][i] == 1 && !visited[i]) {
                if (dfsCycle(i, visited, vertex)) {
                    return true;
                } else if (i != parent) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean hashCycle() {
        boolean[] visited = new boolean[vertices];
        for (int v = 0; v < vertices; v++) {
            if (!visited[v]) {
                if (dfsCycle(v, visited, -1)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String args[]) {
        Cycle graph = new Cycle(5);
        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 0);
        graph.addEdge(3, 4);
        graph.PrintGraph();
        if (graph.hashCycle()) {
            System.out.println("The graph contains a cycle");
        } else {
            System.out.println("The graph does not contain a cycle");
        }
    }
}