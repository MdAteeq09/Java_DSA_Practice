public class thirdMinNumber {
    public int thirdMax(int[] nums) {
        long first = Long.MIN_VALUE;
        long second = Long.MIN_VALUE;
        long third = Long.MIN_VALUE;

        for (int num : nums) {
            long n = num;

            // skip duplicates
            if (n == first || n == second || n == third) continue;

            // update top 3 values
            if (n > first) {
                third = second;
                second = first;
                first = n;
            } else if (n > second) {
                third = second;
                second = n;
            } else if (n > third) {
                third = n;
            }
        }

        // if third max doesn't exist, return first (max)
        return third == Long.MIN_VALUE ? (int) first : (int) third;
    }
    public static void main(String[] args) {
        int nums[] = {2,2,3,1};
    }
}
