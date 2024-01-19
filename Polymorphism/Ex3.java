package Polymorphism;

class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound");
    }
}

class Dog extends Animal {
    public void makeSound() {
        System.out.println("The dog barks");
    }
}

class Cat extends Animal {
    public void makeSound() {
        System.out.println("The cat meows");
    }
}

public class Ex3 {
    public static void main(String[] args) {
        
        Animal d1 = new Dog();
        d1.makeSound();

        Animal c1 = new Cat();
        c1.makeSound();
    }
    
}
