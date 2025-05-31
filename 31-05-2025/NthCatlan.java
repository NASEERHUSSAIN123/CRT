// Finding nth Catlan
public class NthCatlan {
    public static int fact(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }

    public static long formula(int n) {
        long result = fact(2 * n) / (fact(n + 1) * fact(n));
        return result;
    }

    public static void main(String args[]) {
        int n = 6;
        System.out.println(formula(n));
    }
}