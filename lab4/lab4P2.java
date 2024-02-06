import java.*;

class Bird {

    void fly() {
        System.out.println("Bird flys");
    }

}

class Parrot extends Bird {
    void showColor() {
        System.out.println("Color is green");
    }

}

class Crow extends Bird {
    void showColor() {
        System.out.println("Color is black:");
    }
}

public class lab4P2 {
    public static void main(String[] args) {

        Parrot P1 = new Parrot();
        Crow C1 = new Crow();

        P1.showColor();
        P1.fly();

        C1.showColor();
        C1.fly();

    }
}
