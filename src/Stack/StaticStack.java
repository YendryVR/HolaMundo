package Stack;

/**
 * Class representing a static stack data structure.
 * Clase que representa una estructura de datos tipo pila estática.
 */
public class StaticStack<E> implements Stack<E> {
    
    private E[] S;
    private int top;

    /**
     * Constructs a static stack with a given capacity.
     * Construye una pila estática con una capacidad dada.
     * 
     * @param n the capacity of the stack / la capacidad de la pila.
     */
    public StaticStack(int n) {
        if (n <= 0)
            System.exit(0);
        // Create the array of type E / Crear el array de tipo E
        this.S = (E[]) new Object[n];
        top = -1;
    }

    /**
     * Returns the current size of the stack.
     * Retorna el tamaño actual de la pila.
     * 
     * @return the size of the stack / el tamaño de la pila.
     * @throws StackException if there is an error retrieving the size / si hay un error al obtener el tamaño.
     */
    @Override
    public int getSize() throws StackException {
        return top + 1;
    }

    /**
     * Returns true if the stack is empty, false otherwise.
     * Retorna true si la pila está vacía, false si no.
     * 
     * @return true if the stack is empty, false otherwise / true si la pila está vacía, false en caso contrario.
     * @throws StackException if there is an error checking if the stack is empty / si hay un error al verificar si la pila está vacía.
     */
    @Override
    public boolean isEmpty() throws StackException {
        return top < 0;
    }

    /**
     * Returns the element at the top of the stack without removing it.
     * Retorna el elemento en el tope de la pila sin removerlo.
     * 
     * @return the element at the top of the stack / el elemento en el tope de la pila.
     * @throws StackException if the stack is empty / si la pila está vacía.
     */
    @Override
    public E top() throws StackException {
        if (isEmpty())
            throw new StackException("The stack is empty");
        return S[top];
    }

    /**
     * Inserts an element onto the stack.
     * Inserta un elemento en la pila.
     * 
     * @param element the element to be inserted / el elemento a insertar.
     * @throws StackException if the stack is full / si la pila está llena.
     */
    @Override
    public void push(E element) throws StackException {
        if (getSize() == S.length)
            throw new StackException("The Stack is Full");
        S[++top] = element;
    }

    /**
     * Removes and returns the element at the top of the stack.
     * Remueve y retorna el elemento en el tope de la pila.
     * 
     * @return the element at the top of the stack / el elemento en el tope de la pila.
     * @throws StackException if the stack is empty / si la pila está vacía.
     */
    @Override
    public E pop() throws StackException {
        if (isEmpty())
            throw new StackException("The stack is empty");
        return S[top--];
    }

    /**
     * Returns a string representation of the stack.
     * Retorna una representación en cadena de la pila.
     * 
     * @return a string representing the stack / una cadena que representa la pila.
     */
    @Override
    public String toString() {
        StringBuilder stackData = new StringBuilder();
        for (int i = top; i >= 0; i--) {
            stackData.append("Value: ").append(S[i]).append("\n");
        }
        return stackData.toString();
    }
}
