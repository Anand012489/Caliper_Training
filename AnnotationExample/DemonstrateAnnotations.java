package AnnotationExample;

class DemonstrateAnnotations {
    
    // Here is a Method named display()
    public void display()
    {
        System.out.println("Base display()");
    }
}
// Class 2
// Main class
class Derived extends DemonstrateAnnotations {
   
    // In this I am Overriding the method as already up in above class
    @Override public void display(int x)
    {
        // Here I am Printing statement when this method is called
        System.out.println("Derived display(int )");
    }
 
    // this is Method 2
    // Main driver method
    public static void main(String args[])
    {
        // Now I am Creating object of this class inside main()
        Derived obj = new Derived();
 
        // Here I am Calling display() method inside main()
        obj.display();
    }
}
