package Graph;

/**
 * Esta interfaz define operaciones para una estructura de datos de grafo.
 * 
 * This interface defines operations for a graph data structure.
 */
public interface Graph {

   // Clear the entire graph / Eliminar todo el grafo
    public void clear();

    // Check if the graph is empty / Devuelve verdadero o falso si el grafo está vacío o no
    public boolean isEmpty();

    // Get the size of the graph based on the number of vertices / Devuelve el tamaño del grafo basado en la cantidad de vértices
    public int getSize();

    // Check if a vertex exists / Verdadero si el vértice existe, falso si no
    public boolean existsVertex(Object element);

    // Check if an edge exists between two vertices / Verdadero si la arista existe, falso si no
    public boolean existsEdge(Object v1, Object v2);

    // Insert a new vertex into the graph / Insertar un nuevo vértice en el grafo
    public void addVertex(Object element) throws GraphException;

    // Add a new edge between two vertices / Agregar una nueva arista entre dos vértices
    public void addEdge(Object v1, Object v2);

    // Get the position of a vertex / Devuelve la posición del vértice
    public int getPosition(Object element);

    // Add weight to an edge between two vertices / Agregar peso a la arista entre dos vértices
    public void addWeight(Object v1, Object v2, int weight);

    // Perform Depth-First Search (DFS) / Realizar búsqueda en profundidad (DFS)
    public void dfs(Object start);

    // Perform Breadth-First Search (BFS) / Realizar búsqueda en anchura (BFS)
    public void bfs(Object start);

    // Find the shortest path using Dijkstra's algorithm / Encontrar la ruta más corta usando el algoritmo de Dijkstra
    public void dijkstra(Object start);
}