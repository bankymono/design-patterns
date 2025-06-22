package command;

public class Stereo {
    String location;

    public Stereo(String location) {
        this.location = location;
    }

    String cd;
    String dvd;
    String radio;
    Integer volume;

    public Stereo() {
        this.cd = "";
        this.dvd = "";
        this.radio = "";
        this.volume = 0;
    }

    public void on(){
        System.out.println(location + " Light is On!");
    }

    public void off() {
        System.out.println(location + " Stereo is Off!");
    }

    public void setCd() {
        cd = "CD set";
    }

    public void setDvd() {
        dvd = "DVD set";
    }

    public void setRadio() {
        radio = "Radio set";
    }

    public void setVolume(int vol) {
        volume = vol;
    }
}
