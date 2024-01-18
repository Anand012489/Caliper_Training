package Caliper_Training.Inheritance;

class Shape {
    String color;
    public void setColor(String color) {
      this.color = color;
    }
}
 class Circle extends Shape {
        double radius;
        public double area() {
          return Math.PI * radius * radius;
        }
      }

class Square extends Shape {
        double side;
        public double area() {
          return side * side;
        }
      }

public class HeirarchicalExample {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Square square = new Square();

        // here i am seting the fields of the subclasses
        circle.radius = 5;
        circle.setColor("red");
        square.side = 10;
        square.setColor("blue");
        
        // now i am calling the methods of the subclasses
        System.out.println("The area of the circle is " + circle.area());
        System.out.println("The color of the circle is " + circle.color);
        System.out.println("The area of the square is " + square.area());
        System.out.println("The color of the square is " + square.color);   
    }
    
}
