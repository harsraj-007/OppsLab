import java.util.*;
public class LAB3P3 {
    public static void main(String[] args){
        show(new int [] {10,20,30});

        
    }
    public static void show(int ... a){
        int count=0;
        for(int i:a){
            
            System.out.print(i+" ");
            count +=i;
            
        }
        System.out.println();
        System.out.println(a.length);
        System.out.println(count);

        
    }
}
