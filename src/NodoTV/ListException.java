package NodoTV;

/**
 * Custom exception for list operations.
 * Excepción personalizada para operaciones de lista.
 */
public class ListException extends RuntimeException {

    /**
     * Constructs a ListException with the specified error message.
     * Construye una ListException con el mensaje de error especificado.
     *
     * @param error Error message / Mensaje de error
     */
    public ListException(String error) {
        super(error);
    }
    
}
