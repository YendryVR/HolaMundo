package NodeTv;

import java.util.ArrayList;

/**
 * Class representing a television channel with its programming information.
 * Clase que representa un canal de televisión con información sobre su programación.
 */
public class Channel {

    private int channel; // Channel number / Número del canal
    private ArrayList<Programs> programming; // List of programs scheduled for the channel / Lista de programas programados para el canal
    private int numberOfPrograms; // Number of programs scheduled / Número de programas programados

    /**
     * Constructor to initialize a Channel object.
     * Constructor para inicializar un objeto Canal.
     *
     * @param channel           The channel number / Número del canal
     * @param programming       List of programs scheduled for the channel / Lista de programas programados para el canal
     * @param numberOfPrograms  Number of programs scheduled / Número de programas programados
     */
    public Channel(int channel, ArrayList<Programs> Programming, int numberOfPrograms) {
        this.channel = channel;
        this.programming = Programming;
        this.numberOfPrograms = numberOfPrograms;

    }
 // Getter and Setter methods / Métodos Getter y Setter
    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public ArrayList<Programs> getProgramming() {
        return programming;
    }

    public void setProgramming(ArrayList<Programs> Programming) {
        this.programming = Programming;
    }

    public int getnumberOfPrograms() {
        return numberOfPrograms;
    }

    public void setnumberOfPrograms(int numberOfPrograms) {
        this.numberOfPrograms = numberOfPrograms;
    }

}
