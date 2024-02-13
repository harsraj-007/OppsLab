import java.util.*;

class Student1 {
    String Student_name;
    int Student_roll;
    float Student_fee;

    Student1(String Student_name, int Student_roll, float Student_fee) {
        this.Student_name = Student_name;
        this.Student_roll = Student_roll;
        this.Student_fee = Student_fee;

    }

    Student1() {

        this("abcd", 12, 1309.0f);

    }

    void Display() {
        show(this);
        System.out.println(this.Student_name + " " + this.Student_roll + " " + this.Student_fee);

    }

    void show(Student1 s) {
        System.out.println("calling show function");
    }
}

public class lab5Q2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.next();

        System.out.println("Enter your roll_no: ");
        int roll_no = sc.nextInt();

        System.out.println("Enter your fees: ");
        float fees = sc.nextFloat();

        Student1 S1 = new Student1(name, roll_no, fees);
        S1.Display();

        Student1 S2 = new Student1();
        S2.Display();

    }

}