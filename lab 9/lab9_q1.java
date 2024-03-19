import java.util.*;

public class lab9_q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the no of elements: ");
        // int n = sc.nextInt();

        // ArrayList<Integer> arr = new ArrayList(n);

        // for (int i = 0; i < n; i++) {
        // int x = sc.nextInt();
        // arr.add(x);
        // }

        // System.out.println(arr);

        // arr.add(0, 10);

        // System.out.println(arr);
        // arr.remove(2);
        // System.out.println(arr);

        // Collections.sort(arr);
        // System.out.println(arr);

        ArrayList<String> str = new ArrayList<>();

        str.add("up?");
        str.add("Hey");
        str.add("What's");
        System.out.println(str);
        Collections.sort(str);
        System.out.println(str);

        str.add(1, "Harsh");
        System.out.println(str);
        str.remove(1);
        System.out.println(str);
    }
}