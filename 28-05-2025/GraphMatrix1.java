import java.util.LinkedList;
import java.util.Queue;

public class GraphMatrix1 {
    private int vertices;
    private int[][] adjacencyMatrix;

    public GraphMatrix1(int vertices) {
        this.vertices = vertices;
        adjacencyMatrix = new int[vertices][vertices];
    }

    public void addEdge(int src, int dest) {
        adjacencyMatrix[src][dest] = 1;
        adjacencyMatrix[dest][src] = 1;
    }

    public void PrintGraph() {
        System.out.println("Adjacency Matrix:");
        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                System.out.print(adjacencyMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // BFS traversal for a component
    public void bfs(int start, boolean[] visited) {
        Queue<Integer> queue = new LinkedList<>();
        visited[start] = true;
        queue.offer(start);
        while (!queue.isEmpty()) {
            int vertex = queue.poll();
            System.out.print(vertex + " ");
            for (int i = 0; i < vertices; i++) {
                if (adjacencyMatrix[vertex][i] == 1 && !visited[i]) {
                    visited[i] = true;
                    queue.offer(i);
                }
            }
        }
    }

    // Find and print all connected components
    public void findConnectedComponents() {
        boolean[] visited = new boolean[vertices];
        int componentCount = 0;
        System.out.println("Connected Components:");
        for (int v = 0; v < vertices; v++) {
            if (!visited[v]) {
                componentCount++;
                System.out.print("Component " + componentCount + ": ");
                bfs(v, visited);
                System.out.println();
            }
        }
    }

    // Main method
    public static void main(String[] args) {
        GraphMatrix1 graph = new GraphMatrix1(5);
        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
        graph.PrintGraph();
        graph.findConnectedComponents();
    }
}
