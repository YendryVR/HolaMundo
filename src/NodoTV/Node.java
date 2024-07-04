package NodoTV;

/**
 * Class representing a node in a doubly linked list structure.
 * Clase que representa un nodo en una estructura de lista doblemente enlazada.
 */
public class Node {
    Programs program;  // Stores a program object
    Node next;         // Reference to the next node
    Node prev;         // Reference to the previous node

    /**
     * Constructor to initialize a Node with a given program object.
     * Constructor para inicializar un nodo con un objeto de programa dado.
     *
     * @param program The program object to store in the node.
     *                El objeto de programa que se almacenará en el nodo.
     */
    public Node(Programs program) {
        this.program = program;
        this.next = null;  // Initially no next node
        this.prev = null;  // Initially no previous node
    }
}
