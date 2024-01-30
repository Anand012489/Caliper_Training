package Interface;

interface RemoteControl {
    void turnOn();
    void turnOff();
    void setChannel(int channel);
    void setVolume(int volume);
}

class TV implements RemoteControl {
    public void turnOn() {
        System.out.println("Turning on the TV ");
    }
    public void turnOff() {
        System.out.println("Turning off the TV ");
    }
    public void setChannel(int channel) {
        System.out.println("Setting the TV channel to " + channel + ".");
    }
    public void setVolume(int volume) {
        System.out.println("Setting the TV volume to " + volume + ".");
    }
}

class DVDPlayer implements RemoteControl {
    public void turnOn() {
        System.out.println("Turning on the DVD player ");
    }
    public void turnOff() {
        System.out.println("Turning off the DVD player ");
    }
    public void setChannel(int channel) {
        System.out.println("This operation is not supported by the DVD player ");
    }
    public void setVolume(int volume) {
        System.out.println("This operation is not supported by the DVD player ");
    }
}

class SoundSystem implements RemoteControl {
    public void turnOn() {
        System.out.println("Turning on the sound system ");
    }
    public void turnOff() {
        System.out.println("Turning off the sound system ");
    }
    public void setChannel(int channel) {
        System.out.println("This operation is not supported by the sound system ");
    }
    public void setVolume(int volume) {
        System.out.println("Setting the sound system volume to " + volume + ".");
    }
}

public class RemoteControlExamle{
    public static void main(String[] args) {
        RemoteControl remote1 = new TV();
        RemoteControl remote2 = new DVDPlayer();
        RemoteControl remote3 = new SoundSystem();
        remote1.turnOn();
        remote1.setChannel(7);
        remote1.setVolume(18);
        remote1.turnOff();
        remote2.turnOn();
        remote2.turnOff();
        remote3.turnOn();
        remote3.setVolume(22);
        remote3.turnOff();
        
    }
    
}