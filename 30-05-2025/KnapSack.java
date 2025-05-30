public class KnapSack {
    public static int kanpsack(int ca, int weights[], int values[], int n) {
        int dp[][] = new int[n + 1][ca + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= ca; j++) {
                if (weights[i - 1] <= j) {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - weights[i - 1]] + values[i - 1]);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[n][ca];
    }

    public static void main(String args[]) {
        int cap = 5;
        int weight[] = { 1, 2, 3 };
        int values[] = { 10, 20, 25 };
        int n = values.length;
        System.out.println(kanpsack(cap, weight, values, n));
    }
}