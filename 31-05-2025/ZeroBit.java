import java.util.*;

public class ZeroBit {
    public static int zerobit(int n) {
        int count = 0;
        while (n > 0) {
            n = n & (n - 1);
            count += 1;
        }
        return count;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(zerobit(n));
        sc.close();
    }
}