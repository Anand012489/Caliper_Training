package Caliper_Training.Inheritance;

class Father{
    public int x;

    public int getX(){
        return x;
    }
    public void setX(int x){
        System.out.println("i am a base and setting x now");
        x=x;
    }

    public void printMe(){
        System.out.println("Hello, I am Constructor here");

    }
}

//Here I used extends keyword to inherit the properties of class Base
class Son extends Father{
    public int y;

    public int getY(){
        return y;
    }
    public void setY(int y){
        y = y;
    }

}


public class FatherSon {
    public static void main(String[] args) {

        //Creating object of Base Class
        Father b=new Father();
        b.setX(4);
        System.out.println(b.getX());

        //Creating object of derieved Class
        Son d= new Son();
        d.setX(5);
        System.out.println(d.getX());

    }
    
}
