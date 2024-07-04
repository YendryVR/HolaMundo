package Graph;

import java.util.*;

/**
 * Class representing a graph using an adjacency matrix.
 * Clase que representa un grafo usando una matriz de adyacencia.
 * Implements the Graph interface.
 * Implementa la interfaz Graph.
 */
public class GraphEdgeMatrix implements Graph {
 private Vertex[] vertex; // Stores the vertices of the graph / Almacena los vértices del grafo
    private Object[][] edgeMatrix; // Adjacency matrix for the edges / Matriz de adyacencia para las aristas
    private int cont; // Controls the number of vertices / Controla la cantidad de vértices
    private int n; // Maximum number of vertices that can be created / Máxima cantidad de vértices que podemos crear

    /**
     * Constructor to initialize the graph with a maximum number of vertices.
     * Constructor para inicializar el grafo con una cantidad máxima de vértices.
     *
     * @param n Maximum number of vertices / Máxima cantidad de vértices
     */
    public GraphEdgeMatrix(int n) {
        if (n < 0) {
            System.exit(0);
        }
        this.n = n;
        this.cont = 0;
        this.vertex = new Vertex[n];
        this.edgeMatrix = new Object[n][n];
        startEdgeMatrix();
    }

    //------------------------------------------------------------------- MÉTODOS
     /**
     * Initializes the edge matrix to zero.
     * Inicializa la matriz de aristas a cero.
     */
    public void startEdgeMatrix() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                edgeMatrix[i][j] = 0;
            }
        }
    }

    @Override
    public void clear() {
        for (int i = 0; i < cont; i++) {
            vertex[i] = null;
        }
        cont = 0;
        startEdgeMatrix();
    }

    @Override
    public boolean isEmpty() {
        return cont == 0;
    }

    @Override
    public int getSize() {
        return cont;
    }

    @Override
    public boolean existsVertex(Object element) {
        if (isEmpty()) {
            throw new GraphException("Graph is empty");
        }

        for (int i = 0; i < cont; i++) {
            if (vertex[i].element.equals(element)) {
                return true;
            }
        }
        return false; // No se encontró el elemento
    }

    @Override
    public boolean existsEdge(Object v1, Object v2) {
        if (isEmpty()) {
            System.out.println("No data in the graph");
        }
        return edgeMatrix[getPosition(v1)][getPosition(v2)] != (Object) 0;
    }

    @Override
    public void addVertex(Object element) {
        if (cont >= n) {
            throw new GraphException("Graph is full");
        }
        vertex[cont++] = new Vertex(element);
    }

    @Override
    public void addEdge(Object v1, Object v2) {
        if (!existsVertex(v1) || !existsVertex(v2)) {
            System.out.println("One or both edges don't exist");
        }
        edgeMatrix[getPosition(v1)][getPosition(v2)] = 1;
        edgeMatrix[getPosition(v2)][getPosition(v1)] = 1; // Para grafos no dirigidos
    }

    @Override
    public int getPosition(Object element) {
        for (int i = 0; i < cont; i++) {
            if (vertex[i].element.equals(element)) {
                return i;
            }
        }
        return -1; // No se encontró el vértice, así que -1
    }

    @Override
    public String toString() {
        String result = "Graph information ";
        result += "with EdgeMatrix (Static form)";
        result += "\n----------------------------------";
        for (int i = 0; i < cont; i++) {
            result += "\nVertex in position: " + i + " is: " + vertex[i].element;
        }
        result += "\n\nVertex and Edges of the graph\n";
        for (int i = 0; i < cont; i++) {
            for (int j = 0; j < cont; j++) {
                if (edgeMatrix[i][j] != (Object) 0) {
                    result += vertex[i].element + " -------> " + vertex[j].element + "\n";
                }
            }
        }
        return "\n" + result;
    }

    // Métodos adicionales

    @Override
    public void addWeight(Object v1, Object v2, int weight) {
        if (!existsVertex(v1) || !existsVertex(v2)) {
            throw new GraphException("One or both vertices don't exist");
        }
        edgeMatrix[getPosition(v1)][getPosition(v2)] = weight;
        edgeMatrix[getPosition(v2)][getPosition(v1)] = weight; // Para grafos no dirigidos
    }

    @Override
    public void dfs(Object start) {
        boolean[] visited = new boolean[cont];
        Stack<Vertex> stack = new Stack<>();
        int startIndex = getPosition(start);

        if (startIndex == -1) {
            throw new GraphException("The start vertex does not exist");
        }

        stack.push(vertex[startIndex]);

        while (!stack.isEmpty()) {
            Vertex current = stack.pop();
            int currentIndex = getPosition(current.element);

            if (!visited[currentIndex]) {
                visited[currentIndex] = true;
                System.out.print(current.element + " ");

                for (int i = 0; i < cont; i++) {
                    if ((int) edgeMatrix[currentIndex][i] != 0 && !visited[i]) {
                        stack.push(vertex[i]);
                    }
                }
            }
        }
        System.out.println();
    }

    @Override
    public void bfs(Object start) {
        boolean[] visited = new boolean[cont];
        Queue<Vertex> queue = new LinkedList<>();
        int startIndex = getPosition(start);

        if (startIndex == -1) {
            throw new GraphException("The start vertex does not exist");
        }

        queue.add(vertex[startIndex]);
        visited[startIndex] = true;

        while (!queue.isEmpty()) {
            Vertex current = queue.poll();
            int currentIndex = getPosition(current.element);
            System.out.print(current.element + " ");

            for (int i = 0; i < cont; i++) {
                if ((int) edgeMatrix[currentIndex][i] != 0 && !visited[i]) {
                    queue.add(vertex[i]);
                    visited[i] = true;
                }
            }
        }
        System.out.println();
    }

    @Override
    public void dijkstra(Object start) {
        int startIndex = getPosition(start);

        if (startIndex == -1) {
            throw new GraphException("The start vertex does not exist");
        }

        int[] dist = new int[cont];
        boolean[] visited = new boolean[cont];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[startIndex] = 0;

        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
        pq.add(new int[]{startIndex, 0});

        while (!pq.isEmpty()) {
            int[] current = pq.poll();
            int currentIndex = current[0];

            if (visited[currentIndex]) continue;
            visited[currentIndex] = true;

            for (int i = 0; i < cont; i++) {
                if ((int) edgeMatrix[currentIndex][i] != 0) {
                    int newDist = dist[currentIndex] + (int) edgeMatrix[currentIndex][i];

                    if (newDist < dist[i]) {
                        dist[i] = newDist;
                        pq.add(new int[]{i, newDist});
                    }
                }
            }
        }

        System.out.println("Dijkstra shortest path:");
        for (int i = 0; i < cont; i++) {
            System.out.println("Vertex: " + vertex[i].element + ", Distance from start: " + dist[i]);
        }
    }
}
