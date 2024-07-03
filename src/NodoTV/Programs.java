package NodoTV;

import java.time.LocalDateTime;

public class Programs {
    private String programName;
    private String programInformation;
    private int durationMinutes;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private String imagePath;
    private String genre;
    private boolean parentalControl;

    // Constructor para inicializar un objeto Programs
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

    public Programs(String programName, String programInformation, int durationMinutes, LocalDateTime startTime, LocalDateTime endTime, boolean parentalControl) {
        this.programName = programName;
        this.programInformation = programInformation;
        this.durationMinutes = durationMinutes;
        this.startTime = startTime;
        this.endTime = endTime;
        this.parentalControl = parentalControl;
    }
    

    // Getters y Setters para acceder y modificar los campos privados

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
