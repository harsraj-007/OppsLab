import java.util.*;

public class lab9_q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = "";
        for (int i = str1.length() - 1; i >= 0; i--) {
            str2 = str2 + str1.charAt(i);
        }
        System.out.println(str2);
    }
}
