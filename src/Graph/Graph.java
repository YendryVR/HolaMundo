package Graph;

public interface Graph {

    // Eliminar todo el grafo
    public void clear();

    // Devuelve verdadero o falso si el grafo está vacío o no
    public boolean isEmpty();

    // Devuelve el tamaño del grafo basado en la cantidad de vértices
    public int getSize();

    // Verdadero si el vértice existe, falso si no
    public boolean existsVertex(Object element);

    // Verdadero si la arista existe, falso si no
    public boolean existsEdge(Object v1, Object v2);

    // Insertar un nuevo vértice en el TDA
    public void addVertex(Object element) throws GraphException;

    // Agregar una nueva arista entre dos de los vértices
    public void addEdge(Object v1, Object v2);

    // Devuelve la posición del vértice
    public int getPosition(Object element);

    // Agregar peso a la arista entre dos vértices
    public void addWeight(Object v1, Object v2, int weight);

    // Realizar búsqueda en profundidad (DFS)
    public void dfs(Object start);

    // Realizar búsqueda en anchura (BFS)
    public void bfs(Object start);

    // Encontrar la ruta más corta usando el algoritmo de Dijkstra
    public void dijkstra(Object start);
}
