package Constructors;
class Car{
    String brand;
    int year;

    // I am ccreating consructors with having two parameters
    public Car(String brand, int year){
        this.brand=brand;
        this.year=year;
        System.out.println("A new car is created: " + brand + " "+ year);    
    }

    //Now I am creating a method so that I can display the car details
    void displaying(){
        System.out.println("Car details: " + brand + " " + year);
    }
}

public class SuperCars {
    public static void main(String[] args) {
        
        //Now I am creating the objects of the car class using the constructor
        Car car1=new Car("Mercedes" , 2024);
        Car car2=new Car("Audi", 2023);

        // for displaying the car details
        car1.displaying();
        car2.displaying();
    }
    
}
