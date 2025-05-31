// Catlan using Recursion
public class CatlanRec {
    public static int Catlan(int n) {
        if (n <= 1)
            return 1;
        int result = 0;
        for (int i = 0; i < n; i++) {
            result += Catlan(i) * Catlan(n - i - 1);
        }
        return result;
    }

    public static void main(String args[]) {
        int n = 6;
        System.out.println(Catlan(n));
    }
}