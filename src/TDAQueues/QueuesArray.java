
package TDAQueues;


public class QueuesArray implements Queues{
     private Object[] queue;
    private int front, rear, size, capacity;

    public QueuesArray(int capacity) {
        this.capacity = capacity;
        this.queue = new Object[capacity];
        this.front = this.size = 0;
        this.rear = capacity - 1;
    }

    @Override
    public int getSize() {
       return size;
    
    
    }

    @Override
    public boolean isEmpty() {
       return size == 0;
    
    }

    @Override
    public void cancel() {
     this.front = this.size = 0;
        this.rear = capacity - 1;
    
    }

    @Override
    public boolean exist(Object element) {
        for (int i = 0; i < size; i++) {
            if (queue[(front + i) % capacity].equals(element)) {
                return true;
            }
        }
        return false;
    
    
    }

    @Override
    public void insert(Object element) {
        if (size == capacity) {
             System.out.println("Queue is full");
        }
        rear = (rear + 1) % capacity;
        queue[rear] = element;
        size++;
    
    }

    @Override
    public Object delete() {
       if (isEmpty()) {
             System.out.println("Queue is empty");
        }
        Object element = queue[front];
        front = (front + 1) % capacity;
        size--;
        return element;
    
    }

    @Override
    public Object firstElement() {
       if (isEmpty()) {
             System.out.println("Queue is empty");
        }
        return queue[front];
    
    }
    
}
