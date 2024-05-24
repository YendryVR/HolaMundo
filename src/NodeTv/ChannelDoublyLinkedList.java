package NodeTv;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import NodeTv.Node;
import NodeTv.Channel;

import java.util.ArrayList;

/**
 *
 * @author Yendry VR
 */
public class ChannelDoublyLinkedList {

    private Node head;
    private Node tail;
    private Node current;

    public ChannelDoublyLinkedList() {
        this.head = null;
        this.tail = null;
        this.current = null;
    }

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

    public void moveLeft() {
        if (current != null && current.prev != null) {
            current = current.prev;
        }
    }

    public void moveRight() {
        if (current != null && current.next != null) {
            current = current.next;
        }
    }

    public Channel getCurrentChannel() {
        if (current != null) {
            return current.channel;
        }
        return null;
    }

    public void showChannels() {
        Node temp = head;
        while (temp != null) {
            System.out.println("Channel: " + temp.channel.getChannel());
            temp = temp.next;
        }
    }
}
