package Caliper_Training.Inheritance;
class Animal {
    
    String name;
    public void eat() {
      System.out.println("I can eat");
    }
  }
  class Bird extends Animal {
    // here i am creating new method in subclass
    public void fly() {
      System.out.println("I can fly");
    }
  }
  class Penguin extends Bird /* here i have inherited it from bird class*/{
    
    // here again i am creating new method in subclass
    public void swim() {
      System.out.println("I can swim");
    }
  }

public class MultilevelExamples {
    public static void main(String[] args) {
        Penguin pingu = new Penguin();
         pingu.name = "Pingu";
          pingu.swim();
             pingu.fly();
        pingu.eat();
      }
    
}
