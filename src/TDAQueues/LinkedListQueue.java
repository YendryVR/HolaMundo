
package TDAQueues;


import java.util.Queue;


public abstract class LinkedListQueue implements Queue{
     private Nodo front, rear;
    private int size;

    public LinkedListQueue() {
        this.front = this.rear = null;
        this.size = 0;
    }

    public int getSize() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return front == null;
    }

    public void cancel() {
        front = rear = null;
        size = 0;
    }

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

    public Object firstElement()  {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        }
        return front.getElement();
    }

    
    
}
