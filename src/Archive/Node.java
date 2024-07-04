/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Archive;

/**
 * This class represents a node in a doubly linked list.
 * 
 * Esta clase representa un nodo en una lista doblemente enlazada.
 * 
 * @author Samir
 */
public class Node {

    public Object element; // Element stored in the node / Elemento almacenado en el nodo
    public Node next;     // Reference to the next node / Referencia al siguiente nodo
    public Node prev;     // Reference to the previous node / Referencia al nodo anterior

    /**
     * Constructor to create a node with a specific element.
     * Constructor para crear un nodo con un elemento específico.
     * 
     * @param element the element to be stored in the node / el elemento que se almacenará en el nodo
     */
    public Node(Object element) {
        this.element = element;
        this.next = null;
        this.prev = null;
    }
}

