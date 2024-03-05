import java.util.*;

class Shape {
    void getArea() {
        System.out.println("Area of Shape");
    }
}

class Rectangle extends Shape {
    int length;
    int width;

    Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    void getArea() {
        System.out.println("Area of Rectangle: " + length * width);
    }
}

class Box extends Rectangle {
    int height;

    Box(int heigth) {
        super(10, 20);
        this.height = heigth;
    }

    void getArea() {
        System.out.println("Area pf Box: " + length * width * height);
    }

}

public class lab7_q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Shape S1 = new Shape();
        Rectangle R1 = new Rectangle(10, 30);
        Box B1 = new Box(20);

        S1.getArea();
        R1.getArea();
        B1.getArea();

    }

}
