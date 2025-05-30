import java.util.*;

public class Memorization {
    public static int TopDown(int n, int dp[]) {
        if (n <= 1) {
            return n;
        }
        if (dp[n] != -1) {
            return dp[n];
        }
        return dp[n] = TopDown(n - 1, dp) + TopDown(n - 2, dp);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int dp[] = new int[n + 1];
        Arrays.fill(dp, -1);
        System.out.println(TopDown(n, dp));
        sc.close();
    }
}