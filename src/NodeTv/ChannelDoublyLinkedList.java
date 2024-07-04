package NodeTv;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import NodeTv.Node;
import NodeTv.Channel;

import java.util.ArrayList;

/**
 ** Class representing a doubly linked list of television channels.
 * Clase que representa una lista doblemente enlazada de canales de televisión.
 
 * @author Yendry VR
 */
public class ChannelDoublyLinkedList {

 
    private Node head;    // Reference to the head of the linked list / Referencia al inicio de la lista enlazada
    private Node tail;    // Reference to the tail of the linked list / Referencia al final de la lista enlazada
    private Node current; // Reference to the current node in the linked list / Referencia al nodo actual en la lista enlazada

    /**
     * Constructor to initialize an empty doubly linked list.
     * Constructor para inicializar una lista doblemente enlazada vacía.
     */
    public ChannelDoublyLinkedList() {
        this.head = null;
        this.tail = null;
        this.current = null;
    }
/**
     * Add a channel to the end of the linked list.
     * Agrega un canal al final de la lista enlazada.
     *
     * @param channel The channel to add / El canal a agregar
     */
    public void addChannel(Channel channel) {
        Node newNode = new Node(channel);
        if (head == null) {
            head = tail = current = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }
/**
     * Move the current node pointer to the left (previous node).
     * Mueve el puntero del nodo actual a la izquierda (nodo anterior).
     */
    public void moveLeft() {
        if (current != null && current.prev != null) {
            current = current.prev;
        }
    }
/**
     * Move the current node pointer to the right (next node).
     * Mueve el puntero del nodo actual a la derecha (nodo siguiente).
     */
    public void moveRight() {
        if (current != null && current.next != null) {
            current = current.next;
        }
    }
/**
     * Get the channel of the current node.
     * Obtiene el canal del nodo actual.
     *
     * @return The current channel / El canal actual
     */
    public Channel getCurrentChannel() {
        if (current != null) {
            return current.channel;
        }
        return null;
    }
 /**
     * Display all channels in the linked list.
     * Muestra todos los canales en la lista enlazada.
     */
    public void showChannels() {
        Node temp = head;
        while (temp != null) {
            System.out.println("Channel: " + temp.channel.getChannel());
            temp = temp.next;
        }
    }
}
