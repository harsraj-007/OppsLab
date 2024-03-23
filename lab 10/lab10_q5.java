public class lab10_q5 {
    public static void Method1(int x) {
        if (x < 0) {
            throw new IllegalArgumentException("Age should be > 18");
        } else {
            System.out.println("Age is fine");
        }
    }

    public static void main(String[] args) {
        try {
            try {
                try {
                    Method1(-1);
                    int arr[] = { 1, 2, 3 };
                    System.out.println(arr[4]);
                } catch (ArithmeticException e) {
                    System.out.println(e.getMessage());
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("array size problem");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
