public class gcd {
    public static int findGCD(int[] nums) {
        int min = nums[0];
        int max = nums[0];

        for(int i=1; i<nums.length; i++) {
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
        }
        return gcd(min, max);
    }

    public static int gcd(int a, int b){
        if(b == 0){
            return a;
        }
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        int arr[] = {3,3};
        findGCD(arr);
    }
}
