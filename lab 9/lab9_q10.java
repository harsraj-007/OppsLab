import java.util.*;

public class lab9_q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        String str3 = "";
        int n = str1.length(), m = str2.length();
        int flag1 = 0, flag2 = 0;

        for (int i = 0; i < n / 2; i++) {

            if (str1.charAt(i) != str1.charAt(n - 1 - i)) {
                System.out.println("Not a palindrome");
                flag1 = 1;
                break;
            }
        }
        if (flag1 == 0) {
            System.out.println("Its a palindrome");
        }

        for (int i = 0; i < m / 2; i++) {

            if (str2.charAt(i) != str2.charAt(m - 1 - i)) {
                System.out.println("Not a palindrome");
                flag2 = 1;
                break;
            }
        }
        if (flag2 == 0) {
            System.out.println("Its a palindrome");
        }

        str3 = str1 + str2;
        System.out.println(str3);
    }

}
