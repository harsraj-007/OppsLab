import java.util.*;

class Autoboxing {

    int num = 10;
    Integer NUM = num;

    Autoboxing() {
        System.out.println(NUM);

    }
}

class Unboxing {

    Integer num1 = Integer.valueOf(20);

    int num2 = num1;

    Unboxing() {
        System.out.println(num2);
    }

}

public class lab5Q5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Autoboxing A1 = new Autoboxing();
        Unboxing U1 = new Unboxing();

    }
}
