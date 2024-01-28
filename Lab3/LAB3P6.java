public class LAB3P6 {
    public static void main(String[] args){
        beta B1 = new beta(10);
        beta B2 = new beta(20.0);
    }
    static class beta{
        double a;

        beta(double a){
            this.a=a;
            System.out.println(a);
        }

        beta(int a){
            this.a=a;
            System.out.println(a);
        }
    }
}
