interface Person {
    void Method1();

    void Method2();

    static void Nationality() {
        System.out.println("Indian");

    }

    static String name = "Harsh";
}

class Employee implements Person {
    public void Method1() {
        System.out.println("In method 1");
    }

    public void Method2() {
        System.out.println("In method 2");
    }
}

public class lab8_q4 {
    public static void main(String[] args) {
        Person.Nationality();
        System.out.println(Person.name);
        Employee P1 = new Employee();
        P1.Method1();
        P1.Method2();

    }
}
