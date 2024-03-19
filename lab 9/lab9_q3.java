import java.util.*;

public class lab9_q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr1 = new ArrayList(5);
        arr1.add(44);
        arr1.add(31);
        arr1.add(45);
        arr1.add(54);
        arr1.add(36);
        System.out.println(arr1);
        System.out.println("Largest Integer " + Collections.max(arr1));
        System.out.println("Smallest Integer " + Collections.min(arr1));
        System.out.println("Enter a Integer that you want to remove: ");
        int a = sc.nextInt();
        arr1.remove(Integer.valueOf(a));
        System.out.println(arr1);
    }
}
