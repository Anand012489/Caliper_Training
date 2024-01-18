package Caliper_Training.Inheritance;

interface Phone {
    void call();
}

interface Computer {
    void browse();
}

class Smartphone implements Phone, Computer {
    public void call() {
        System.out.println("Calling someone");
    }

    public void browse() {
        System.out.println("Browsing the internet");
    }
}

// here android inherit from Smartphone class
class Android extends Smartphone {
    public void playStore() {
        System.out.println("Accessing the Play Store");
    }
}

// now iphone will inherit from Smartphone class
class iPhone extends Smartphone {
    public void appStore() {
        System.out.println("Accessing the App Store");
    }
}

public class HybridExample {
    public static void main(String[] args) {

        // Here I am creating objects of the subclasses
        Android android = new Android();
        iPhone iphone = new iPhone();

        // Now i am calling the methods of the superclasses and subclasses
        android.call();
        android.browse();
        android.playStore();
        iphone.call();
        iphone.browse();
        iphone.appStore();
    }
}
