import java.util.*;

abstract class Bike {
    abstract void run();
}

class Honda extends Bike {
    void run() {
        System.out.println("Bike runs at 60km/hr");
    }
}

public class lab8_q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bike B1 = new Honda();
        B1.run();
    }
}
