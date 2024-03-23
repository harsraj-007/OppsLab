class Employee {
    private int ID;
    private String name;
    private int age;
    static int nextId = 1;

    Employee(String name, int age) {
        this.name = name;
        this.age = age;
        this.ID = nextId++;
    }

    void show() {
        System.out.println(this.name + " " + this.age + " " + this.ID);
    }

    void showNextId() {
        System.out.println("Next Employee ID should be: " + (ID + 1));
    }
}

public class lab10_q2 {
    public void finalize() {
        System.out.println("Object deleted");

    }

    public static void main(String[] args) {
        Employee A = new Employee("A11", 18);
        Employee B = new Employee("A12", 22);
        Employee C = new Employee("A13", 30);

        A.show();
        B.show();
        B.showNextId();
        C.show();

        {
            Employee X = new Employee("X11", 19);
            Employee Y = new Employee("X12", 20);
            X.show();
            Y.show();
            // System.out.println(nextId);
            X = null;
            Y = null;
            System.gc();

        }

    }
}
