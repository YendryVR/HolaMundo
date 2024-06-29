package TDAQueues;

public class ListQueues implements Queues {

    private Nodo front, rear;
    private int size;

    public ListQueues() {
        this.front = this.rear = null;
        this.size = 0;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return front == null;
    }

    @Override
    public void cancel() {
        front = rear = null;
        size = 0;
    }

    @Override
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

    @Override
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

    @Override
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

    @Override
    public Object firstElement() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        }
        return front.getElement();
    }
}
