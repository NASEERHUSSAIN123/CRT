import java.util.*;

public class TernerySearch {
    static int ternerysearch(int arr[], int target) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid1 = low + (high - low) / 3;
            int mid2 = (high - low) / 3;
            if (arr[mid1] == target)
                return mid1;
            if (arr[mid2] == target)
                return mid2;
            if (target < arr[mid1])
                high = mid1 - 1;
            else if (target > arr[mid2])
                low = mid2 + 1;

            else {
                low = mid2 + 1;
                high = mid2 - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int result = ternerysearch(arr, target);
        if (result != -1)
            System.out.println("elements found at" + result);
        else
            System.out.println("not found");
        sc.close();
    }
}