import java.util.*;

class Circle {
    double radius;
    double arr;

    Circle(double radius) {
        this.radius = radius;
    }

    void area() {
        arr = 3.14 * radius * radius;
        System.out.println("Area of radius: " + 3.14 * radius * radius);
    }

    void circumference() {
        System.out.println("Circumference: " + 2 * 3.14 * radius);
    }
}

class Cylinder extends Circle {
    double heigth;

    Cylinder(double heigth) {
        super(3);
        this.heigth = heigth;
        super.area();
    }

    void volume() {

        System.out.println("Volume of cylinder: " + arr * heigth);

        area();
    }

    void area() {
        System.out.println("Area of cylinder: " + 2 * 3.14 * radius * heigth + 2 * (arr));
    }

}

public class lab7_q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Circle C1 = new Circle(3);
        Cylinder Cy1 = new Cylinder(10);

        C1.area();
        C1.circumference();

        Cy1.volume();

    }
}
