 
package NodeTv;


import java.util.ArrayList;

/**
 *
 * @author Rene y yendry
 *
 */



public class Channel {

    private int channel;
    private ArrayList<Programs> Programming;
    private int numberOfPrograms;

    public Channel(int channel, ArrayList<Programs> Programming, int numberOfPrograms) {
        this.channel = channel;
        this.Programming = Programming;
        this.numberOfPrograms = numberOfPrograms;
        
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public ArrayList<Programs> getProgramming() {
        return Programming;
    }

    public void setProgramming(ArrayList<Programs> Programming) {
        this.Programming = Programming;
    }

    public int getnumberOfPrograms() {
        return numberOfPrograms;
    }

    public void setnumberOfPrograms(int numberOfPrograms) {
        this.numberOfPrograms = numberOfPrograms;
    }
    



}

