public class MaximumSubArraySum {
    static int MaxSubArraySum(int arr[], int k) {
        int l = arr.length;
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum = arr[i];
        }
        int maxSum = sum;
        for (int i = k; i < l; i++) {
            sum = sum + (arr[i] - arr[i - k]);
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }

    public static void main(String args[]) {
        int arr[] = { 25, 13, 9, 16, 18, 35, 45, 41 };
        int k = 4;
        System.out.println(MaxSubArraySum(arr, k));
    }
}