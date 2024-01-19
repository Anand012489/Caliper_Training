package Polymorphism;

interface Animal {
    public void eat();

    public void sleep();
}

class Dog implements Animal {
    public void eat() {
        System.out.println("The dog is eating.");
    }

    public void sleep() {
        System.out.println("The dog is sleeping.");
    }
}

public class Ex1 {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.eat();
        animal.sleep();
    }
}
