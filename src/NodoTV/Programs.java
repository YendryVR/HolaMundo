package NodoTV;

import java.time.LocalDateTime;
/**
 * Represents a television program.
 * Representa un programa de televisión.
 */
public class Programs {
       private String programName;         // Program name / Nombre del programa
    private String programInformation;  // Program information / Información del programa
    private int durationMinutes;        // Duration in minutes / Duración en minutos
    private LocalDateTime startTime;    // Start time / Hora de inicio
    private LocalDateTime endTime;      // End time / Hora de finalización
    private String imagePath;           // Image path / Ruta de la imagen
    private String genre;               // Program genre / Género del programa
    private boolean parentalControl;    // Parental control / Control parental

    /**
     * Constructor to initialize a program with all details.
     * Constructor para inicializar un programa con todos los detalles.
     *
     * @param programName         Program name / Nombre del programa
     * @param programInformation  Program information / Información del programa
     * @param durationMinutes     Duration in minutes / Duración en minutos
     * @param startTime           Start time / Hora de inicio
     * @param endTime             End time / Hora de finalización
     * @param imagePath           Image path / Ruta de la imagen
     * @param genre               Program genre / Género del programa
     * @param parentalControl     Parental control / Control parental
     */
    
    public Programs(String programName, String programInformation, int durationMinutes,
                    LocalDateTime startTime, LocalDateTime endTime, String imagePath,
                    String genre, boolean parentalControl) {
        this.programName = programName;
        this.programInformation = programInformation;
        this.durationMinutes = durationMinutes;
        this.startTime = startTime;
        this.endTime = endTime;
        this.imagePath = imagePath;
        this.genre = genre;
        this.parentalControl = parentalControl;
    }
/**
     * Constructor to initialize a program without image path.
     * Constructor para inicializar un programa sin ruta de imagen.
     *
     * @param programName         Program name / Nombre del programa
     * @param programInformation  Program information / Información del programa
     * @param durationMinutes     Duration in minutes / Duración en minutos
     * @param startTime           Start time / Hora de inicio
     * @param endTime             End time / Hora de finalización
     * @param parentalControl     Parental control / Control parental
     */
    public Programs(String programName, String programInformation, int durationMinutes, LocalDateTime startTime, LocalDateTime endTime, boolean parentalControl) {
        this.programName = programName;
        this.programInformation = programInformation;
        this.durationMinutes = durationMinutes;
        this.startTime = startTime;
        this.endTime = endTime;
        this.parentalControl = parentalControl;
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

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public boolean isParentalControl() {
        return parentalControl;
    }

    public void setParentalControl(boolean parentalControl) {
        this.parentalControl = parentalControl;
    }

    @Override
    public String toString() {
        return "Program: " + programName + "\n" +
               "Description: " + programInformation + "\n" +
               "Duration: " + durationMinutes + " minutes\n" +
               "Start Time: " + startTime + "\n" +
               "End Time: " + endTime + "\n" +
               "Genre: " + genre + "\n" +
               "Image Path: " + imagePath + "\n";
    }
}
