package Interface;

interface Drawable {
    void figure();
}

class Circle implements Drawable {
    public void figure() {
        System.out.println("Drawing a circle: ");
    }
}

class Rectangle implements Drawable {
    public void figure() {
        System.out.println("Drawing a rectangle: ");
    }
}

public class Ex2 {
    public static void main(String[] args) {
        Drawable draw1 = new Circle();
        Drawable draw2 = new Rectangle();
        draw1.figure();
        draw2.figure();
    }
    
}
