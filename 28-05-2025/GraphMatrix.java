
// Graph Implementation
import java.util.LinkedList;
import java.util.Queue;

public class GraphMatrix {
    private int vertices;
    private int[][] adjacencyMatrix;

    public GraphMatrix(int vertices) {
        this.vertices = vertices;
        adjacencyMatrix = new int[vertices][vertices];
    }

    public void addEdge(int src, int dest) {
        adjacencyMatrix[src][dest] = 1;
        adjacencyMatrix[dest][src] = 1;
    }

    public void PrintGraph() {
        System.out.println("Adjaceny Matrix");
        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                System.out.print(adjacencyMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // BFS
    public void bfs(int start) {
        boolean[] visited = new boolean[vertices];
        Queue<Integer> queue = new LinkedList<>();
        visited[start] = true;
        queue.offer(start);
        System.out.print("BFS Traversal starting from vertex " + start + " : ");
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
        System.out.println();
    }

    // DFS Traversal utility method
    public void dfsutil(int vertex, boolean[] visited) {
        visited[vertex] = true;
        System.out.print(vertex + " ");
        for (int i = 0; i < vertices; i++) {
            if (adjacencyMatrix[vertex][i] == 1 && !visited[i]) {
                dfsutil(i, visited);
            }
        }
    }

    // DFS Traversal from a given source vertex
    public void dfs(int start) {
        boolean[] visited = new boolean[vertices];
        System.out.print("DFS Traversal starting from vertex " + start + " : ");
        dfsutil(start, visited);
        System.out.println();
    }

    // Main method
    public static void main(String args[]) {
        GraphMatrix graph = new GraphMatrix(5);
        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
        graph.PrintGraph();
        graph.bfs(0);
        graph.dfs(0);
    }
}