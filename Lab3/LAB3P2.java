import java.util.*;
public class LAB3P2 {

    public static void main(String[] args){
        //Scanner sc = new Scanner(System.in);
        Bank B1 = new Bank();
        Bank B2 = new Bank("SBI",9);

    }

    static class Bank{
        String name;
        int age;
        Bank(){

        }
        Bank(String name, int age){
            this.name=name;
            this.age=age;
            int flag=0;

            for(int i=0; i<name.length();i++){
        
                if((name.charAt(i)>=97 && name.charAt(i)<=122) || (name.charAt(i)>=65 && name.charAt(i)<=90)){
                    flag++;
                    
                }
                else{
                    System.out.println("Invalid Name");
                    break;
                    
                }
            }
            if(flag==name.length()){
                System.out.println("Valid Name");
            }

            
            if(age>3 && age<15){
                System.out.println("Valid Age");
            }
            else{
                System.out.println("Invalid Age");
            }
        }
    }
    
}
