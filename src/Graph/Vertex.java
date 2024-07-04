package Graph;

/**
 * Class representing a vertex in the graph.
 * Clase que representa un vértice en el grafo.
 */
public class Vertex {

    // Attributes / Atributos
    Object element; // Saves the element that represents each vertex / Guarda el elemento que representa cada vértice
    boolean visited; // In charge of validating if I already passed this vertex before / Encargado de validar si ya pasé por este vértice antes
    boolean destiny; // Controls the destination in my graph / Controla el destino en mi grafo
    boolean origin; // Controls the origin in my graph / Controla el origen en mi grafo

    // If the graph is dynamic we will use LinkedLists/ArrayLists
    // Si el grafo es dinámico, utilizaremos LinkedLists/ArrayLists
    // ListaCircularDoblementeEnlazada lcde;

    /**
     * Constructor to initialize a vertex with the given element.
     * Constructor para inicializar un vértice con el elemento dado.
     *
     * @param element The element to be stored in the vertex / El elemento que se almacenará en el vértice
     */
    public Vertex(Object element) {
        this.element = element;
        this.visited = false;
        this.destiny = false;
        this.origin = false;

        // In case we are using LinkedList, new instance of the LinkedList
        // En caso de que estemos utilizando LinkedList, nueva instancia de LinkedList
        // this.lcde = new ListaCircularDoblementeEnlazada();
    }

}
