public class MissNumber {
    public static int MissingNumber(int[] nums) {
        int l = nums.length;
        int XOR = 0;
        int XOR1 = 0;
        for (int i = 0; i < l; i++) {
            XOR = XOR ^ (nums[i]);
        }
        for (int i = 0; i < l; i++) {
            XOR1 = XOR1 ^ i;
        }
        return XOR ^ XOR1;
    }

    public static void main(String args[]) {
        int nums[] = { 6, 3, 2, 0, 4, 5 };
        System.out.println(MissingNumber(nums));
    }
}