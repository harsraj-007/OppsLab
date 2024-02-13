import java.util.*;

class Bike {

    Bike() {
        System.out.println("this is a bike");
    }

    Bike bikeCall() {
        return this;
    }
}

public class lab5Q4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Bike B1 = new Bike();
        // B1.bikeCall();

    }
}
