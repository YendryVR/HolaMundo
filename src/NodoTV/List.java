package NodoTV;



public interface List {

    public int getSize() throws ListException;

    public void cancel();

    public boolean isEmpty();

    public void insert(Object Element);

    public void getPosition(Object Element);

    public void delete(Object Element);

    public void delete(int position);

    public void exists(Object Element);

    public Object firtInList();

    public Object lastInList();
    
    // Métodos extras 
    
    public void addHead(Object Element);
    
    public void addEnd(Object Element);
    
    public Object getByPosition(int n);
    
    public Object getByValue(Object element);
}
