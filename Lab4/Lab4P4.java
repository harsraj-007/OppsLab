

class Student{
    int student_roll;
    String student_name;
    int student_marks[] = new int[5];

    Student(String student_name,int student_roll,int student_marks[]){
        this.student_marks=student_marks;
        this.student_name=student_name;
        this.student_roll=student_roll;
    }

    float avg(int student_marks[]){
        int total=0;
        for(int i=0;i<5;i++){
            total += student_marks[i];
        }
        return total/5;
    }
}
public class Lab4P4 {

    public static void main(String[] args){

        float total;

    int marks1[] = {40,50,60,70,80};
    Student S1 = new Student("harsh",11,marks1);

    int marks2[] = {70,50,60,70,80};
    Student S2 = new Student("abhinav",19,marks2);

    int marks3[] = {80,50,60,70,80};
    Student S3 = new Student("yash",50,marks2);


    System.out.println("Average marks of "+S1.student_name +" Roll-"+S1.student_roll +" "+S1.avg(marks1));
    
    System.out.println("Average marks of "+S2.student_name +" Roll-"+S2.student_roll +" "+S2.avg(marks2));
    
    System.out.println("Average marks of "+S3.student_name +" Roll-"+S3.student_roll +" "+S3.avg(marks3));

    }

    
}
