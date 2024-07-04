
package Stack;

/**
 * Custom exception class for stack operations.
 * Clase de excepción personalizada para operaciones de pila.
 */
public class StackException extends Exception {

    /**
     * Constructs a new StackException with the specified detail message.
     * Construye una nueva StackException con el mensaje de detalle especificado.
     * 
     * @param message the detail message / el mensaje de detalle.
     */
    public StackException(String message) {
        super(message);
    }
}

