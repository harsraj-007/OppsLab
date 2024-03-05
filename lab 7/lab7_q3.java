import java.util.*;

class Rectangle {
    int length;
    int breadth;

    Rectangle() {
        length = 1;
        breadth = 1;
    }

    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
}

class Cuboid extends Rectangle {
    int heigth;

    Cuboid() {
        super(1, 2);
        heigth = 1;
    }

    Cuboid(int heigth) {
        super(1, 2);
        this.heigth = heigth;
    }

    void volume() {
        System.out.println("Volume of Cuboid: " + (length * breadth * heigth));
    }
}

public class lab7_q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Rectangle R1 = new Rectangle();

        Cuboid C1 = new Cuboid();

        C1.volume();

    }
}
