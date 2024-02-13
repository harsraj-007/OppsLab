import java.util.*;

class Shape {
    void getArea() {
        System.out.println("Area of the shape");
    }
}

class Rectangle extends Shape {
    float length;
    float width;

    Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    void getArea() {
        System.out.println("area of rectangle: " + length * width);
    }
}

class box extends Rectangle {
    float height;

    box(float height) {
        this.height = height;
    }

    void getArea() {
        System.out.println("area of box: " + length * width * height);
    }
}

public class lab5Q7 {
    public static void main(String[] args) {
        Shape S1 = new Shape();
        Rectangle R1 = new Rectangle(10, 20);
        box B1 = new box(10);

        S1.getArea();
        R1.getArea();
        B1.getArea();

    }
}
