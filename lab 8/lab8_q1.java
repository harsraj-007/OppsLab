class Outer {
    void displayOuter() {
        System.out.println("In outer Display");

        class Inner {
            void displayInner() {
                System.out.println("In inner display");
            }
        }
        Inner in = new Inner();
        in.displayInner();
    }

    static class staticInner {
        static void displayStaticInner() {
            System.out.println("In static Inner Method");
        }
    }
}

public class lab8_q1 {
    public static void main(String[] args) {
        Outer out = new Outer();
        out.displayOuter();
        // Outer.Inner outin = new Outer.Inner();
        // Outer.Inner outin = out.new Inner();
        Outer.staticInner.displayStaticInner();

    }
}