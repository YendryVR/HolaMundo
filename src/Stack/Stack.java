package Stack;

import Stack.StackException;
/**
 * Interface representing a stack data structure.
 * Interfaz que representa una estructura de datos tipo pila.
 */
public interface Stack<E> {
    
    /**
     * Returns the current size of the stack.
     * Retorna el tamaño actual de la pila.
     * 
     * @return the size of the stack / el tamaño de la pila.
     * @throws StackException if there is an error retrieving the size / si hay un error al obtener el tamaño.
     */
    public int getSize() throws StackException;
    
     /**
     * Returns true if the stack is empty, false otherwise.
     * Retorna true si la pila está vacía, false si no.
     * 
     * @return true if the stack is empty, false otherwise / true si la pila está vacía, false en caso contrario.
     * @throws StackException if there is an error checking if the stack is empty / si hay un error al verificar si la pila está vacía.
     */
    public boolean isEmpty() throws StackException;
    
    /**
     * Returns the element at the top of the stack without removing it.
     * Retorna el elemento en el tope de la pila sin removerlo.
     * 
     * @return the element at the top of the stack / el elemento en el tope de la pila.
     * @throws StackException if there is an error retrieving the top element / si hay un error al obtener el elemento del tope.
     */
    public E top() throws StackException;
    
      /**
     * Inserts an element onto the stack.
     * Inserta un elemento en la pila.
     * 
     * @param element the element to be inserted / el elemento a insertar.
     * @throws StackException if there is an error inserting the element / si hay un error al insertar el elemento.
     */
    public void push(E element) throws StackException;
    
     /**
     * Removes and returns the element at the top of the stack.
     * Remueve y retorna el elemento en el tope de la pila.
     * 
     * @return the element at the top of the stack / el elemento en el tope de la pila.
     * @throws StackException if there is an error removing the top element / si hay un error al remover el elemento del tope.
     */
    public E pop() throws StackException;
}
