package TDAQueues;


public interface Queues {
    int getSize();

    boolean isEmpty();

    void cancel();

    boolean exist(Object element);

    void insert(Object element);

    Object delete() ;

    Object firstElement() ;
}
