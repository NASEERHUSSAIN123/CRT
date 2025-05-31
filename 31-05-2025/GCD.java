// Greatest Common Divisor
// Euclidean Formula
public class GCD {
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Recursions
    public static int gcd1(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd1(b, a % b);
    }

    public static void main(String args[]) {
        int a = 33;
        int b = 11;
        System.out.println(gcd1(a, b));
    }
}