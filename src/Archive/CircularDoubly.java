/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Archive;

/**
 * Implementation of a Circular Doubly Linked List. This class provides methods
 * to manage a list where elements are linked in a circular manner with both
 * forward and backward references.
 *
 * Implementación de una Lista Doblemente Enlazada Circular. Esta clase
 * proporciona métodos para gestionar una lista donde los elementos están
 * enlazados de manera circular con referencias hacia adelante y hacia atrás.
 *
 */
public class CircularDoubly implements List {
    // Node representing the start of the list / Nodo que representa el inicio de la lista

    private Node start;
    // Number of elements in the list / Número de elementos en la lista
    private int size;

    /**
     * Constructor to initialize an empty circular doubly linked list.
     * Constructor para inicializar una lista doblemente enlazada circular
     * vacía.
     */
    public CircularDoubly() {
        start = null;
        size = 0;
    }

    /**
     * Method to clear the list. Método para vaciar la lista.
     */
    @Override
    public void cancel() {
        start = null;
        size = 0;
    }

    /**
     * Method to get the size of the list. Método para obtener el tamaño de la
     * lista.
     *
     * @return the number of elements in the list / el número de elementos en la
     * lista
     */
    @Override
    public int getSize() {
        return size;
    }

    /**
     * Method to check if the list is empty. Método para comprobar si la lista
     * está vacía.
     *
     * @return true if the list is empty, false otherwise / verdadero si la
     * lista está vacía, falso en caso contrario
     */
    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Method to add an element at the head of the list. Método para agregar un
     * elemento al inicio de la lista.
     *
     * @param element the element to be added / el elemento a agregar
     */
    @Override
    public void addHead(Object element) {
        Node newNode = new Node(element);
        if (isEmpty()) {
            start = newNode;
            start.next = start;
            start.prev = start;
        } else {
            newNode.next = start;
            newNode.prev = start.prev;
            start.prev.next = newNode;
            start.prev = newNode;
            start = newNode;
        }
        size++;
    }

    /**
     * Method to add an element at the end of the list. Método para agregar un
     * elemento al final de la lista.
     *
     * @param element the element to be added / el elemento a agregar
     */
    @Override
    public void addEnd(Object element) {
        Node newNode = new Node(element);
        if (isEmpty()) {
            start = newNode;
            start.next = start;
            start.prev = start;
        } else {
            newNode.prev = start.prev;
            newNode.next = start;
            start.prev.next = newNode;
            start.prev = newNode;
        }
        size++;
    }

    /**
     * Method to add an element in a sorted manner. Método para agregar un
     * elemento de manera ordenada.
     *
     * @param element the element to be added / el elemento a agregar
     */
    @Override
    public void addSort(Object element) {
        Node newNode = new Node(element);
        if (isEmpty()) {
            start = newNode;
            start.next = start;
            start.prev = start;
        } else {
            Node aux = start;
            Node prev = null;
            while (aux.element.hashCode() < element.hashCode()) {
                prev = aux;
                aux = aux.next;
                if (aux == start) {
                    break;
                }
            }
            if (prev == null) {
                newNode.next = start;
                newNode.prev = start.prev;
                start.prev.next = newNode;
                start.prev = newNode;
                start = newNode;
            } else {
                newNode.next = aux;
                newNode.prev = aux.prev;
                aux.prev.next = newNode;
                aux.prev = newNode;
            }
        }
        size++;
    }

    /**
     * Method to get an element by its position in the list. Método para obtener
     * un elemento por su posición en la lista.
     *
     * @param n the position of the element / la posición del elemento
     * @return the node at the specified position / el nodo en la posición
     * especificada
     */
    @Override
    public Node getByPosition(int n) {
        if (n < 0 || n >= size) {
            System.out.println("Invalid position");
            return null;
        }

        Node aux = start;
        for (int i = 0; i < n; i++) {
            aux = aux.next;
        }
        return aux;
    }

    /**
     * Method to get an element by its value. Método para obtener un elemento
     * por su valor.
     *
     * @param element the value of the element / el valor del elemento
     * @return the node with the specified value / el nodo con el valor
     * especificado
     */
    @Override
    public Node getByValue(Object element) {
        Node aux = start;
        for (int i = 0; i < size; i++) {
            if (aux.element.equals(element)) {
                return aux;
            }
            aux = aux.next;
        }
        return null;
    }

    /**
     * Method to delete an element by its value. Método para eliminar un
     * elemento por su valor.
     *
     * @param element the value of the element to be deleted / el valor del
     * elemento a eliminar
     * @return true if the element was deleted, false otherwise / verdadero si
     * el elemento fue eliminado, falso en caso contrario
     */
    @Override
    public boolean delete(Object element) {
        Node aux = start;
        for (int i = 0; i < size; i++) {
            if (aux.element.equals(element)) {
                if (size == 1) {
                    start = null;
                } else {
                    aux.prev.next = aux.next;
                    aux.next.prev = aux.prev;
                    if (aux == start) {
                        start = aux.next;
                    }
                }
                size--;
                return true;
            }
            aux = aux.next;
        }
        return false;
    }

    /**
     * Method to check if an element exists in the list. Método para comprobar
     * si un elemento existe en la lista.
     *
     * @param element the value of the element to check / el valor del elemento
     * a comprobar
     * @return true if the element exists, false otherwise / verdadero si el
     * elemento existe, falso en caso contrario
     */
    @Override
    public boolean exists(Object element) {
        Node aux = start;
        for (int i = 0; i < size; i++) {
            if (aux.element.equals(element)) {
                return true;
            }
            aux = aux.next;
        }
        return false;
    }

    /**
     * Method to get the last element in the list. Método para obtener el último
     * elemento en la lista.
     *
     * @return the last element in the list / el último elemento en la lista
     * @throws IllegalStateException if the list is empty / lanza una excepción
     * si la lista está vacía
     */

    @Override
    public Object lastInList() {
        if (isEmpty()) {
            throw new IllegalStateException("List is empty");
        }
        return start.prev.element;
    }

    /**
     * Method to get the first element in the list. Método para obtener el
     * primer elemento en la lista.
     *
     * @return the first element in the list / el primer elemento en la lista
     * @throws IllegalStateException if the list is empty / lanza una excepción
     * si la lista está vacía
     */

    @Override
    public Object firstInList() {
        if (isEmpty()) {
            throw new IllegalStateException("List is empty");
        }
        return start.element;
    }
}
