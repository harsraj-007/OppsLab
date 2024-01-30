
class Student{
    int student_roll;
    String student_name="Unknown";
    int student_marks[] = new int[5];

    Student(){
        // System.out.println(student_name);
        // System.out.println(student_roll);
        // for(int i=0; i<5; i++){
        //     System.out.print(student_marks[i]+" ");
        // }

    }

    Student(int student_marks[]){
        this.student_marks = student_marks; 

    }

}
public class Lab4P3 {
    public static void main(String[] args){
        Student S1 = new Student();

        S1.student_name="harsh";
        S1.student_roll=11;

        System.out.println(S1.student_name);
        System.out.println(S1.student_roll);
        

        int arr[] = {10,12,12,12,13};

        Student S2 = new Student(arr);

        for(int i=0; i<5; i++){
            System.out.print(S2.student_marks[i]+" ");
        }
        
    }    
}
