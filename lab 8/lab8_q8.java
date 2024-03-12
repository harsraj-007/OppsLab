interface Test {
    int n = 0;

    default void display1() {
        System.out.println("In Display1");
    }

    static void display2() {
        System.out.println("In Display2");
    }
}

class Test1 implements Test {

}

public class lab8_q8 {
    public static void main(String[] args) {
        Test.display2();
        Test1 T1 = new Test1();
        T1.display1();

    }
}
