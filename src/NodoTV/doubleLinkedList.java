package NodoTV;

/**
 * This class represents a double linked list.
 * Esta clase representa una lista doblemente enlazada.
 */
public class doubleLinkedList {
    public Node head;          // Initial node of the list / Nodo inicial de la lista
    private Node tail;         // Last node of the list / Nodo final de la lista
    private int size;          // Current size of the list / Tamaño actual de la lista

    /**
     * Constructor to initialize an empty list.
     * Constructor para inicializar una lista vacía.
     */
    public doubleLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    /**
     * Method to get the size of the list.
     * Método para obtener el tamaño de la lista.
     * @return size of the list / tamaño de la lista.
     */
    public int getSize() {
        return size;
    }

    /**
     * Method to check if the list is empty.
     * Método para verificar si la lista está vacía.
     * @return true if the list is empty, false otherwise / true si la lista está vacía, false en caso contrario.
     */
    public boolean isEmpty() {
        return head == null;
    }

    /**
     * Method to insert a program at the end of the list.
     * Método para insertar un programa al final de la lista.
     * @param program The program to be inserted / El programa a insertar.
     */
    public void insert(Programs program) {
        Node newNode = new Node(program);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    /**
     * Method to insert a program at a specific position.
     * Método para insertar un programa en una posición específica.
     * @param program The program to be inserted / El programa a insertar.
     * @param position The position at which to insert the program / La posición en la que insertar el programa.
     * @throws IndexOutOfBoundsException if the position is out of bounds / Si la posición está fuera de los límites.
     */
    public void insertAt(Programs program, int position) {
        if (position < 0 || position > size) {
            throw new IndexOutOfBoundsException("Position out of bounds / Posición fuera de los límites");
        }

        Node newNode = new Node(program);
        if (position == 0) {
            if (isEmpty()) {
                head = newNode;
                tail = newNode;
            } else {
                newNode.next = head;
                head.prev = newNode;
                head = newNode;
            }
        } else if (position == size) {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        } else {
            Node current = head;
            for (int i = 0; i < position - 1; i++) {
                current = current.next;
            }
            newNode.next = current.next;
            newNode.prev = current;
            current.next.prev = newNode;
            current.next = newNode;
        }
        size++;
    }

    /**
     * Method to delete a program from the list.
     * Método para eliminar un programa de la lista.
     * @param program The program to be deleted / El programa a eliminar.
     */
    public void delete(Programs program) {
        Node current = head;

        while (current != null) {
            if (current.program.equals(program)) {
                if (current.prev != null) {
                    current.prev.next = current.next;
                } else {
                    head = current.next;
                }

                if (current.next != null) {
                    current.next.prev = current.prev;
                } else {
                    tail = current.prev;
                }

                size--;
                System.out.println("The program " + program.getProgramName() + " was removed from the list / El programa " + program.getProgramName() + " fue eliminado de la lista");
                return;
            }
            current = current.next;
        }
        System.out.println("The program " + program.getProgramName() + " was not found in the list / El programa " + program.getProgramName() + " no fue encontrado en la lista.");
    }

    /**
     * Method to get a program by its position in the list.
     * Método para obtener un programa por posición en la lista.
     * @param n The position of the program / La posición del programa.
     * @return The program at the specified position / El programa en la posición especificada.
     */
    public Programs getByPosition(int n) {
        if (n < 0 || n >= size) {
            System.out.println("Invalid position / Posición inválida");
            return null;
        }

        Node current = head;
        for (int i = 0; i < n; i++) {
            current = current.next;
        }
        return current.program;
    }

    /**
     * Method to move a program to the left in the list.
     * Método para mover un programa a la izquierda en la lista.
     * @param program The program to be moved / El programa a mover.
     */
    public void moveLeft(Programs program) {
        Node current = head;

        while (current != null) {
            if (current.program.equals(program)) {
                if (current.prev != null) {
                    Node prevNode = current.prev;
                    Node nextNode = current.next;

                    if (prevNode != null) {
                        prevNode.next = current.next;
                    }

                    if (nextNode != null) {
                        nextNode.prev = current.prev;
                    }

                    current.next = prevNode;
                    current.prev = prevNode.prev;

                    if (prevNode.prev != null) {
                        prevNode.prev.next = current;
                    } else {
                        head = current;
                    }

                    prevNode.prev = current;
                }

                return;
            }

            current = current.next;
        }
    }

    /**
     * Method to move a program to the right in the list.
     * Método para mover un programa a la derecha en la lista.
     * @param program The program to be moved / El programa a mover.
     */
    public void moveRight(Programs program) {
        Node current = head;

        while (current != null) {
            if (current.program.equals(program)) {
                if (current.next != null) {
                    Node nextNode = current.next;
                    Node prevNode = current.prev;

                    if (nextNode != null) {
                        nextNode.prev = current.prev;
                    }

                    if (prevNode != null) {
                        prevNode.next = current.next;
                    }

                    current.prev = nextNode;
                    current.next = nextNode.next;

                    if (nextNode.next != null) {
                        nextNode.next.prev = current;
                    } else {
                        tail = current;
                    }

                    nextNode.next = current;
                }

                return;
            }

            current = current.next;
        }
    }

    /**
     * Method to represent the list as a string.
     * Método para representar la lista como cadena de texto.
     * @return The string representation of the list / La representación en cadena de la lista.
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Programs List:\n");
        sb.append("-----------------\n");

        Node current = head;
        while (current != null) {
            sb.append("Name: ").append(current.program.getProgramName()).append("\n")
                    .append("Description: ").append(current.program.getProgramInformation()).append("\n")
                    .append("Duration: ").append(current.program.getDurationMinutes()).append(" minutes\n")
                    .append("Start Time: ").append(current.program.getStartTime()).append("\n")
                    .append("End Time: ").append(current.program.getEndTime()).append("\n")
                    .append("Genre: ").append(current.program.getGenre()).append("\n")
                    .append("Image Path: ").append(current.program.getImagePath()).append("\n")
                    .append("-----------------\n");

            current = current.next;
        }

        // Convert the StringBuilder to String and ensure proper encoding handling
        // Convertir el StringBuilder a String y asegurarse de que se maneje la codificación adecuada
        return sb.toString();
    }
}
