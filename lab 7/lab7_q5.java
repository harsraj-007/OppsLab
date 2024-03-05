class Base {
    void display() {
        System.out.println("This is the base class");
    }

    void show() {
        System.out.println("this is the show fn of base class");
    }
}

class Derived extends Base {
    void display() {
        System.out.println("This is the Derived class");
    }

}

public class lab7_q5 {
    public static void main(String[] args) {
        Base B1 = new Derived();

        B1.display();

        B1.show();
    }
}
