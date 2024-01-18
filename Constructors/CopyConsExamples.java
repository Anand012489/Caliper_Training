package Constructors;

class Student {
    String name;
    int age;

    // we have taken 2 paramters inside the constructor again
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // now I am creating a Copy constructor of the above constructor
    public Student(Student original) {
        this.name = original.name;
        this.age = original.age;
    }

    // here I am creating a method to display student details
    public void displayDetails() {
        System.out.println("Student Details: Name - " + name + ", Age - " + age);
    }
}

public class CopyConsExamples {
    public static void main(String[] args) {
        Student student1 = new Student("Anand-Raj", 22);

        Student student2 = new Student(student1);

        System.out.println("Original Student:");
        student1.displayDetails();

        System.out.println("\nCopied Student:");
        student2.displayDetails();
    }
}

