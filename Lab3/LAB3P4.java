import java.util.*;
public class LAB3P4 {
    public static void main(String[] args){
        alpha(new String[]{"hi","harsh","bye"});
         
    }
    public static void alpha(String[] str){
        for(int i=0; i<str.length;i++){
            System.out.print(str[i]+" ");
            System.out.print(str[i].length()+" ");
            System.out.print(str[i].toUpperCase()+" ");
            System.out.println();
        }
    }
   
}
