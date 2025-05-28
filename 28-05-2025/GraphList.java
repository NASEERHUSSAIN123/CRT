import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class GraphList {
    private int vertices;
    private List<List<Integer>> adjacencyList;

    // Constructor
    public GraphList(int vertices) {
        this.vertices = vertices;
        adjacencyList = new ArrayList<>();
        for (int i = 0; i < vertices; i++) {
            adjacencyList.add(new ArrayList<>());
        }
    }

    // Add edge for undirected graph
    public void addEdge(int src, int dest) {
        adjacencyList.get(src).add(dest);
        adjacencyList.get(dest).add(src);
    }

    // Print the graph
    public void PrintGraph() {
        for (int i = 0; i < vertices; i++) {
            System.out.print("Vertex " + i + " :");
            for (Integer neighbour : adjacencyList.get(i)) {
                System.out.print(" -> " + neighbour);
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
            for (int neighbor : adjacencyList.get(vertex)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.offer(neighbor);
                }
            }
        }
        System.out.println();
    }

    // DFS utility method
    public void dfsutil(int vertex, boolean[] visited) {
        visited[vertex] = true;
        System.out.print(vertex + " ");
        for (int neighbor : adjacencyList.get(vertex)) {
            if (!visited[neighbor]) {
                dfsutil(neighbor, visited);
            }
        }
    }

    // DFS from given vertex
    public void dfs(int start) {
        boolean[] visited = new boolean[vertices];
        System.out.print("DFS Traversal starting from vertex " + start + " : ");
        dfsutil(start, visited);
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        GraphList graph = new GraphList(5);
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
