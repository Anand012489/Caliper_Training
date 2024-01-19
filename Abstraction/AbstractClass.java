package Abstraction;

//I am creating abstract class here
abstract class Animal{

    Animal(){
        System.out.println("Animal constructor is called");
    }
            //now I am creating here non abstract method
            void eat(){
                System.out.println("ANimal eats");
            }
            //now I am creating abstract methods
            abstract void walk();
}

class Horse extends Animal{

    Horse(){
        System.out.println("Horse constructor is called");
    }
    void walk(){
        System.out.println("Horse walks on four legs");
    }
}

class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang constructor");
    }
}

class Chicken extends Animal{
    void walk(){
        System.out.println("Walks on two legs");
    }
}
public class AbstractClass {
    public static void main(String[] args) {
        //Calling of horse 
        /*Horse h=new Horse();
        h.eat();
        h.walk();
  
        //Calling of chicken
        Chicken c=new Chicken();
        c.eat();
        c.walk(); */

        Mustang myHorse=new Mustang();
        //Animal-> Horse-> Mustang(Hirearchy of calling constructor in abstract method)
    }
    
}
