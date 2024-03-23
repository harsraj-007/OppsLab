import java.util.*;

public class lab10_q1 {
    public void finalize() {
        System.out.println("Object collected");
    }

    public static void main(String[] args) {
        lab10_q1 m1 = new lab10_q1();
        lab10_q1 m2 = new lab10_q1();
        m1 = m2;
        m1 = null;
        // m2 = null;

        System.gc();
        System.out.println(m2);
    }
}