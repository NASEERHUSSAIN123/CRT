import java.util.*;

public class BinomailCoefficient {
    public static int fact(int n, int k) {
        int fact1 = 1, fact2 = 1, fact3 = 1;
        for (int i = 1; i <= n; i++) {
            fact1 *= i;
        }
        for (int i = 1; i <= (n - k); i++) {
            fact2 *= i;
        }
        for (int i = 1; i <= k; i++) {
            fact3 *= i;
        }
        return fact1 / (fact2 * fact3);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        if (n < k) {
          System.out.println("The value of k should be less than n"); 
        } 
        else
        {
            System.out.println("The binomial coefficient " + fact(n, k));
        }
        sc.close();
    }
}