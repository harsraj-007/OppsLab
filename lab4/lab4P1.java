import java.util.*;

class Parent {

    void showparent() {
        System.out.println("Parent class");
    }
}

class Child extends Parent {

    void showChild() {
        System.out.println("Child class");
    }
}

public class lab4P1 {
    public static void main(String[] args) {
        Child C1 = new Child();
        C1.showChild();
        C1.showparent();
        ;
    }
}