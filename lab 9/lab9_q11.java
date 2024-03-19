import java.util.*;

public class lab9_q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        String str3 = sc.next();
        int n = str3.length();

        System.out.println((str1.substring(str1.length() - 1 - n)).contains(str3));
        System.out.println((str2.substring(str2.length() - 1 - n)).contains(str3));
    }
}
