public class FasSlowPointer {
    static int slowfast(int[] arr) {
        int slow = 0;
        int fast = 0;
        int l = arr.length;
        while (fast < l && fast + 1 < l) {
            slow++;
            fast += 2;

        }
        return arr[slow];

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        System.out.println(slowfast(arr));
    }
}