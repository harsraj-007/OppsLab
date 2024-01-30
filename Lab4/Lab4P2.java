import java.util.*;

class Car{
    private String brand ="Ford";

    public String getBrand() {
        return brand;
    }
}

public class Lab4P2 {
    
    public static void main(String[] args){

        Car C1 = new Car();
        
        System.out.println(C1.getBrand());

        String str = C1.getBrand();

        System.out.println(str);

    }
}
