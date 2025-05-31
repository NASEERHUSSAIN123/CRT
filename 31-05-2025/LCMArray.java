// LCM in array
public class LCMArray {
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int lcm(int a, int b) {
        return Math.abs(a * b) / (gcd(a, b));
    }

    public static int lcmArray(int arr[]) {
        if (arr.length == 0)
            return 0;
        int result = arr[0];
        for (int i = 0; i < arr.length; i++) {
            result = result + lcm(result, arr[i]);
        }
        return result;
    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4 };
        System.out.println(lcmArray(arr));
    }
}