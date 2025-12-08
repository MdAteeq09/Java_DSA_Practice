public class thirdMinNumber {
    public static int thirdMax(int[] nums) {
        long first = Long.MIN_VALUE;
        long second = Long.MIN_VALUE;
        long third = Long.MIN_VALUE;

        for (int num : nums) {
            long n = num;
            if (n == first || n == second || n == third) continue;

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

        return third == Long.MIN_VALUE ? (int) first : (int) third;
    }
    public static void main(String[] args) {
        int nums[] = {2,2,3,1};
        System.out.println(thirdMax(nums));
    }
}
