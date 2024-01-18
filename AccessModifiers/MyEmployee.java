package Caliper_Training.AccessModifiers;
//Private access modifiers 

class MyOrga {
    private int id;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public int getId() {

        return id;
    }

    public void setId(int i) {
        id = i;
    }
}

public class MyEmployee {
    public static void main(String[] args) {
        MyOrga anand = new MyOrga();

        anand.setName("Welcome to Anand Code");
        System.out.println(anand.getName());

        anand.setId(43);
        System.out.println(anand.getId());

    }

}
