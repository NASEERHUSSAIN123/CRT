
// Least Common Multiple
public class LCM {
    public static int lcm(int a, int b) {
        return Math.abs(a * b) / (gcd(a, b));
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
           a = temp;    
         }
            return a;}

    public static void main(String args[]) {
        int a = 33;
        int b = 11;
        System.out.println("LCM:" + lcm(a, b));
    }
}