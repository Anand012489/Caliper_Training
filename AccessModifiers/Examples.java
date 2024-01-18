package Caliper_Training.AccessModifiers;

class ExPublic {
    public void getA() {
        Examples examples = new Examples();
        examples.a = 10;
        // now her what happens that, public variables can be used from anywhere.
    }
}

class ExPrivate {
    public void cannotGetB() {
        Examples examples = new Examples();
        /*
         * here we can not use examples.b because we have used private access modifier
         * and the field examples.b will be not visible here
         */
    }
}

class ExProtected {
    public void getProtected() {
        Examples examples = new Examples();
        examples.c = 10; /*
                          * In this access modifier, it will be visible here but it will be not visible
                          * to the outside world
                          */

    }
}

class ExDefault {
    public void getDefault() {
        Examples examples = new Examples();
        examples.d = 10; /*
                          * As the name itself says it is default access modifier and this will be
                          * visible in the same package
                          */
    }
}

public class Examples {
    public int a = 0;
    private int b = 0;
    protected int c = 0;
    int d = 0;

    public static void main(String[] args) {
        new ExPublic().getA();
        new ExPrivate().cannotGetB();
        new ExProtected().getProtected();
        new ExDefault().getDefault();
    }

}
