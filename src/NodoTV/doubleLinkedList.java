package NodoTV;


public class doubleLinkedList {
    public Node head;          // Nodo inicial de la lista
    private Node tail;          // Nodo final de la lista
    private int size;           // Tamaño actual de la lista

    // Constructor para inicializar una lista vacía
    public doubleLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    // Método para obtener el tamaño de la lista
    public int getSize() {
        return size;
    }

    // Método para verificar si la lista está vacía
    public boolean isEmpty() {
        return head == null;
    }

    // Método para insertar un programa al final de la lista
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

    // Método para insertar un programa en una posición específica
    public void insertAt(Programs program, int position) {
        if (position < 0 || position > size) {
            throw new IndexOutOfBoundsException("Posición fuera de los límites");
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

    // Método para eliminar un programa de la lista
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
                System.out.println("El programa " + program.getProgramName() + " fue eliminado de la lista");
                return;
            }
            current = current.next;
        }
        System.out.println("El programa " + program.getProgramName() + " no fue encontrado en la lista.");
    }

    // Método para obtener un programa por posición en la lista
    public Programs getByPosition(int n) {
        if (n < 0 || n >= size) {
            System.out.println("Posición inválida");
            return null;
        }

        Node current = head;
        for (int i = 0; i < n; i++) {
            current = current.next;
        }
        return current.program;
    }

    // Método para mover un programa a la izquierda en la lista
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

    // Método para mover un programa a la derecha en la lista
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

    // Método toString para representar la lista como cadena de texto
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

        // Convertir el StringBuilder a String y asegurarse de que se maneje la codificación adecuada
        return sb.toString();
    }
}
