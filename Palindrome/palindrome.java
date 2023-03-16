
import java.util.*;

public class Main {
    static boolean Palindrome(int x) {
        int num = x;
        int rev = 0;
        int digit;
        while (x > 0) {
            digit = x % 10;
            rev = (rev * 10) + digit;
            x = x / 10;
        }
        if (num == rev) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        boolean ans = Palindrome(x);
        System.out.println(ans);
      
    }
}
