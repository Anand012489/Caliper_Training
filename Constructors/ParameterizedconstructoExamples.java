package Constructors;



class Student {
   
    String name;
    int age;
    String course;

    // here is the parameterized constructor with having 3 different parameters
    public Student(String studentName, int studentAge, String studentCourse) {
        name = studentName;
        age = studentAge;
        course = studentCourse;
    }

    // Now creating a method to display student details
    void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
        System.out.println("Student Course: " + course);
    }
}

public class ParameterizedconstructoExamples {
    public static void main(String[] args) {
        // Here I am now Creating a instance of Student with a parameterized constructor
        Student student1 = new Student("Alice", 20, "Computer Science");

        System.out.println("Details of Student 1:");
        student1.displayDetails();
        System.out.println();

        // here I am now Creating another instance of Student with a different set of values
        Student student2 = new Student("Bob", 22, "Electrical Engineering");

        // Displaying details of the second student
        System.out.println("Details of Student 2:");
        student2.displayDetails();
    }
}

