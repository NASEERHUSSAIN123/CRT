
// Prime numbers range 1 to n
import java.util.*;

public class PrimeNumbers {
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int count = 0;
        for (int i = m; i <= n; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        System.out.printf("No. of prime numbers berween %d and %d is %d", m, n, count);
        sc.close();
    }
}