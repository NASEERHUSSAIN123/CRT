public class TotalWrappers {
    public static int totalWrappers(int choc, int wrappers) {
        int total = choc + wrappers;
        int days = choc;
        while (total >= 7) {
            int new_total = total / 7;
            days = days + new_total;
            total = new_total + (total % 7);
        }
        return days;
    }

    public static void main(String args[]) {
        int choc = 0;
        int wrappers = 21;
        System.out.println(totalWrappers(choc, wrappers));
    }
}