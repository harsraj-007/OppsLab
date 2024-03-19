import java.util.*;

public class lab9_q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        int flag = 0;

        char ch1[] = str1.toCharArray();
        Arrays.sort(ch1);
        char ch2[] = str2.toCharArray();
        Arrays.sort(ch2);
        System.out.println(ch1);
        System.out.println(ch2);

        for (int i = 0; i < str1.length(); i++) {
            if (ch1[i] != ch2[i]) {
                System.out.println("NOT an anagram");
                flag = 1;
                break;
            }
        }
        if (flag == 0) {
            System.out.println("YES its an anagram");
        }

    }
}
