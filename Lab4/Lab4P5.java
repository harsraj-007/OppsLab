class Area{
    int length;
    int breadth;

    Area(int ...a){
        if(a.length==0){
            length=0;
        }
        if(a.length==1){
            length=a[0];
        }
        if(a.length==2){
            length=a[0];
            breadth=a[1];
        }
    }

}
public class Lab4P5 {
    public static void main(String[] args) {

        Area A1 = new Area(10);
        Area A2 = new Area(10,20);
        Area A3 = new Area();
        
        System.out.println("Area of square: "+(A1.length*A1.length));

        System.out.println("Area of rectangle: "+(A2.length*A2.breadth));

        System.out.println(A3.length);

    }    
}
