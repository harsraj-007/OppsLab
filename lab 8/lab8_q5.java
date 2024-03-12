abstract class Base1 {
    abstract class Base2 {
        abstract void Display();
    }
}

class Derived1 extends Base1 {
    class Derived2 extends Base2 {
        void Display() {
            System.out.println("In Display");
        }
    }
}

public class lab8_q5 {
    public static void main(String[] args) {

        Derived1 D1 = new Derived1();
        Derived1.Derived2 D12 = D1.new Derived2();
        D12.Display();
    }
}
