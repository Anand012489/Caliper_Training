package Caliper_Training.Inheritance;

class Circle {
    public int radius;
Circle(){
    System.out.println("I am non param of circle");
}
    Circle(int r){
        System.out.println("I am a parameterized constructor");
        radius=r;
    }
    public double area(){
        return Math.PI*radius*radius;

    }
}

class Cylinder extends Circle{

public int height;

Cylinder(int r,int h){
    super(r); // parent constructor will run
    System.out.println("I am cylinder parametrized constructor");
height=h;
}    

public double volume(){
    return Math.PI*radius*radius*height;

}
}


public class CirclExample{
    public static void main(String[] args) {
        Circle obj=new Circle(12);
        //Cylinder obj = new Cylinder(12, 4);
        
    }
 }