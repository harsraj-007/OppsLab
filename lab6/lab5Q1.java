import java.util.*;

class Student {
    String Student_name;
    int Student_roll;
    float Student_fee;

    Student(String Student_name, int Student_roll, float Student_fee) {
        this.Student_name = Student_name;
        this.Student_roll = Student_roll;
        this.Student_fee = Student_fee;

    }

    void Display() {
        System.out.println(this.Student_name + " " + this.Student_roll + " " + this.Student_fee);

    }

}

public class lab5Q1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = sc.next();

        System.out.println("Enter your roll_no: ");
        int roll_no = sc.nextInt();

        System.out.println("Enter your fees: ");
        float fees = sc.nextFloat();

        Student S1 = new Student(name, roll_no, fees);
        S1.Display();

        System.out.println("Enter your name: ");
        String name2 = sc.next();

        System.out.println("Enter your roll_no: ");
        int roll_no2 = sc.nextInt();

        System.out.println("Enter your fees: ");
        float fees2 = sc.nextFloat();

        Student S2 = new Student(name2, roll_no2, fees2);
        S2.Display();

    }
}