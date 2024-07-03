package NodoTV;

import NodoTv.*;
import Stack.StackException;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear un gestor de programas con un máximo de programas por canal
        ProgramsManager manager = new ProgramsManager(10);

        // Agregar canales
        manager.addChannel("Channel1");
        manager.addChannel("Channel2");

        // Ejemplo de programas
        Programs program1 = new Programs("Program 1", "Description 1", 30,
                LocalDateTime.of(2024, 7, 2, 18, 0),
                LocalDateTime.of(2024, 7, 2, 18, 30),
                "path/to/image1.jpg", "Genre 1", false);

        Programs program2 = new Programs("Program 2", "Description 2", 45,
                LocalDateTime.of(2024, 7, 2, 19, 0),
                LocalDateTime.of(2024, 7, 2, 19, 45),
                "path/to/image2.jpg", "Genre 2", true);

        Programs program3 = new Programs("Program 3", "Description 3", 60,
                LocalDateTime.of(2024, 7, 2, 20, 0),
                LocalDateTime.of(2024, 7, 2, 21, 0),
                "path/to/image3.jpg", "Genre 1", false);

        try {
            // Agregar programas a los canales
            manager.addProgram("Channel1", program1);
            manager.addProgram("Channel1", program2);
            manager.addProgram("Channel2", program3);

            // Imprimir programas por canal
            System.out.println("Programas en Channel1:");
            manager.printProgramsByChannel("Channel1");

            System.out.println("Programas en Channel2:");
            manager.printProgramsByChannel("Channel2");

            // Mover programas
            manager.moveProgramLeft("Channel1", program2);
            manager.moveProgramRight("Channel2", program3);

            // Imprimir programas después de moverlos
            System.out.println("Programas en Channel1 después de mover 'Program 2' a la izquierda:");
            manager.printProgramsByChannel("Channel1");

            System.out.println("Programas en Channel2 después de mover 'Program 3' a la derecha:");
            manager.printProgramsByChannel("Channel2");

        } catch (StackException e) {
            System.err.println("Error en la operación de la pila: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
