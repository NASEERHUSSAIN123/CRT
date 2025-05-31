import java.util.*;

public class CheckingTheBit {
    public static boolean checkingthebit(int n, int k) {
        return (n & (1 << k)) != 0;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        if (checkingthebit(n, k)) {
            System.out.println("The number is a set bit");
        } else {
            System.out.println("The number is a unseen bit");
        }
        sc.close();
    }
}