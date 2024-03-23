import java.util.*;

public class lab10_q4 {
    public static void Method1(int x) {
        if (x < 0) {
            throw new IllegalArgumentException("Age should be > 18");
        } else {
            System.out.println("Age is fine");
        }

    }

    public static void Method2() {
        try {
            Method1(-1);
        } catch (IllegalArgumentException e) {
            System.out.println("bhkkk " + e.getMessage());
            System.out.println(e.toString());
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Method2();
    }
}
