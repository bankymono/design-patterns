package command;

public class GarageDoor {
    String location;

    public GarageDoor(String location) {
        this.location = location;
    }
    public void up(){
        System.out.println(location + "Garage Door is Up!");
    }

    public void down(){
        System.out.println(location + " Garage Door is Down!");
    }

    public void stop() {
        System.out.println(location + " Garage Door has stopped!");
    }

    public void lightOn() {
        System.out.println(location + " Garage Light is on!");
    }

    public void lightOff() {
        System.out.println(location + " Garage Light is off!");
    }
}
