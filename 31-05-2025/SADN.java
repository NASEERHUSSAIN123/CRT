
// Sum of All Digits in a number
import java.util.*;

public class SADN {
    public static long sadn(long number) {
        long sum = 0;
        while (number > 0) {
            sum = sum + number % 10;
            number /= 10;
        }
        return sum;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(sadn(n));
        sc.close();
    }
}