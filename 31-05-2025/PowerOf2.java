import java.util.*;

public class PowerOf2 {
    public static boolean powerof2(int n) {
        if (n <= 0) {
            return false;
        }
        return (n & (n - 1)) == 0;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (powerof2(n)) {
            System.out.println("The " + n + " is power of 2");
        } else {
            System.out.println("The " + n + " is not power of 2");
        }
        sc.close();
    }
}