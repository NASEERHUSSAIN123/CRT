import java.util.*;

public class EvenOddSort {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int low = 0, mid = 0;
        while (mid < arr.length) {
            if (arr[mid] % 2 == 1) {
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
            }
            mid++;
        }
        for (int num : arr) {
            System.out.print(num + " ");
        }
        sc.close();
    }
}