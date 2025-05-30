import java.util.*;

public class Fibonnaci {
    public int Fib(int n) {
        if (n < 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return Fib(n - 1) + Fib(n - 2);
        }
    }

    public static void main(String args[]) {
        Fibonnaci fib = new Fibonnaci();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(fib.Fib(n));
        sc.close();
    }
}