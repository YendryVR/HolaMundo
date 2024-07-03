package Stack;

import Stack.StackException;

public interface Stack<E> {
    
    // Retorna el tamaño actual de la pila
    public int getSize() throws StackException;
    
    // Retorna true si la pila está vacía, false si no
    public boolean isEmpty() throws StackException;
    
    // Retorna el elemento en el tope de la pila
    public E top() throws StackException;
    
    // Inserta un elemento en la pila
    public void push(E element) throws StackException;
    
    // Remueve y retorna el elemento en el tope de la pila
    public E pop() throws StackException;
}
