package Caliper_Training.Inheritance;

class Animal {
   
    String name;
   public void eat() {
      System.out.println("I can eat");
    }
  }

  
class Dog extends Animal {
    //now I am creating a new method in subclass
    public void bark() {
      System.out.println("I can bark");
    }
  }

class SingleLevelExamples {
    public static void main(String[] args) {

        // I am creating an object of the subclass
        Dog labrador=new Dog();

        //now I am accessing fields of superclass
        labrador.name="Jupy";

        //here I am calling the method of superclass
        labrador.bark();

        //Now I am using the object of subclass
        labrador.eat();
        
    }

    
}
