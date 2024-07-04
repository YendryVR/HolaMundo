package TDAQueues;

import java.util.Queue;

/**
 * Abstract class representing a linked list-based queue. Clase abstracta que
 * representa una cola basada en lista enlazada.
 */
public abstract class LinkedListQueue implements Queue {

    private Nodo front, rear;
    private int size;

    /**
     * Constructor to initialize an empty queue. Constructor para inicializar
     * una cola vacía.
     */
    public LinkedListQueue() {
        this.front = this.rear = null;
        this.size = 0;
    }

    /**
     * Returns the current size of the queue. Retorna el tamaño actual de la
     * cola.
     *
     * @return the size of the queue / el tamaño de la cola.
     */
    public int getSize() {
        return size;
    }

    /**
     * Checks if the queue is empty. Verifica si la cola está vacía.
     *
     * @return true if the queue is empty, false otherwise / true si la cola
     * está vacía, false en caso contrario.
     */

    @Override
    public boolean isEmpty() {
        return front == null;
    }

    /**
     * Clears the queue, removing all elements. Limpia la cola, eliminando todos
     * los elementos.
     */
    public void cancel() {
        front = rear = null;
        size = 0;
    }

    /**
     * Checks if an element exists in the queue. Verifica si un elemento existe
     * en la cola.
     *
     * @param element the element to check / el elemento a verificar.
     * @return true if the element exists in the queue, false otherwise / true
     * si el elemento existe en la cola, false en caso contrario.
     */
    public boolean exist(Object element) {
        Nodo current = front;
        while (current != null) {
            if (current.getElement().equals(element)) {
                return true;
            }
            current = current.getNext();
        }
        return false;
    }

    /**
     * Inserts an element into the rear of the queue. Inserta un elemento en la
     * parte trasera de la cola.
     *
     * @param element the element to insert / el elemento a insertar.
     */
    public void insert(Object element) {
        Nodo newNode = new Nodo(element);
        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.setNext(newNode);
            rear = newNode;
        }
        size++;
    }

    /**
     * Removes and returns the element at the front of the queue. Remueve y
     * retorna el elemento en el frente de la cola.
     *
     * @return the element at the front of the queue / el elemento en el frente
     * de la cola.
     */
    public Object delete() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        }
        Object element = front.getElement();
        front = front.getNext();
        if (front == null) {
            rear = null;
        }
        size--;
        return element;
    }

    /**
     * Returns the element at the front of the queue without removing it.
     * Retorna el elemento en el frente de la cola sin removerlo.
     *
     * @return the element at the front of the queue / el elemento en el frente
     * de la cola.
     */
    public Object firstElement() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        }
        return front.getElement();
    }

}
