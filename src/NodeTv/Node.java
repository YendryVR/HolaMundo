package NodeTv;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import NodeTv.Channel;

/**
 *
 * @author Yendry VR
 */
public class Node {

    Channel channel;
    Node prev;
    Node next;

    public Node(Channel channel) {
        this.channel = channel;
        this.prev = null;
        this.next = null;
    }

}
