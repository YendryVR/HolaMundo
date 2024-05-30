/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Archive;

/**
 *
 * @author samir
 */
public class Node {

    public Object element;
    public Node next;
    public Node prev;

    public Node(Object element) {
        this.element = element;
        this.next = null;
        this.prev = null;
    }
}
    
