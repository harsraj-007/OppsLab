import java.util.*;
public class LAB3P1{


    public static void main(String[] args){
        circle c1 = new circle(10);
        area A1 = new area(10);
        area A2 = new area(10,20);
    }
}

class circle{
    float r;
    circle(float r){
        this.r=r;
        double area=3.14*r*r;
        double circumference =2*3.14*r;
        System.out.println(area+" "+circumference);
    }

}

class area{
    int l;
    int b;
    area(int l){
        this.l=l;
        int areaOfSq=l*l;
        System.out.println("Area of Square: "+areaOfSq);
    }

    area(int l,int b){
        this.l=l;
        this.b=b;
        int areaOfRect=l*b;
        System.out.println("Area of React: "+areaOfRect);
    }

}