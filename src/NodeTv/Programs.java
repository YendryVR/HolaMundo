package NodeTv;

import java.time.LocalDateTime;
import static java.time.LocalDateTime.now;
import java.time.format.DateTimeFormatter;

/**
 
 * Class representing a television program.
 * Clase que representa un programa de televisión.
 *
 * @author Rene y yendry
 */
public class Programs {

    private String programName;          // Name of the program / Nombre del programa
    private String programInformation;   // Information or description about the program / Información o descripción sobre el programa
    private int durationMinutes;         // Duration of the program in minutes / Duración del programa en minutos
    private LocalDateTime startTime;     // Start time of the program / Hora de inicio del programa
    private LocalDateTime endTime;       // End time of the program / Hora de finalización del programa

    /**
     * Constructor to initialize a television program.
     * Constructor para inicializar un programa de televisión.
     *
     * @param programName Name of the program / Nombre del programa
     * @param programInformation Information or description about the program / Información o descripción sobre el programa
     * @param durationMinutes Duration of the program in minutes / Duración del programa en minutos
     * @param startTime Start time of the program / Hora de inicio del programa
    * @param endTime End time of the program / Hora de finalización del programa
     */
    public Programs(String programName, String programInformation,
            int durationMinutes, LocalDateTime startTime,
            LocalDateTime endTime) {
        this.programName = programName;
        this.programInformation = programInformation;
        this.durationMinutes = durationMinutes;
        this.startTime = startTime;
        this.endTime = endTime;

    }
 // Getter and Setter methods / Métodos Getter y Setter
    public String getProgramName() {
        return programName;
    }

    public void setProgramName(String programName) {
        this.programName = programName;
    }

    public String getProgramInformation() {
        return programInformation;
    }

    public void setProgramInformation(String programInformation) {
        this.programInformation = programInformation;
    }

    public int getDurationMinutes() {
        return durationMinutes;
    }

    public void setDurationMinutes(int durationMinutes) {
        this.durationMinutes = durationMinutes;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }
 /**
     * Returns a string representation of the program including its details.
     * Devuelve una representación en cadena del programa incluyendo sus detalles.
     *
     * @return String representation of the program / Representación en cadena del programa
     */
    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        String formattedStartTime = startTime.format(formatter);
        String formattedEndTime = endTime.format(formatter);

        return String.format("Program: %s\n"
                + "Description: %s\n"
                + "Duration: %d minutes\n"
                + "Start Time: %s\n"
                + "End Time: %s",
                programName, programInformation, durationMinutes,
                formattedStartTime, formattedEndTime);
    }
/**
     * Main method for testing the Programs class.
     * Método principal para probar la clase Programs.
     *
     * @param args Command-line arguments / Argumentos de línea de comandos
     */
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        Programs p = new Programs("Doki", "Un perro y sus aventuras alocadas",
                45, now, now.plusMinutes(45));
        System.out.println(p);

    }

}
