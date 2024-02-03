package I.IOStreams;
import java.io.*;

public class SerializingObject {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Person person = new Person("Anand Raj", 22);

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("person.ser"));
        objectOutputStream.writeObject(person);
        objectOutputStream.close();

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("person.ser"));
        Person deserializedPerson = (Person) objectInputStream.readObject();
        objectInputStream.close();

        System.out.println("Deserialized Person: " + deserializedPerson);
    }
}

class Person implements Serializable {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';  
    }
    
}
