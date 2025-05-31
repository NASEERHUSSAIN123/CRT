
// Sum of all Digits in a Number till One Digit place
import java.util.*;

public class SADNOD {
    public static long sadnod(long n) {
        long sum = 0;
        while (n > 0) {
            sum = sum + n % 10;
            n /= 10;
        }
        long temp = 0;
        while (sum > 0) {
            temp = temp + sum % 10;
            sum /= 10;
        }
        return temp;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(sadnod(n));
        sc.close();
    }
}