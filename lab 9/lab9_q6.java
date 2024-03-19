import java.util.*;

public class lab9_q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String str2 = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != '0') {
                str2 += str.charAt(i);
            }
        }
        System.out.println(str2);
    }
}
