package NodoTV;

public class Node {
    Programs program;
    Node next;
    Node prev;

    public Node(Programs program) {
        this.program = program;
        this.next = null;
        this.prev = null;
    }
}
