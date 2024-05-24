package NodeTv;

import java.time.LocalDateTime;
import static java.time.LocalDateTime.now;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Rene y yendry
 */
public class Programs {

    private String programName;
    private String programInformation;
    private int durationMinutes;
    private LocalDateTime startTime;
    private LocalDateTime endTime;

    public Programs(String programName, String programInformation,
            int durationMinutes, LocalDateTime startTime,
            LocalDateTime endTime) {
        this.programName = programName;
        this.programInformation = programInformation;
        this.durationMinutes = durationMinutes;
        this.startTime = startTime;
        this.endTime = endTime;

    }

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

    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        Programs p = new Programs("Doki", "Un perro y sus aventuras alocadas",
                45, now, now.plusMinutes(45));
        System.out.println(p);

    }

}
