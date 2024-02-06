import java.util.*;

class Student {
    void StudentClass() {
        System.out.println("I am a Student");

    }
}

class CSE extends Student {
    void StudentClass() {
        System.out.println("I am a CSE Student");

    }

}

class CSEAI extends Student {
    void StudentClass() {
        System.out.println("I am a CSE AI Student");

    }

}

public class lab4P3 {
    public static void main(String[] args) {
        Student C1 = new Student();
        C1.StudentClass();

        CSE cse1 = new CSE();
        cse1.StudentClass();

        CSEAI cseai1 = new CSEAI();
        cseai1.StudentClass();

    }
}
