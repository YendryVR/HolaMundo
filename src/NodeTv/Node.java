package NodeTv;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import NodeTv.Channel;

/**
 *
 * Class representing a node in a doubly linked list of television channels.
 * Clase que representa un nodo en una lista doblemente enlazada de canales de televisión.
 * @author Yendry VR
 */
public class Node {

  Channel channel; // The channel stored in this node / El canal almacenado en este nodo
    Node prev;       // Reference to the previous node / Referencia al nodo anterior
    Node next;       // Reference to the next node / Referencia al nodo siguiente

    /**
     * Constructor to initialize a node with a given channel.
     * Constructor para inicializar un nodo con un canal dado.
     *
     * @param channel The channel to be stored in the node / El canal que se almacenará en el nodo
     */
    public Node(Channel channel) {
        this.channel = channel;
        this.prev = null;
        this.next = null;
    }

}
