package NodoTV;

/**
 * Interface representing a List structure.
 * Interfaz que representa una estructura de lista.
 */
public interface List {

    /**
     * Returns the size of the list.
     * Devuelve el tamaño de la lista.
     *
     * @return Size of the list / Tamaño de la lista
     * @throws ListException if an error occurs while obtaining the size
     */
    public int getSize() throws ListException;

    /**
     * Cancels or clears the list.
     * Cancela o borra todos los elementos de la lista.
     */
    public void cancel();

    /**
     * Checks if the list is empty.
     * Verifica si la lista está vacía.
     *
     * @return true if the list is empty, false otherwise / true si la lista está vacía, false en caso contrario
     */
    public boolean isEmpty();

    /**
     * Inserts an element into the list.
     * Inserta un elemento en la lista.
     *
     * @param Element Element to be inserted / Elemento que se va a insertar
     */
    public void insert(Object Element);

    /**
     * Retrieves the position of an element in the list.
     * Obtiene la posición de un elemento en la lista.
     *
     * @param Element Element to search for / Elemento que se desea buscar
     */
    public void getPosition(Object Element);

    /**
     * Deletes an element from the list.
     * Elimina un elemento de la lista.
     *
     * @param Element Element to be deleted / Elemento que se va a eliminar
     */
    public void delete(Object Element);

    /**
     * Deletes an element from the list by its position.
     * Elimina un elemento de la lista por su posición.
     *
     * @param position Position of the element to delete / Posición del elemento que se va a eliminar
     */
    public void delete(int position);

    /**
     * Checks if an element exists in the list.
     * Verifica si un elemento existe en la lista.
     *
     * @param Element Element to check for existence / Elemento que se desea verificar si existe
     */
    public void exists(Object Element);

    /**
     * Retrieves the first element in the list.
     * Obtiene el primer elemento de la lista.
     *
     * @return First element in the list / Primer elemento de la lista
     */
    public Object firtInList();

    /**
     * Retrieves the last element in the list.
     * Obtiene el último elemento de la lista.
     *
     * @return Last element in the list / Último elemento de la lista
     */
    public Object lastInList();
    
    // Métodos extras 
    
    /**
     * Adds an element to the beginning of the list.
     * Agrega un elemento al inicio de la lista.
     *
     * @param Element Element to be added / Elemento que se va a añadir
     */
    public void addHead(Object Element);
    
    /**
     * Adds an element to the end of the list.
     * Agrega un elemento al final de la lista.
     *
     * @param Element Element to be added / Elemento que se va a añadir
     */
    public void addEnd(Object Element);
    
    /**
     * Retrieves an element from the list by its position.
     * Obtiene un elemento de la lista por su posición.
     *
     * @param n Position of the element to retrieve / Posición del elemento que se desea obtener
     * @return Element at the specified position / Elemento en la posición especificada
     */
    public Object getByPosition(int n);
    
    /**
     * Retrieves an element from the list by its value.
     * Obtiene un elemento de la lista por su valor.
     *
     * @param element Value of the element to retrieve / Valor del elemento que se desea obtener
     * @return Element with the specified value / Elemento con el valor especificado
     */
    public Object getByValue(Object element);
}
