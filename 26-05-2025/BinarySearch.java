import java.util.*;

/* 
class BinarySearch {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int pos = binarysearch(arr, target);
        if (pos == -1) {
            System.out.println("Value is not found");
        } else {
            System.out.println("Value is found at the position " + pos);
        }
        sc.close();
    }

    public static int binarysearch(int arr[], int target) {
        int low = 0, high = arr.length;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}
*/
public class BinarySearch {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int pos = binarysearch(arr, target, 0, n - 1);
        if (pos == -1) {
            System.out.println("Value not found!");
        } else {
            System.out.println("Value is found at the position " + pos);
        }
        sc.close();
    }

    public static int binarysearch(int arr[], int target, int low, int high) {
        if (low > high) {
            return -1;
        } else {
            int mid = (low + high) / 2;
            if (arr[mid] > target) {
                return binarysearch(arr, target, low, mid - 1);
            } else if (arr[mid] < target) {
                return binarysearch(arr, target, mid + 1, high);
            } else {
                return mid;
            }
        }
    }
}