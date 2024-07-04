/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Archive;

/**
 * This interface defines the structure for a generic list, including operations
 * to manipulate and query the list.
 *
 * Esta interfaz define la estructura para una lista genérica, incluyendo
 * operaciones para manipular y consultar la lista.
 *
 * @autor Samir
 */
public interface List {

    /**
     * Cancels the list, effectively clearing all elements. Cancela la lista,
     * eliminando efectivamente todos los elementos.
     */
    void cancel();

    /**
     * Returns the size of the list. Devuelve el tamaño de la lista.
     *
     * @return the size of the list / el tamaño de la lista
     */
    int getSize();

    /**
     * Checks if the list is empty. Verifica si la lista está vacía.
     *
     * @return true if the list is empty, false otherwise / verdadero si la
     * lista está vacía, falso en caso contrario
     */
    boolean isEmpty();

    /**
     * Adds an element to the head (beginning) of the list. Agrega un elemento a
     * la cabeza (inicio) de la lista.
     *
     * @param element the element to be added / el elemento a agregar
     */
    void addHead(Object element);

    /**
     * Adds an element to the end of the list. Agrega un elemento al final de la
     * lista.
     *
     * @param element the element to be added / el elemento a agregar
     */
    void addEnd(Object element);

    /**
     * Adds an element to the list in sorted order. Agrega un elemento a la
     * lista en orden ordenado.
     *
     * @param element the element to be added / el elemento a agregar
     */
    void addSort(Object element);

    /**
     * Retrieves an element from the list by its position. Recupera un elemento
     * de la lista por su posición.
     *
     * @param n the position of the element / la posición del elemento
     * @return the node at the specified position / el nodo en la posición
     * especificada
     */
    Node getByPosition(int n);

    /**
     * Retrieves an element from the list by its value. Recupera un elemento de
     * la lista por su valor.
     *
     * @param element the value of the element / el valor del elemento
     * @return the node containing the specified value / el nodo que contiene el
     * valor especificado
     */
    Node getByValue(Object element);

    /**
     * Deletes an element from the list by its value. Elimina un elemento de la
     * lista por su valor.
     *
     * @param element the value of the element to be deleted / el valor del
     * elemento a eliminar
     * @return true if the element was successfully deleted, false otherwise /
     * verdadero si el elemento fue eliminado exitosamente, falso en caso
     * contrario
     */
    boolean delete(Object element);

    /**
     * Checks if an element exists in the list. Verifica si un elemento existe
     * en la lista.
     *
     * @param element the value of the element to check / el valor del elemento
     * a verificar
     * @return true if the element exists, false otherwise / verdadero si el
     * elemento existe, falso en caso contrario
     */
    boolean exists(Object element);

    /**
     * Retrieves the last element in the list. Recupera el último elemento de la
     * lista.
     *
     * @return the last element in the list / el último elemento de la lista
     */
    Object lastInList();

    /**
     * Retrieves the first element in the list. Recupera el primer elemento de
     * la lista.
     *
     * @return the first element in the list / el primer elemento de la lista
     */
    Object firstInList();
}
