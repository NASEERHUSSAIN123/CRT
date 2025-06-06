import java.util.*;

public class CoinChange {
    public static int coinChange(int coins[], int amount) {
        int l = coins.length;
        int dp[] = new int[amount + l];
        Arrays.fill(dp, amount + l);
        dp[0] = 0; // Base case
        for (int i = 1; i <= amount; i++) {
            for (int coin : coins) {
                if (coin <= i)
                    dp[i] = Math.min(dp[i], dp[i - coin + 1]);
            }
        }
        return dp[amount] > amount ? -1 : dp[amount];
    }

    public static void main(String args[]) {
        int coins[] = { 1, 2, 5 };
        int amount = 11;
        System.out.println(coinChange(coins, amount));
    }
}