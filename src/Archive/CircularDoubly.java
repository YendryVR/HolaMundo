/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Archive;

/**
 *
 * @author samir
 */
public class CircularDoubly implements List{
   private Node start;
    private int size;

    public CircularDoubly() {
        start = null;
        size = 0;
    }

    @Override
    public void cancel() {
        start = null;
        size = 0;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

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

    @Override
    public Object lastInList() {
        if (isEmpty()) {
            throw new IllegalStateException("List is empty");
        }
        return start.prev.element;
    }

    @Override
    public Object firstInList() {
        if (isEmpty()) {
            throw new IllegalStateException("List is empty");
        }
        return start.element;
    } 
}
