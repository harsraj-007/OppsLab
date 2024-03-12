abstract class Shape {
    abstract void perimeter();

    abstract void area();

}

class Circle extends Shape {
    float radius;

    Circle(float radius) {
        this.radius = radius;
    }

    void perimeter() {
        System.out.println(2 * 3.14 * radius);
    }

    void area() {
        System.out.println(3.14 * radius * radius);
    }

}

class Rectangle extends Shape {
    float length, breadth;

    Rectangle(float length, float breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    void perimeter() {
        System.out.println(2 * (length + breadth));
    }

    void area() {
        System.out.println(length * breadth);
    }
}

public class lab8_q3 {
    public static void main(String[] args) {
        Shape C1 = new Circle(10);
        C1.perimeter();
        C1.area();

        Shape R1 = new Rectangle(10, 20);
        R1.perimeter();
        R1.area();

    }
}
