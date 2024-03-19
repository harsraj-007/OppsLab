import java.util.*;

public class lab9_q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr1 = new ArrayList(5);
        arr1.add(2);
        arr1.add(3);
        arr1.add(4);
        arr1.add(5);
        arr1.add(6);
        ArrayList<Integer> arr2 = new ArrayList(5);
        arr2.add(2);
        arr2.add(3);
        arr2.add(4);
        arr2.add(5);
        arr2.add(6);

        if (arr1.equals(arr2)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        ArrayList<Integer> arr3 = new ArrayList();
        arr3.addAll(arr1);
        arr3.addAll(arr2);
        System.out.println(arr3);

        System.out.println("Enter a integer: ");
        int x = sc.nextInt();
        System.out.println(arr3.contains(x));

    }
}
