/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Archive;

/**
 * This class represents a custom exception for list operations.
 *
 * Esta clase representa una excepción personalizada para las operaciones de
 * listas.
 *
 * @autor Yendry VR
 */
public class ListException extends RuntimeException {

    /**
     * Constructor to create a ListException with a specific error message.
     * Constructor para crear una ListException con un mensaje de error
     * específico.
     *
     * @param error the error message / el mensaje de error
     */
    public ListException(String error) {
        super(error);
    }
}
